package ims.vn.androiddms.Adapter;

import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ims.vn.androiddms.R;
import ims.vn.androiddms.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.RecyclerViewHolder> {

    private ArrayList<Product> listData = new ArrayList<>();

    public ProductAdapter(ArrayList<Product> listData) {
        this.listData = listData;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemview = inflater.inflate(R.layout.item_recycle_product, parent, false);
        return new RecyclerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.txtTenSp.setText(listData.get(position).getTensp());
        holder.txtGiaChan.setText(listData.get(position).getGiachan());
        holder.txtGiaLe.setText(listData.get(position).getGiale());
        holder.txtTonChan.setText(listData.get(position).getTonchan());
        holder.txtTonLe.setText(listData.get(position).getTonle());
    }
    @Override
    public int getItemCount() {
        return listData.size();
    }
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtTenSp,txtGiaChan,txtGiaLe,txtTonChan,txtTonLe;
        AppCompatCheckBox cbCheck;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            cbCheck = (AppCompatCheckBox) itemView.findViewById(R.id.cbcheck);
            txtTenSp = (TextView) itemView.findViewById(R.id.txtTenSp);
            txtGiaChan = (TextView) itemView.findViewById(R.id.txtGiaChan);
            txtGiaLe = (TextView) itemView.findViewById(R.id.txtGiaLe);
            txtTonChan = (TextView) itemView.findViewById(R.id.txtTonChan);
            txtTonLe = (TextView) itemView.findViewById(R.id.txtTonLe);
        }

    }
}