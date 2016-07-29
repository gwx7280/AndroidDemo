package jimmy.com.androiddemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import jimmy.com.androiddemo.view.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @BindView(value = R.id.hello)
    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tag",hello==null?"null":"successed");
    }
}
