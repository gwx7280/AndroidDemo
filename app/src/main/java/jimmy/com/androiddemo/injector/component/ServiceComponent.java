package jimmy.com.androiddemo.injector.component;

import dagger.Component;
import jimmy.com.androiddemo.injector.PerService;
import jimmy.com.androiddemo.injector.module.ServiceModule;
import jimmy.com.androiddemo.view.base.BaseService;

/**
 * Created by jimmypangpang on 16/7/29.
 */
@PerService
@Component(modules = ServiceModule.class,dependencies = AppComponent.class)
public interface ServiceComponent {
    void inject(BaseService baseService);
}
