package com.wd.main.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

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
public class FragmentC extends BaseFragment {
    @BindView(R2.id.fragment_c_friends)
    LinearLayout fragmentCFriends;
    @BindView(R2.id.fragment_c_pay)
    LinearLayout fragmentCPay;

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                         @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @OnClick({R2.id.fragment_c_friends, R2.id.fragment_c_pay})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.fragment_c_friends) {
            ARouter.getInstance().build(RouterHelper.R_AC_TASK_FRIEND).navigation();
        } else if (id == R.id.fragment_c_pay) {
            ARouter.getInstance().build(RouterHelper.R_AC_TASK_PAY).navigation();
        }
    }
}
