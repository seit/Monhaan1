package techium.hatenablog.com.monhaan1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import techium.hatenablog.com.monhaan1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binder = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Hanter hanter = new Hanter("ハンタくん", "MAN");
        binder.setHanter(hanter);
    }
}
