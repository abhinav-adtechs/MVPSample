package co.hackdevmentalists.mvppattern.View;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredViewOps;
import co.hackdevmentalists.mvppattern.Model.TestModel;
import co.hackdevmentalists.mvppattern.Presenter.MainActivityPresenter;
import co.hackdevmentalists.mvppattern.R;

public class MainActivity extends AppCompatActivity implements RequiredViewOps {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMVP() ;
    }

    private void setupMVP() {
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this) ;
        TestModel testModel = new TestModel(mainActivityPresenter) ;

    }

    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }

    @Override
    public Context getActivityContext() {
        return this;
    }


}
