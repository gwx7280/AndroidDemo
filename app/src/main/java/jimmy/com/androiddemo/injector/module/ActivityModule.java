package jimmy.com.androiddemo.injector.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import jimmy.com.androiddemo.injector.ContextLife;
import jimmy.com.androiddemo.injector.PerActivity;

/**
 * Created by jimmypangpang on 16/7/29.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity mActivity) {
        this.mActivity = mActivity;
    }

    @ContextLife("Activity")
    @Provides
    @PerActivity
    public Activity getActivity(){
        return mActivity;
    }

}
