package jimmy.com.androiddemo.mvp.injector.component;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import jimmy.com.androiddemo.DemoApplication;
import jimmy.com.androiddemo.mvp.injector.ContextLife;
import jimmy.com.androiddemo.mvp.injector.module.AppModule;

/**
 * Created by jimmypangpang on 16/7/27.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @ContextLife("Application")
    Context getContext();

    void inject(DemoApplication demoApplication);
}
