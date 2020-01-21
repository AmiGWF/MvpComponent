package com.wd.gua.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.wd.common.base.BaseFragment;
import com.wd.gua.R;

/**
 * author : 吴杜
 * date   : 2020/1/2016:04
 * version: 1.0.0
 * desc   :
 */
public class GuaFragment extends BaseFragment {
    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                         @Nullable Bundle savedInstanceState) {
        return inflater.inflate( R.layout.gua_fg_layout,null);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }
}
