package jimmy.com.androiddemo.butterknife;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;
import jimmy.com.androiddemo.R;
import jimmy.com.androiddemo.view.base.BaseActivity;

/**
 * Created by jimmypangpang on 16/7/29.
 */
public class ButterKnifeActivity extends BaseActivity {


    @BindView(value = R.id.butterknife_textview)
    private TextView textview;

    @BindView(value = R.id.butterknife_button)
    private Button button;


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.butterknife_activity);
    }

    @OnClick()
    public void onClick(View v){
        Toast.makeText(this,"哈哈哈，成功了",Toast.LENGTH_LONG).show();
    }


}
