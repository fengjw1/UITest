package com.example.fengjw.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fengjw.uitest.R;
import com.example.fengjw.utils.Msg;

import java.util.List;


/**
 * Created by fengjw on 2017/7/20.
 */

public class MassageAdapter extends RecyclerView.Adapter<MassageAdapter.ViewHolder> {
    static class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout leftlayout,rightlayout;
        TextView leftMsg,rightMsg;

        public ViewHolder(View view){
            super(view);
            leftlayout = (LinearLayout) view.findViewById(R.id.left_layout);
            rightlayout = (LinearLayout) view.findViewById(R.id.right_layout);
            leftMsg = (TextView) view.findViewById(R.id.left_msg);
            rightMsg = (TextView) view.findViewById(R.id.right_msg);
        }
    }

    private List<Msg> mMsgList;
    public MassageAdapter(List<Msg> msgList){
        mMsgList = msgList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.msg_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Msg msg = mMsgList.get(position);
        if(msg.getType() == Msg.TYPE_ERCEIVED){
            holder.leftlayout.setVisibility(View.VISIBLE);
            holder.rightlayout.setVisibility(View.GONE);
            holder.leftMsg.setText(msg.getContent());
        }else if(msg.getType() == Msg.TYPE_SEND){
            holder.leftlayout.setVisibility(View.GONE);
            holder.rightlayout.setVisibility(View.VISIBLE);
            holder.rightMsg.setText(msg.getContent());
        }else {

        }
    }

    @Override
    public int getItemCount() {
        return mMsgList.size();
    }


}
