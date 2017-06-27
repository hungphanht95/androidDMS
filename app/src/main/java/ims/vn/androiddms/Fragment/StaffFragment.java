package ims.vn.androiddms.Fragment;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import java.util.ArrayList;

import ims.vn.androiddms.Adapter.StaffAdapter;
import ims.vn.androiddms.R;
import ims.vn.androiddms.custom.RecyclerItemClickListener;
import ims.vn.androiddms.model.ListStaff;

/**
 * Created by Deleting on 6/24/2017.
 */

public class StaffFragment extends Fragment {

    RecyclerView recyclerView;
    StaffAdapter adapter;
    private ArrayList<ListStaff> data = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_monitoring_list, container, false);
        return rootView;
    }
    public void onViewCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        recyclerView = (RecyclerView) view.findViewById(R.id.rcMonitoring);
        adapter = new StaffAdapter(createData());

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever

                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                    }

                })
        );
    }
    public ArrayList<ListStaff> createData(){
        data.add(new ListStaff("Hoa","17 gio","chưa thực hiện","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));
        data.add(new ListStaff("Hoa","17 gio","chua thuc hien","3","0","0","0"));

        return data;
    }
}