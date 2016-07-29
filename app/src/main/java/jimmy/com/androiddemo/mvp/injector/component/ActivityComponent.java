package jimmy.com.androiddemo.mvp.injector.component;

import android.app.Activity;


import dagger.Component;
import jimmy.com.androiddemo.mvp.injector.ContextLife;
import jimmy.com.androiddemo.mvp.injector.PerActivity;
import jimmy.com.androiddemo.mvp.injector.module.ActivityModule;
import jimmy.com.androiddemo.view.base.BaseActivity;
import jimmy.com.androiddemo.view.base.BaseFragmentActivity;

/**
 * Created by jimmypangpang on 16/7/29.
 */
@PerActivity
@Component(modules = ActivityModule.class,dependencies = AppComponent.class)
public interface ActivityComponent {

    @ContextLife("Activity")
    Activity getActivity();

    void inject(BaseActivity baseActivity);

    void inject(BaseFragmentActivity baseFragmentActivity);
}
