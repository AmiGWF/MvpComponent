package com.wd.main.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wd.common.base.BaseFragment;
import com.wd.common.router.RouterHelper;
import com.wd.main.R;
import com.wd.main.R2;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * author : 吴杜
 * date   : 2020/2/2814:29
 * version: 1.0.0
 * desc   :
 */
public class FragmentD extends BaseFragment {
    @BindView(R2.id.fragment_d_login)
    TextView fragmentDLogin;

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                         @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_d, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @OnClick(R2.id.fragment_d_login)
    public void onViewClicked() {
        ARouter.getInstance().build(RouterHelper.R_AC_LOGIN_MAIN).navigation();
    }
}
