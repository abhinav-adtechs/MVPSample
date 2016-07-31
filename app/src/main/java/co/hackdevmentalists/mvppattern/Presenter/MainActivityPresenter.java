package co.hackdevmentalists.mvppattern.Presenter;


import android.content.Context;

import java.lang.ref.WeakReference;

import co.hackdevmentalists.mvppattern.ApplicationInterfaces.ProvidedPresenterOps;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredPresenterOps;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredViewOps;

public class MainActivityPresenter implements ProvidedPresenterOps, RequiredPresenterOps {

    private WeakReference<RequiredViewOps> mainActivityView ;



    @Override
    public Context getAppContext() {
        return null;
    }

    @Override
    public Context getActivityContext() {
        return null;
    }
}
