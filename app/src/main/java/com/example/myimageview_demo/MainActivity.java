package com.example.myimageview_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.security.PrivateKey;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView1,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=findViewById(R.id.imageView1Id);
        imageView2=findViewById(R.id.imageView2Id);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView1Id){
            Toast.makeText(MainActivity.this,"Ahammad Rafi",Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.imageView2Id){
            Toast.makeText(MainActivity.this,"Md Pervez hasan",Toast.LENGTH_SHORT).show();
        }

 
    }
}