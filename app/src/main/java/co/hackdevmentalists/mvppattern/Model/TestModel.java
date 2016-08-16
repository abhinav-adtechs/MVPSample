package co.hackdevmentalists.mvppattern.Model;

import co.hackdevmentalists.mvppattern.ApplicationInterfaces.ProvidedModelOps;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredPresenterOps;


public class TestModel implements ProvidedModelOps {

    private RequiredPresenterOps requiredPresenterOps ;

    public TestModel(RequiredPresenterOps requiredPresenterOps) {
        this.requiredPresenterOps = requiredPresenterOps;
    }


}
