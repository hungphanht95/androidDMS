package ims.vn.androiddms.Adapter;

import android.support.v4.app.FragmentStatePagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deleting on 6/24/2017.
 */

public class PaperAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> listFragment = new ArrayList<>();

    public PaperAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    public void addFragment(Fragment fragment) {
        listFragment.add(fragment);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
        //return listTitle.get(position);
    }
}