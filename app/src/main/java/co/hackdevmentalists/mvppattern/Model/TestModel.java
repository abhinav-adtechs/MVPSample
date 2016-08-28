package co.hackdevmentalists.mvppattern.Model;

import co.hackdevmentalists.mvppattern.ApplicationInterfaces.ProvidedModelOps;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredPresenterOps;


public class TestModel implements ProvidedModelOps {

    private RequiredPresenterOps requiredPresenterOps ;
    private ContentObject contentObject ;

    public TestModel(RequiredPresenterOps requiredPresenterOps) {
        this.requiredPresenterOps = requiredPresenterOps;
    }

    @Override
    public void fromPresenterToModel(ContentObject contentObject) {
        this.contentObject = contentObject ;
        modifyContent();
    }

    private void modifyContent(){

        contentObject.setHeader(contentObject.getHeader() + " Mod");
        contentObject.setDescription(contentObject.getDescription() + " Mod");

        requiredPresenterOps.fromModelToPresenter(contentObject);
    }
}
