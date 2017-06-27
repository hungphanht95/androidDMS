package ims.vn.androiddms.Activity;

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

import ims.vn.androiddms.Adapter.ProductAdapter;
import ims.vn.androiddms.R;
import ims.vn.androiddms.custom.RecyclerItemClickListener;
import ims.vn.androiddms.model.Product;

public class ProductActivity extends AppCompatActivity {

    ImageView imgvBack;
    RecyclerView recyclerView;
    ProductAdapter adapter;
    FloatingActionButton btnUpdate;
    private ArrayList<Product> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_product);
        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        recyclerView = (RecyclerView) findViewById(R.id.rcAddProduct);
        adapter = new ProductAdapter(createData());

        LinearLayoutManager layoutManager = new LinearLayoutManager(ProductActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever

                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                    }

                })
        );
        imgvBack = (ImageView) findViewById(R.id.btnBack);
        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductActivity.this,OrderActivity.class);
                startActivity(intent);
                finish();
            }
        });

        floatActionButton();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ProductActivity.this,OrderActivity.class);
        startActivity(intent);
        finish();
    }

    public void floatActionButton(){
        btnUpdate = (FloatingActionButton) findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
    public ArrayList<Product> createData(){
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        return data;
    }
}
