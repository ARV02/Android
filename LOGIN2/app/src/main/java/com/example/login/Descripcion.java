package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class Descripcion extends AppCompatActivity {
    TextView descripcion;
    ImageView imagen;
    ScrollView sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        descripcion=findViewById(R.id.textView12);
        imagen=findViewById(R.id.imageView2);
        descripcion1();
    }
    private void descripcion1(){
        Bundle extras = getIntent().getExtras();
        String di=extras.getString("Libro1");
        descripcion.setText(di);
        imagen.setImageResource(R.mipmap.fortaleza);
    }
}
