package jimmy.com.androiddemo.injector.component;

import dagger.Component;
import jimmy.com.androiddemo.injector.PerFragment;
import jimmy.com.androiddemo.injector.module.AppModule;
import jimmy.com.androiddemo.view.base.BaseFragment;

/**
 * Created by jimmypangpang on 16/7/29.
 */
@PerFragment
@Component(modules = AppModule.class,dependencies = AppComponent.class)
public interface FragmentComponent {
    void inject(BaseFragment baseFragment);
}
