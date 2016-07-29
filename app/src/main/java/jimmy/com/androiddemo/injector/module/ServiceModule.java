package jimmy.com.androiddemo.injector.module;

import android.app.Service;

import dagger.Module;
import dagger.Provides;
import jimmy.com.androiddemo.injector.PerService;

/**
 * Created by jimmypangpang on 16/7/29.
 */
@Module
public class ServiceModule {
    private Service mService;

    public ServiceModule(Service mService) {
        this.mService = mService;
    }

    @PerService
    @Provides
    public Service getService(){
        return mService;
    }
}
