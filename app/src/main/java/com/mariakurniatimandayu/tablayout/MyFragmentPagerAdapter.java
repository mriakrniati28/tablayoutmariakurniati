package com.mariakurniatimandayu.tablayout;


import android.app.FragmentManager;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter
{
    private Fragment_berita fragment_berita = new Fragment_berita();
    private Context _context;
    private Fragment_ECommerce fragment_eCommerce = new Fragment_ECommerce();
    private int _tabCount;
    private Fragment_kampus fragment_kampus = new Fragment_kampus();

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return fragment_eCommerce;
            case 1:
                return Fragment_berita;
            default:
                return  Fragment_kampus;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
