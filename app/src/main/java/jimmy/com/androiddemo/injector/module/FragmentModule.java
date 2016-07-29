package jimmy.com.androiddemo.injector.module;

import android.app.Fragment;

import dagger.Module;

/**
 * Created by jimmypangpang on 16/7/29.
 */
@Module
public class FragmentModule {
    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        this.mFragment = fragment;
    }



}
