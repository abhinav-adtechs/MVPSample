package co.hackdevmentalists.mvppattern.View;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.ProvidedPresenterOps;
import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredViewOps;
import co.hackdevmentalists.mvppattern.Model.ContentObject;
import co.hackdevmentalists.mvppattern.Model.TestModel;
import co.hackdevmentalists.mvppattern.Presenter.MainActivityPresenter;
import co.hackdevmentalists.mvppattern.R;

public class MainActivity extends AppCompatActivity implements RequiredViewOps {

    ProvidedPresenterOps presenterOps ;

    @BindView(R.id.main_tv_header)
    TextView tvHeader ;
    @BindView(R.id.main_tv_desc)
    TextView tvDescription ;
    @BindView(R.id.main_et_header)
    EditText etHeader ;
    @BindView(R.id.main_et_desc)
    EditText etDescription ;
    @BindView(R.id.main_btn_modify)
    Button btnModify ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        setupMVP() ;
        passData() ;
    }

    private void setupMVP() {
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this) ;
        TestModel testModel = new TestModel(mainActivityPresenter) ;

        mainActivityPresenter.setModel(testModel);

        presenterOps = mainActivityPresenter ;

    }

    @OnClick(R.id.main_btn_modify)
    void passData() {
        presenterOps.fromActivityToPresenter(new ContentObject(etHeader.getText().toString(), etDescription.getText().toString()));

    }

    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }

    @Override
    public Context getActivityContext() {
        return this;
    }

    @Override
    public void notifyModifications(ContentObject contentObject) {
        tvHeader.setText(contentObject.getHeader());
        tvDescription.setText(contentObject.getDescription());
    }
}
