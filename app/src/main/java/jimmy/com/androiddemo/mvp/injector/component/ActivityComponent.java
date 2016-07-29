package jimmy.com.androiddemo.mvp.injector.component;

import javax.inject.Singleton;

import dagger.Component;
import jimmy.com.androiddemo.mvp.injector.PerActivity;
import jimmy.com.androiddemo.mvp.injector.module.ActivityModule;

/**
 * Created by jimmypangpang on 16/7/29.
 */
@PerActivity
@Component(modules = ActivityModule.class,dependencies = AppComponent.class)
public interface ActivityComponent {
}
