package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nombre, correo, contraseña, confirmacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText) findViewById(R.id.txtNombre);
        correo = (EditText) findViewById(R.id.txtCorreo);
        contraseña = (EditText) findViewById(R.id.txtContraseña);
        confirmacion =  (EditText) findViewById(R.id.txtConfirmacion);
    }

    public void registro(View view){
        String val1 = nombre.getText().toString();
        String val2 = correo.getText().toString();
        String val3 = contraseña.getText().toString();
        String val4 = confirmacion.getText().toString();

        if(!val1.isEmpty() && !val2.isEmpty() && !val3.isEmpty() && !val4.isEmpty()){
            if(val3.equals(val4)){

            }else{
                Toast.makeText( this, "Contraseñas no coinciden", Toast.LENGTH_LONG).show();
            }

        }else {
            if(val1.isEmpty())
                nombre.setError("Falta Nombre");
            if(val2.isEmpty())
                correo.setError("Falta Correo");
            if(val3.isEmpty())
                contraseña.setError("Falta Contraseña");
            if(val4.isEmpty())
                confirmacion.setError("Falta confirmar la contraseña");

            Toast.makeText( this, "Error al Registrar", Toast.LENGTH_LONG).show();
        }

    }
}
