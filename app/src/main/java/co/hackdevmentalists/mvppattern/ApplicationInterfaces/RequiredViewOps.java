package co.hackdevmentalists.mvppattern.ApplicationInterfaces;


import android.content.Context;

import co.hackdevmentalists.mvppattern.Model.ContentObject;

public interface RequiredViewOps {

    Context getAppContext() ;
    Context getActivityContext() ;

    void notifyModifications(ContentObject contentObject) ;
}
