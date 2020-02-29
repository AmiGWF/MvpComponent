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
import java.util.Random;

import butterknife.BindView;

/**
 * author : 吴杜
 * date   : 2020/2/2814:29
 * version: 1.0.0
 * desc   :
 */
public class FragmentA extends BaseFragment {
    @BindView(R2.id.fragment_a_recycleview)
    RecyclerView fragmentARecycleview;


    private List<ChatBean> chatList = new ArrayList<>();

    private int[] nicks = new int[]{R.drawable.jf_touxiang1, R.drawable.jf_touxiang2,
            R.drawable.jf_touxiang3, R.drawable.jf_touxiang4, R.drawable.jf_touxiang5,
            R.drawable.jf_touxiang6};


    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                         @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initRecycleView();
    }

    private void initRecycleView() {
        if (chatList != null) {
            chatList.clear();
        }

        for (int i = 0; i < 12; i++) {
            ChatBean bean = new ChatBean("姓名 " + i, "今天天气不错 " + i * 99999, nicks[new Random().nextInt(6)]);
            chatList.add(bean);
        }

        ChatAdapter chatAdapter =
                new ChatAdapter(R.layout.fragment_a_chat_item, chatList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        fragmentARecycleview.setLayoutManager(layoutManager);
        fragmentARecycleview.setAdapter(chatAdapter);
    }


    private class ChatAdapter extends BaseQuickAdapter<ChatBean, BaseViewHolder> {
        public ChatAdapter(int layoutResId, @Nullable List data) {
            super(layoutResId, data);
        }


        @Override
        protected void convert(@NonNull BaseViewHolder helper, ChatBean item) {
            helper.setImageResource(R.id.contact_item_icon, item.nick);
            helper.setText(R.id.contact_item_name, item.name);
            helper.setText(R.id.contact_item_content, item.comtent);
        }
    }


    private class ChatBean {
        public ChatBean(String name, String comtent, int nick) {
            this.name = name;
            this.comtent = comtent;
            this.nick = nick;
        }

        public String name;
        public String comtent;
        public int nick;
    }
}
