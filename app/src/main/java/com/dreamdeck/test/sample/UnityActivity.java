package com.dreamdeck.test.sample;

import android.content.Intent;
import android.os.Bundle;

import com.unity3d.player.UnityPlayerActivity;

public class UnityActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //跳转到android界面
    public void openMainActivity(){
        Intent intent=new Intent(UnityActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
