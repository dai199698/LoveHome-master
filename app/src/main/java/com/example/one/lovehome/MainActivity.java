package com.example.one.lovehome;


import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import com.example.one.homedemo.HomeFragment;
import com.example.one.personaldemo.PersonalFragment;
import com.example.one.publishdemo.PublishFragment;

public class MainActivity extends FragmentActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    FragmentManager fm;
    public Void myclick(View view){
        switch(view.getId()){
            case R.id.btn1: {
                fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame_layout,new HomeFragment());
                ft.commit();
                break;
            }
            case R.id.btn2: {
                fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame_layout,new PublishFragment());
                ft.commit();
                break;
            }
            case R.id.btn3: {
                fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frame_layout,new PersonalFragment());
                ft.commit();
                break;
            }
        }
        return null;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.frame_layout,new HomeFragment());
        ft.commit();
    }
}
