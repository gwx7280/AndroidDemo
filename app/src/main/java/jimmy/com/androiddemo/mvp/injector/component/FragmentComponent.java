package jimmy.com.androiddemo.mvp.injector.component;

import dagger.Component;
import jimmy.com.androiddemo.mvp.injector.PerService;
import jimmy.com.androiddemo.mvp.injector.module.AppModule;

/**
 * Created by jimmypangpang on 16/7/29.
 */
@PerService
@Component(modules = AppModule.class,dependencies = AppComponent.class)
public interface FragmentComponent {
}
