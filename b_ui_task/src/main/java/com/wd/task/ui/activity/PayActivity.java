package com.wd.task.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.BaseActivity;
import com.wd.common.router.RouterHelper;
import com.wd.task.R;

/**
 * author : 吴杜
 * date   : 2020/2/2910:07
 * version: 1.0.0
 * desc   :
 */

@Route(path = RouterHelper.R_AC_TASK_PAY)
public class PayActivity extends BaseActivity {
    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.ac_pay_layout;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }
}
