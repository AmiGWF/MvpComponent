package com.wd.nent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wd.common.base.BaseActivity;
import com.wd.common.router.RouterHelper;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @BindView(R.id.tv_login_btn)
    TextView tvLoginBtn;
    @BindView(R.id.tv_gua_btn)
    TextView tvLoginGua;

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }


    @OnClick({R.id.tv_login_btn, R.id.tv_gua_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_login_btn:
                ARouter.getInstance().build(RouterHelper.R_AC_LOGIN_MAIN).navigation(this);
                break;
            case R.id.tv_gua_btn:
                ARouter.getInstance().build(RouterHelper.R_AC_GUA_MAIN).navigation(this);
                break;
        }
    }


}
