package ims.vn.androiddms.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import ims.vn.androiddms.Activity.OrderActivity;
import ims.vn.androiddms.R;
import ims.vn.androiddms.Activity.StatisticalActivity;
import ims.vn.androiddms.model.Visit;

public class VisitAdapter extends RecyclerView.Adapter<VisitAdapter.RecyclerViewHolder> {

    private ArrayList<Visit> listData = new ArrayList<>();

    public VisitAdapter(ArrayList<Visit> listData) {
        this.listData = listData;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemview = inflater.inflate(R.layout.item_recycle_visit, parent, false);
        return new RecyclerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.txtDetailName.setText(listData.get(position).getDetailname());
        holder.txtName.setText(listData.get(position).getName());
        holder.txtAddress.setText(listData.get(position).getAddress());
        holder.txtPhone.setText(listData.get(position).getPhone());

    }
    @Override
    public int getItemCount() {
        return listData.size();
    }
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtDetailName,txtName,txtAddress,txtPhone,txtViewnote,txtViewStatistical;
        LinearLayout btnOrder,btnCheckin;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            final Context context;
            context = itemView.getContext();
            txtDetailName = (TextView) itemView.findViewById(R.id.txtDetailName);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtAddress = (TextView) itemView.findViewById(R.id.txtaddress);
            txtPhone = (TextView) itemView.findViewById(R.id.txtphone);
            txtViewnote = (TextView) itemView.findViewById(R.id.viewnote);
            txtViewStatistical = (TextView) itemView.findViewById(R.id.viewStatistical);
            btnOrder = (LinearLayout) itemView.findViewById(R.id.btnOrder);
            btnCheckin = (LinearLayout) itemView.findViewById(R.id.btnCheckin);
            txtViewStatistical.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,StatisticalActivity.class);
                    context.startActivity(intent);
                }
            });
            btnOrder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,OrderActivity.class);
                    context.startActivity(intent);
                }
            });

        }

    }
}