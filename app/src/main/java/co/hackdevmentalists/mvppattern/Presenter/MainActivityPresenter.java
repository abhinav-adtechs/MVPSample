package co.hackdevmentalists.mvppattern.Presenter;


import android.content.Context;
import android.view.View;

import java.lang.ref.WeakReference;

import co.hackdevmentalists.mvppattern.ApplicationInterfaces.ProvidedModelOps;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.ProvidedPresenterOps;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredPresenterOps;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredViewOps;
import co.hackdevmentalists.mvppattern.Model.ContentObject;

public class MainActivityPresenter implements ProvidedPresenterOps, RequiredPresenterOps {

    private WeakReference<RequiredViewOps> mainActivityView ;
    private ProvidedModelOps modelOps ;
    private ContentObject contentObject ;

    public MainActivityPresenter(RequiredViewOps viewOps) {
        this.mainActivityView = new WeakReference<>(viewOps);
    }

    private RequiredViewOps getView() throws NullPointerException{
        if(mainActivityView != null){
            return mainActivityView.get() ;
        }else {
            throw new NullPointerException("View unavailable") ;
        }
    }

    @Override
    public Context getAppContext() {
        return null;
    }

    @Override
    public Context getActivityContext() {
        return null;
    }

    public void setModel(ProvidedModelOps modelOps) {
        this.modelOps = modelOps;
    }

    @Override
    public void fromActivityToPresenter(ContentObject contentObject) {
        this.contentObject = contentObject ;

        modelOps.fromPresenterToModel(contentObject);
    }

    @Override
    public void fromModelToPresenter(ContentObject contentObject) {
        getView().notifyModifications(contentObject);
    }
}
