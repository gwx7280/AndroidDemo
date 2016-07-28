package jimmy.com.androiddemo;

import android.app.Application;

import jimmy.com.androiddemo.mvp.injector.component.AppComponent;
import jimmy.com.androiddemo.mvp.injector.component.DaggerAppComponent;
import jimmy.com.androiddemo.mvp.injector.module.AppModule;

/**
 * Created by jimmypangpang on 16/7/22.
 */
public class DemoApplication extends Application{

    private static DemoApplication demoApplication;

    private AppComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        demoApplication = this;
        mApplicationComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static DemoApplication getInstance(){
        return demoApplication;
    }


}
