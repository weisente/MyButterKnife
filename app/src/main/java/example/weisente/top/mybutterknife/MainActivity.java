package example.weisente.top.mybutterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.BindView;

import example.weisente.top.butterknife.ButterKnife;
import example.weisente.top.butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

//    @
    @BindView(R.id.tv)
    TextView textView1;

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUnbinder = ButterKnife.bind(this);
        textView1.setText("测试");
    }
    @Override
    protected void onDestroy() {
        mUnbinder.unbind();
        super.onDestroy();
    }

}
