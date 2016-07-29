package jimmy.com.androiddemo.view.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import jimmy.com.androiddemo.DemoApplication;
import jimmy.com.androiddemo.injector.component.DaggerServiceComponent;

/**
 * Created by jimmypangpang on 16/7/29.
 */
public class BaseService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerServiceComponent.builder().appComponent(DemoApplication.getInstance().getmApplicationComponent()).build().inject(this);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
