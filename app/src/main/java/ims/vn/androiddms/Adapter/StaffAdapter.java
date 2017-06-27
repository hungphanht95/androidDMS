package ims.vn.androiddms.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ims.vn.androiddms.R;
import ims.vn.androiddms.model.ListStaff;

public class StaffAdapter extends RecyclerView.Adapter<StaffAdapter.RecyclerViewHolder> {

    private ArrayList<ListStaff> listData = new ArrayList<>();

    public StaffAdapter(ArrayList<ListStaff> listData) {
        this.listData = listData;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemview = inflater.inflate(R.layout.item_recycle_list_monitoring, parent, false);
        return new RecyclerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.txtTenNv.setText(listData.get(position).getTennv());
        holder.txtThoiGian.setText(listData.get(position).getThoigian());
        holder.txtKiemTra.setText(listData.get(position).getKiemtra());
        holder.txtThucHienVT.setText(listData.get(position).getThuchienvt());
        holder.txtKeHoachVT.setText(listData.get(position).getKehoachvt());
        holder.txtThucHienDH.setText(listData.get(position).getThuchiendh());
        holder.txtKeHoachDH.setText(listData.get(position).getKehoachdh());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtTenNv, txtThoiGian, txtKiemTra, txtKeHoachVT, txtThucHienVT, txtKeHoachDH, txtThucHienDH;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtTenNv = (TextView) itemView.findViewById(R.id.txtNameNv);
            txtThoiGian = (TextView) itemView.findViewById(R.id.txtThoiGian);
            txtKiemTra = (TextView) itemView.findViewById(R.id.txtKiemTra);
            txtKeHoachDH = (TextView) itemView.findViewById(R.id.txtDonHangKeHoach);
            txtThucHienDH = (TextView) itemView.findViewById(R.id.txtDonHangThucHien);
            txtKeHoachVT = (TextView) itemView.findViewById(R.id.txtViengThamKeHoach);
            txtThucHienVT = (TextView) itemView.findViewById(R.id.txtViengThamThucHien);
        }

    }
}