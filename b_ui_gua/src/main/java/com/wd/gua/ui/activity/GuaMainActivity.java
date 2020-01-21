package com.wd.gua.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.BaseActivity;
import com.wd.common.router.RouterHelper;
import com.wd.gua.R;

/**
 * author : 吴杜
 * date   : 2020/1/219:21
 * version: 1.0.0
 * desc   :
 */
@Route(path = RouterHelper.R_AC_GUA_MAIN)
public class GuaMainActivity extends BaseActivity {
    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.gua_ac_main_layout;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }
}
