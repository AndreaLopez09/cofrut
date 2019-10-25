package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText nombre, contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nombre = (EditText) findViewById(R.id.txtNombre);
        contraseña = (EditText) findViewById(R.id.txtContraseña);
    }

    public void acceso(View view){
        String val1 = nombre.getText().toString();
        String val2 = contraseña.getText().toString()

        if(!val1.isEmpty() && !val2.isEmpty()){

        }else{
            if(val1.isEmpty())
                nombre.setError("Falta nombre");
            if(val2.isEmpty())
                contraseña.setError("Falta contraseña");
        }


    }
}
