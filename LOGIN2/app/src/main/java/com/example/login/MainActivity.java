package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Usuario,Pass;
    Cursor fila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Usuario=findViewById(R.id.editText);
        Pass=findViewById(R.id.editText2);
    }
    public void Login(View view){
        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"Registro",null,1);
        SQLiteDatabase BaseDeDatos=admin.getWritableDatabase();
        String usuario=Usuario.getText().toString();
        String contrasena=Pass.getText().toString();
        if (!usuario.isEmpty() && !contrasena.isEmpty()) {
            fila = BaseDeDatos.rawQuery("select usuario,password from usuarios where usuario='" + usuario + "' and password='" + contrasena + "'", null);
            if (fila.moveToFirst()== true) {
                String usua = fila.getString(0);
                String pass = fila.getString(1);
                if (usuario.equals(usua) && contrasena.equals(pass)) {
                    limpiar();
                    Intent intent6 = new Intent(view.getContext(), Inicio.class);
                    startActivityForResult(intent6, 0);
                }
            }else{
                Toast.makeText(this,"Usuario o contrasena incorrectos",Toast.LENGTH_LONG).show();
                BaseDeDatos.close();
            }
        }else{
            Toast.makeText(this,"Uno de los campos esta vacio",Toast.LENGTH_LONG).show();
        }
    }
    public void Registrar(View view){
        limpiar();
        Intent intent= new Intent(view.getContext(),Registro.class);
        startActivityForResult(intent,0);
    }
    public void limpiar(){
        Usuario.setText("");
        Pass.setText("");
    }
}