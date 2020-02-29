package com.wd.main.ui.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.wd.common.base.BaseActivity;
import com.wd.main.R;
import com.wd.main.R2;
import com.wd.main.ui.fragment.FragmentA;
import com.wd.main.ui.fragment.FragmentB;
import com.wd.main.ui.fragment.FragmentC;
import com.wd.main.ui.fragment.FragmentD;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * 注意
 * 1. 作为Application工程，可以直接使用R.id
 * 2.作为Library工程，要使用R2.id
 */
public class MainActivity extends BaseActivity {
    @BindView(R2.id.ui_main_viewpager)
    ViewPager uiMainViewpager;
    @BindView(R2.id.ui_main_tablayout)
    TabLayout uiMainTablayout;
    private List<Fragment> fragmentList = new ArrayList<>();
    private String[] tabItemTxt = new String[]{"微信", "通讯录", "发现", "我"};


    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initViewPager();
        initTabLayout();

    }

    private void initViewPager() {
        fragmentList.add(new FragmentA());
        fragmentList.add(new FragmentB());
        fragmentList.add(new FragmentC());
        fragmentList.add(new FragmentD());
        MainViewPagerAdapter viewPagerAdapter =
                new MainViewPagerAdapter(getSupportFragmentManager(),
                        FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        uiMainViewpager.setAdapter(viewPagerAdapter);
        uiMainTablayout.setupWithViewPager(uiMainViewpager, true);
        uiMainTablayout.removeAllTabs();
    }

    private void initTabLayout() {
        TabLayout.Tab tab = uiMainTablayout.newTab();
        tab.setText(tabItemTxt[0]).setIcon(R.mipmap.ic_launcher_round);

        TabLayout.Tab tab2 = uiMainTablayout.newTab();
        tab2.setText(tabItemTxt[1]).setIcon(R.mipmap.ic_launcher_round);

        TabLayout.Tab tab3 = uiMainTablayout.newTab();
        tab3.setText(tabItemTxt[2]).setIcon(R.mipmap.ic_launcher_round);

        TabLayout.Tab tab4 = uiMainTablayout.newTab();
        tab4.setText(tabItemTxt[3]).setIcon(R.mipmap.ic_launcher_round);

        uiMainTablayout.addTab(tab);
        uiMainTablayout.addTab(tab2);
        uiMainTablayout.addTab(tab3);
        uiMainTablayout.addTab(tab4);
        uiMainTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private class MainViewPagerAdapter extends FragmentPagerAdapter {

        public MainViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabItemTxt[position];
        }
    }
}
