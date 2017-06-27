package ims.vn.androiddms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import ims.vn.androiddms.Activity.MonitoringActivity;
import ims.vn.androiddms.Activity.VisitActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnViengTham,btnGiamSat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        btnViengTham = (LinearLayout) findViewById(R.id.btnViengTham);
        btnGiamSat = (LinearLayout) findViewById(R.id.btnMonitoring);
        moveActivity();
    }

    public void moveActivity(){
        btnViengTham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,VisitActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnGiamSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonitoringActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
