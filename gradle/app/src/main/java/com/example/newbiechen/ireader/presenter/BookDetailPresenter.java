package com.test.xiaojian.simple_reader.presenter;

import android.util.Log;

import com.test.xiaojian.simple_reader.model.bean.BookChapterBean;
import com.test.xiaojian.simple_reader.model.bean.BookDetailBean;
import com.test.xiaojian.simple_reader.model.bean.CollBookBean;
import com.test.xiaojian.simple_reader.model.local.BookRepository;
import com.test.xiaojian.simple_reader.model.remote.RemoteRepository;
import com.test.xiaojian.simple_reader.presenter.contract.BookDetailContract;
import com.test.xiaojian.simple_reader.ui.base.RxPresenter;
import com.test.xiaojian.simple_reader.utils.LogUtils;
import com.test.xiaojian.simple_reader.utils.MD5Utils;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xiaojian on 17-5-4.
 */

public class BookDetailPresenter extends RxPresenter<BookDetailContract.View>
        implements BookDetailContract.Presenter{
    private static final String TAG = "BookDetailPresenter";
    private String bookId;

    @Override
    public void refreshBookDetail(String bookId) {
        this.bookId = bookId;
        refreshBook();
        refreshComment();
        refreshRecommend();

    }

    @Override
    public void addToBookShelf(CollBookBean collBookBean)  {
        Disposable disposable = RemoteRepository.getInstance()
                .getBookChapters(collBookBean.get_id())
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(
                        (d) -> mView.waitToBookShelf() //等待加载
                )
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        beans -> {

                            //设置 id
                            for(BookChapterBean bean :beans){
                                bean.setId(MD5Utils.strToMd5By16(bean.getLink()));
                            }

                            //设置目录
                            collBookBean.setBookChapters(beans);
                            //存储收藏
                            BookRepository.getInstance()
                                    .saveCollBookWithAsync(collBookBean);

                            mView.succeedToBookShelf();
                        }
                        ,
                        e -> {
                            mView.errorToBookShelf();
                            LogUtils.e(e);
                        }
                );
        addDisposable(disposable);
    }

    private void refreshBook(){
        RemoteRepository
                .getInstance()
                .getBookDetail(bookId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<BookDetailBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onSuccess(BookDetailBean value){
                        mView.finishRefresh(value);
                        mView.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError();
                    }
                });
    }

    private void refreshComment(){
        Disposable disposable = RemoteRepository
                .getInstance()
                .getHotComments(bookId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (value) -> mView.finishHotComment(value)
                );
        addDisposable(disposable);
    }

    private void refreshRecommend(){
        Disposable disposable = RemoteRepository
                .getInstance()
                .getRecommendBookList(bookId,3)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (value) -> mView.finishRecommendBookList(value)
                );
        addDisposable(disposable);
    }
}
