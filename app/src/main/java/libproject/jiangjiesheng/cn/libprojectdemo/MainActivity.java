package libproject.jiangjiesheng.cn.libprojectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.jiangjiesheng.testandroidlib.libproject.TestModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestModule.testMethod();
    }
}
