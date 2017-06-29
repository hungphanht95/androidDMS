package ims.vn.androiddms.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import ims.vn.androiddms.Activity.ProductActivity;
import ims.vn.androiddms.R;
import ims.vn.androiddms.config.ConfigApplication;

/**
 * Created by Deleting on 6/24/2017.
 */

public class StockFragment extends Fragment {

    private LinearLayout btnThemsp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_checkin_stock, container, false);

        btnThemsp = (LinearLayout) rootView.findViewById(R.id.btnthemsp);
        btnThemsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ProductActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt(ConfigApplication.DATA_DIRECT_TRANSFER, ConfigApplication.REQUEST_DIRECT_CHECK_IN);
                intent.putExtra(ConfigApplication.BUNDLE_DATA_TRANSFER, bundle);
                startActivity(intent);
                getActivity().finish();
            }
        });
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
    }
}