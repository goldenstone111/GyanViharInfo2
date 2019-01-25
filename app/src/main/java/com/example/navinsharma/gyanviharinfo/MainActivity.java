package com.example.navinsharma.gyanviharinfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends login  {
    VideoView videoView;
    Button loginbtn,signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.video1);
        String vpath ="android.resource://com.example.navinsharma.gyanviharinfo/"+R.raw.demo1;
        Uri uri= Uri.parse(vpath);
        videoView.setVideoURI(uri);
        videoView.start();
        loginbtn =findViewById(R.id.login);
        signupbtn =findViewById(R.id.signup);
        loginbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,login.class);
                startActivity(intent);
            }
        });
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,signup.class);
                startActivity(intent);
            }
        });

    }



}
