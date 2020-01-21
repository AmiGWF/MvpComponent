package com.wd.common.base;

import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * author : 吴杜
 * date   : 2020/1/2015:57
 * version: 1.0.0
 * desc   : fragment管理类，可以指定对应的fragment添加到list中
 */
@Keep
public final class FragmentManager {
    private static List<Fragment> fragmentList;

    private FragmentManager() {
    }

    public static FragmentManager getInstance() {
        return FragmentManagerHolder.sInstance;
    }

    private static class FragmentManagerHolder {
        private static final FragmentManager sInstance = new FragmentManager();
    }


    public void addFragment(Fragment fragment) {
        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
        }
        fragmentList.add(fragment);
    }

    public void addFragment(int index, Fragment fragment) {
        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
        }
        fragmentList.add(index, fragment);
    }


    public Fragment getFragment(int index) {
        if (fragmentList != null) {
            return fragmentList.get(index);
        }
        return null;
    }


    public List<Fragment> getAllFragment() {
        if (fragmentList != null) {
            return fragmentList;
        }
        return new ArrayList<Fragment>();
    }
}
