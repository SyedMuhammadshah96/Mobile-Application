package com.example.shah.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
private Button button;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    button=(Button)findViewById(R.id.btnInfo);
        btn2=(Button)findViewById(R.id.btnsetting);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();


        }});
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Screen();
            }
        });
        }
    public void Login()

    {
    Intent intent=new Intent(this,Pesonal_Info.class);
        startActivity(intent);

    }
    public void Screen()
    {
        Intent set=new Intent(this,SettingScreen.class);
        startActivity(set);
    }

}
