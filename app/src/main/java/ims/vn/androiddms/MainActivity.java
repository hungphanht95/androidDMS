package ims.vn.androiddms;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import ims.vn.androiddms.Activity.MonitoringActivity;
import ims.vn.androiddms.Activity.VisitActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnViengTham, btnGiamSat, btnOrder, btnTimekeeping, btnWork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        btnViengTham = (LinearLayout) findViewById(R.id.btnViengTham);
        btnGiamSat = (LinearLayout) findViewById(R.id.btnMonitoring);
        btnOrder = (LinearLayout) findViewById(R.id.btnOrder);
        btnTimekeeping = (LinearLayout) findViewById(R.id.btnTimekeeping);
        btnWork = (LinearLayout) findViewById(R.id.btnWork);
        moveActivity();
    }

    public void moveActivity() {
        btnViengTham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VisitActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnGiamSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MonitoringActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnTimekeeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiaLogUpdate(MainActivity.this);
            }
        });
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiaLogUpdate(MainActivity.this);
            }
        });
        btnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiaLogUpdate(MainActivity.this);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    public void DiaLogUpdate(Activity activity) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(activity);
        dialog.setTitle("Thông báo");
        dialog.setMessage("Chức năng đang được update");
        dialog.setCancelable(true);
        dialog.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.create();
        dialog.show();
    }
}
