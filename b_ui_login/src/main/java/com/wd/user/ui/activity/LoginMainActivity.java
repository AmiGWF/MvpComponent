package com.wd.user.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.BaseActivity;
import com.wd.common.router.RouterHelper;
import com.wd.user.R;
import com.wd.user.R2;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * author : 吴杜
 * date   : 2020/1/219:41
 * version: 1.0.0
 * desc   :
 */
@Route(path = RouterHelper.R_AC_LOGIN_MAIN)
public class LoginMainActivity extends BaseActivity {
    @BindView(R2.id.tv_login)
    TextView tvLogin;

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.login_main_activity;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @OnClick(R2.id.tv_login)
    public void onViewClicked() {
    }
}
