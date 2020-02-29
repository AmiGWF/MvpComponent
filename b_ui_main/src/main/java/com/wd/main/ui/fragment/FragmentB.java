package com.wd.main.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wd.common.base.BaseFragment;
import com.wd.main.R;
import com.wd.main.R2;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * author : 吴杜
 * date   : 2020/2/2814:29
 * version: 1.0.0
 * desc   :
 */
public class FragmentB extends BaseFragment {
    @BindView(R2.id.fragment_b_recycleview)
    RecyclerView fragmentBRecycleview;

    private List<String> contactList = new ArrayList<>();

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                         @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initRecycleView();

    }

    private void initRecycleView() {
        if(contactList != null){
            contactList.clear();
        }

        for (int i = 0; i < 30; i++) {
            contactList.add("联系人 ：" + i);
        }

        ContactAdapter contactAdapter = new ContactAdapter(R.layout.fragment_b_contact_item, contactList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        fragmentBRecycleview.setLayoutManager(layoutManager);
        fragmentBRecycleview.setAdapter(contactAdapter);
    }


    private class ContactAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
        public ContactAdapter(int layoutResId, @Nullable List data) {
            super(layoutResId, data);
        }


        @Override
        protected void convert(@NonNull BaseViewHolder helper, String item) {
            helper.setText(R.id.contact_item_phone, item);
        }
    }

}
