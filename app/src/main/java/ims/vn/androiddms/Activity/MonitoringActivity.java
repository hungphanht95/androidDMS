package ims.vn.androiddms.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import ims.vn.androiddms.Adapter.PaperAdapter;
import ims.vn.androiddms.Fragment.MapFragment;
import ims.vn.androiddms.Fragment.StaffFragment;
import ims.vn.androiddms.MainActivity;
import ims.vn.androiddms.R;

public class MonitoringActivity extends FragmentActivity {
    PaperAdapter paperAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ImageView imgvBack;
//    private int requesetDirect;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_monitoring);
        addControls();
        addEvents();
    }
    private void setupViewPager(ViewPager viewPager) {
        paperAdapter = new PaperAdapter(getSupportFragmentManager());
        paperAdapter.addFragment(new StaffFragment());
        paperAdapter.addFragment(new MapFragment());
        viewPager.setAdapter(paperAdapter);
//        viewPager.setCurrentItem(1);
    }
    private void addControls() {

        viewPager = (ViewPager) findViewById(R.id.vpMonitoring);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tab_Monitoring);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText(R.string.danhsach);
        tabLayout.getTabAt(1).setText(R.string.map);
    }

    private void addEvents() {
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if(position == 0){
                    tabLayout.getTabAt(0).setText(R.string.danhsach);
                }
                if(position == 1){
                    tabLayout.getTabAt(1).setText(R.string.map);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tabLayout.getTabAt(0).setText(R.string.danhsach);
                tabLayout.getTabAt(1).setText(R.string.map);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        imgvBack = (ImageView) findViewById(R.id.btnBack);
        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MonitoringActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void onBackPressed(){
        finish();
    }
    public void onSuperBackPressed(){
        super.onBackPressed();
    }


}
