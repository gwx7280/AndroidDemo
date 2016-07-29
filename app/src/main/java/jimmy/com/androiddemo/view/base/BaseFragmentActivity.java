package jimmy.com.androiddemo.view.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import jimmy.com.androiddemo.DemoApplication;
import jimmy.com.androiddemo.injector.component.ActivityComponent;
import jimmy.com.androiddemo.injector.component.DaggerActivityComponent;
import jimmy.com.androiddemo.injector.module.ActivityModule;

/**
 * Created by jimmypangpang on 16/7/29.
 */
public class BaseFragmentActivity extends FragmentActivity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).appComponent(DemoApplication.getInstance().getmApplicationComponent()).build();
        activityComponent.inject(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        ButterKnife.bind(this);
    }
}
