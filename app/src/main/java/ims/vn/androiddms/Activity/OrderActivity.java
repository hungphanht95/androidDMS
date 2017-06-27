package ims.vn.androiddms.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import ims.vn.androiddms.Adapter.WareHouseAdapter;
import ims.vn.androiddms.R;
import ims.vn.androiddms.model.WareHouse;

/**
 * Created by Deleting on 6/24/2017.
 */

public class OrderActivity extends AppCompatActivity {

    WareHouseAdapter wareHouseAdapter;
    LinearLayout btnThemSp,btnShowdialog;
    TextView txtShowWareHouse;
    ListView lvKho;
    ArrayList<WareHouse> arr;
    Dialog dialogOrder;
    ImageView imgvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_visit_order);
        txtShowWareHouse = (TextView) findViewById(R.id.txtShowKho);
        btnThemSp = (LinearLayout) findViewById(R.id.btnThemsp);
        btnThemSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, ProductActivity.class);
                startActivity(intent);
                finish();
            }
        });
        imgvBack = (ImageView) findViewById(R.id.btnBack);
        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this,VisitActivity.class);
                startActivity(intent);
                finish();
            }
        });

        dialogOrder();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(OrderActivity.this,VisitActivity.class);
        startActivity(intent);
        finish();
    }

    public void dialogOrder() {
        dialogOrder = new Dialog(OrderActivity.this);
        dialogOrder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogOrder.getWindow().setBackgroundDrawableResource(R.color.tran);
        dialogOrder.setContentView(R.layout.dialog_order);
        arr = new ArrayList<WareHouse>();
        lvKho = (ListView) dialogOrder.findViewById(R.id.lv_dialog_order);
        wareHouseAdapter = new WareHouseAdapter(this, R.layout.item_list_dialog_order, createData());
        lvKho.setAdapter(wareHouseAdapter);
        wareHouseAdapter.notifyDataSetChanged();
        btnShowdialog = (LinearLayout) findViewById(R.id.btnShowdialog);
        btnShowdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogOrder.show();
            }
        });
        lvKho.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialogOrder.cancel();
            }
        });

    }
    public ArrayList<WareHouse> createData(){
        arr.add(new WareHouse("Chọn kho"));
        arr.add(new WareHouse("Kho TPHCM"));
        arr.add(new WareHouse("Kho Đà Nẵng"));
        arr.add(new WareHouse("Kho Nha Trang"));
        arr.add(new WareHouse("Kho Hà Nội"));
        return arr;
    }
}
