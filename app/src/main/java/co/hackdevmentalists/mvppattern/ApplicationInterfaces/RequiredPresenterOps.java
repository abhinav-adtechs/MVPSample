package co.hackdevmentalists.mvppattern.ApplicationInterfaces;


import android.content.Context;

import co.hackdevmentalists.mvppattern.Model.ContentObject;

public interface RequiredPresenterOps {

    Context getAppContext() ;
    Context getActivityContext() ;

    void fromModelToPresenter(ContentObject contentObject) ;
}
