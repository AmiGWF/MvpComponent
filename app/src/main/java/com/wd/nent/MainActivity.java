package com.wd.nent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.wd.common.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @BindView(R.id.tv_login_btn)
    TextView tvLoginBtn;
    @BindView(R.id.tv_login_gua)
    TextView tvLoginGua;

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }


    @OnClick({R.id.tv_login_btn, R.id.tv_login_gua})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_login_btn:
                break;
            case R.id.tv_login_gua:
                break;
        }
    }


}
