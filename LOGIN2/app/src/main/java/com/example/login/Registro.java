package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    EditText Nombre,Apellidos,Correo,Usuario,password,password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Nombre=findViewById(R.id.editText3);
        Apellidos=findViewById(R.id.editText4);
        Correo=findViewById(R.id.editText5);
        Usuario=findViewById(R.id.editText6);
        password=findViewById(R.id.editText7);
        password2=findViewById(R.id.editText8);
    }
    public void Guardar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"Registro",null,1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
        String nombre=Nombre.getText().toString();
        String apellidos=Apellidos.getText().toString();
        String correo=Correo.getText().toString();
        String usuario=Usuario.getText().toString();
        String pass=password.getText().toString();
        String pass2=password2.getText().toString();
        if(pass.equals(pass2)){
            if (!nombre.isEmpty() && !apellidos.isEmpty() && !correo.isEmpty() && !usuario.isEmpty() && !pass.isEmpty()) {
                ContentValues regis = new ContentValues();
                regis.put("nombre", nombre);
                regis.put("apellido", apellidos);
                regis.put("correo", correo);
                regis.put("usuario", usuario);
                regis.put("password", pass);
                BaseDeDatos.insert("usuarios",null,regis);
                BaseDeDatos.close();
                limpiar();
                Intent intent5=new Intent(view.getContext(),MainActivity.class);
                startActivityForResult(intent5,0);

            } else {
                Toast.makeText(this, "Todos los campos son requeridos", Toast.LENGTH_LONG).show();
            }
        }else {
            Toast.makeText(this,"Las contrasenas no coinciden",Toast.LENGTH_LONG).show();
        }
    }
    private void limpiar(){
        Nombre.setText("");
        Apellidos.setText("");
        Correo.setText("");
        Usuario.setText("");
        password.setText("");
        password2.setText("");
    }
}