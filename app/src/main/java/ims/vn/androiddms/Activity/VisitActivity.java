package ims.vn.androiddms.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;

import ims.vn.androiddms.Adapter.VisitAdapter;
import ims.vn.androiddms.MainActivity;
import ims.vn.androiddms.R;
import ims.vn.androiddms.model.Visit;

public class VisitActivity extends AppCompatActivity {

    ImageView imgvBack;
    RecyclerView recyclerView;
    VisitAdapter adapter;
    Dialog dialogVisit;
    FloatingActionButton btnShow,btnCancel;
    private ArrayList<Visit> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_visit);

        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        recyclerView = (RecyclerView) findViewById(R.id.rcVisit);
        adapter = new VisitAdapter(createData());

        LinearLayoutManager layoutManager = new LinearLayoutManager(VisitActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        dialogVisit = new Dialog(VisitActivity.this);
        dialogVisit.setCancelable(false);
        dialogVisit.setCanceledOnTouchOutside(false);
        dialogVisit.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogVisit.getWindow().setBackgroundDrawableResource(R.color.tran);
        dialogVisit.setContentView(R.layout.dialog_visit);
        dialogVisit.getWindow().getAttributes().verticalMargin = 1F;
        dialogVisit.getWindow().getAttributes().horizontalMargin = 1F;

        imgvBack = (ImageView) findViewById(R.id.btnBack);
        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VisitActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        floatActionButton();

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Intent intent = new Intent(VisitActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void floatActionButton(){
        btnShow = (FloatingActionButton) findViewById(R.id.btnShow);
        btnCancel = (FloatingActionButton) dialogVisit.findViewById(R.id.btnCancel);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogVisit.show();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogVisit.cancel();
            }
        });
    }
    public ArrayList<Visit> createData(){
        data.add(new Visit("chihoa-001","chihoa","gjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjkgjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkkjgggggg","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        data.add(new Visit("chihoa-001","chihoa","46-loc-thuduc-hochiminh-vietnam","0123445678"));
        return data;
    }
}
