package ims.vn.androiddms;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import ims.vn.androiddms.Activity.MonitoringActivity;
import ims.vn.androiddms.Activity.VisitActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnViengTham,btnGiamSat,btnCheckIn,btnChamCong,btnCongViec,btnDonHang;
    Animation slideLeft,slideLeftTwo,slideLeftThree,slideRight,slideRightTwo,slideRightThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        btnViengTham = (LinearLayout) findViewById(R.id.btnViengTham);
        btnGiamSat = (LinearLayout) findViewById(R.id.btnMonitoring);
        btnChamCong = (LinearLayout) findViewById(R.id.btnChamcong);
        btnCongViec = (LinearLayout) findViewById(R.id.btnCongviec);
        btnDonHang = (LinearLayout) findViewById(R.id.btnDonhang);
        btnCheckIn = (LinearLayout) findViewById(R.id.btncheckin);
        slideLeft = AnimationUtils.loadAnimation(this,R.anim.slider_left);
        slideLeftTwo = AnimationUtils.loadAnimation(this,R.anim.slider_left_two);
        slideLeftThree = AnimationUtils.loadAnimation(this,R.anim.slider_left_three);
        slideRight = AnimationUtils.loadAnimation(this,R.anim.slider_right);
        slideRightTwo = AnimationUtils.loadAnimation(this,R.anim.slider_right_two);
        slideRightThree = AnimationUtils.loadAnimation(this,R.anim.slider_right_three);
        moveActivity();
        animation();
    }

    public void animation(){
        btnViengTham.startAnimation(slideLeft);
        btnCongViec.startAnimation(slideLeftTwo);
        btnChamCong.startAnimation(slideLeftThree);
        btnDonHang.startAnimation(slideRight);
        btnGiamSat.startAnimation(slideRightTwo);
        btnCheckIn.startAnimation(slideRightThree);
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
        btnDonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUpdate(MainActivity.this);
            }
        });
        btnCongViec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUpdate(MainActivity.this);
            }
        });
        btnChamCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUpdate(MainActivity.this);
            }
        });

    }

    public void DialogUpdate(Activity activity) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(activity);
        dialog.setTitle("thông báo");
        dialog.setMessage("Chức năng đang được phát triển.Bạn chờ nha!!!");
        dialog.setCancelable(true);
        dialog.setNegativeButton("oke", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.create();
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
