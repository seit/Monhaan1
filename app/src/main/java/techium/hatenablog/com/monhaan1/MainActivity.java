package techium.hatenablog.com.monhaan1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import techium.hatenablog.com.monhaan1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Hanter hanter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binder = DataBindingUtil.setContentView(this, R.layout.activity_main);
        hanter = new Hanter("ハンタくん", "MAN");
        binder.setHanter(hanter);

        binder.btnChangeGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hanter.setGender("WOMAN");
            }
        });
    }

//    public View.OnClickListener changeGenderListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
//            hanter.setGender("woman");
//        }
//    };
}