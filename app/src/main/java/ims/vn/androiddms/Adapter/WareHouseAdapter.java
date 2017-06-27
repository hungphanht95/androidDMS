package ims.vn.androiddms.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

import ims.vn.androiddms.R;
import ims.vn.androiddms.model.WareHouse;

/**
 * Created by phong on 6/24/2017.
 */

public class WareHouseAdapter extends ArrayAdapter<WareHouse> {
    private Activity context;
    private ArrayList<WareHouse> arr;
    private int idLayout;
    TextView txtKho;
    RadioButton rbCheck;

    public WareHouseAdapter(Activity context, int idLayout, ArrayList<WareHouse> arr) {
        super(context, idLayout,arr);
        this.context = context;
        this.idLayout = idLayout;
        this.arr = arr;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = this.context.getLayoutInflater().inflate(idLayout, null);
        txtKho = (TextView) convertView.findViewById(R.id.txtKho);
        rbCheck = (RadioButton) convertView.findViewById(R.id.rbcheck);

        txtKho.setText(arr.get(position).getWarehouse());
        return convertView;
    }
}
