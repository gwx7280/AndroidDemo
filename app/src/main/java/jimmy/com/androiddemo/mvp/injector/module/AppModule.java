package jimmy.com.androiddemo.mvp.injector.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import jimmy.com.androiddemo.DemoApplication;
import jimmy.com.androiddemo.mvp.injector.ContextLife;

/**
 * Created by jimmypangpang on 16/7/27.
 */
@Module
public final class AppModule{


    DemoApplication mApplication;

    public AppModule(DemoApplication mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    @ContextLife("Application")
    public Context provideContext() {
        return mApplication.getApplicationContext();
    }
}
