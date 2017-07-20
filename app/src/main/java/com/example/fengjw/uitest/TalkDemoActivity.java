package com.example.fengjw.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fengjw.adapter.MassageAdapter;
import com.example.fengjw.utils.Msg;

import java.util.ArrayList;
import java.util.List;

public class TalkDemoActivity extends AppCompatActivity {
    private String str1 = "Hello guy.";
    private String str2 = "Hello,who is that?";
    private String str3 = "This is show.Nice talking to you.";
    private List<Msg> msgList = new ArrayList<>();
    private EditText inputText;
    private Button send;
    private RecyclerView msgRecycleView;
    private MassageAdapter massageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk_demo);
        initMsgs();
        inputText = (EditText)findViewById(R.id.input_text);
        send = (Button)findViewById(R.id.send_text);
        msgRecycleView = (RecyclerView)findViewById(R.id.activity_talk_demo_recycleView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecycleView.setLayoutManager(layoutManager);
        massageAdapter = new MassageAdapter(msgList);
        msgRecycleView.setAdapter(massageAdapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = inputText.getText().toString();
                if (!"".equals(content)){
                    Msg msg = new Msg(content,Msg.TYPE_SEND);
                    msgList.add(msg);
                    massageAdapter.notifyItemInserted(msgList.size() - 1);// 当有新消息的时候
                    msgRecycleView.scrollToPosition(msgList.size() - 1);
                    inputText.setText("");
                }
            }
        });
    }
    public void initMsgs(){
        Msg msg1 = new Msg(str1,Msg.TYPE_ERCEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg(str2,Msg.TYPE_SEND);
        msgList.add(msg2);
        Msg msg3 = new Msg(str3,Msg.TYPE_ERCEIVED);
        msgList.add(msg3);
    }
}
