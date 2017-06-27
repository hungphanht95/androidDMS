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
import ims.vn.androiddms.Fragment.DebtFragment;
import ims.vn.androiddms.Fragment.OrderFragment;
import ims.vn.androiddms.Fragment.SellFragment;
import ims.vn.androiddms.R;

public class StatisticalActivity extends FragmentActivity {
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
        setContentView(R.layout.activity_statistical);
        addControls();
        addEvents();
    }

    private void setupViewPager(ViewPager viewPager) {
        paperAdapter = new PaperAdapter(getSupportFragmentManager());
        paperAdapter.addFragment(new DebtFragment());
        paperAdapter.addFragment(new OrderFragment());
        paperAdapter.addFragment(new SellFragment());
        viewPager.setAdapter(paperAdapter);
//        viewPager.setCurrentItem(1);
    }

    private void addControls() {

        viewPager = (ViewPager) findViewById(R.id.vpPager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.main_tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText(R.string.order);
        tabLayout.getTabAt(1).setText(R.string.seller);
        tabLayout.getTabAt(2).setText(R.string.debt);
    }

    private void addEvents() {
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    tabLayout.getTabAt(0).setText(R.string.order);
                }
                if (position == 1) {
                    tabLayout.getTabAt(1).setText(R.string.seller);
                }
                if (position == 2) {
                    tabLayout.getTabAt(2).setText(R.string.debt);
                    ;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tabLayout.getTabAt(0).setText(R.string.order);
                tabLayout.getTabAt(1).setText(R.string.seller);
                tabLayout.getTabAt(2).setText(R.string.debt);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        imgvBack = (ImageView) findViewById(R.id.btnBack);
        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatisticalActivity.this, VisitActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
       super.onBackPressed();
        Intent intent = new Intent(StatisticalActivity.this, VisitActivity.class);
        startActivity(intent);
        finish();
    }


}
