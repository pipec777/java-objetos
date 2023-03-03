package com.example.finalandroid;

import static com.example.finalandroid.principal.ENVIAR_CONTRA;
import static com.example.finalandroid.principal.ENVIAR_USUARIO;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class consulta extends AppCompatActivity {

      private TextView ne1;
      private TextView ne2;
      private TextView ae1;
      private nota datos;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

           ne1=findViewById(R.id.usuest);
           ne2=findViewById(R.id.contres);
           ae1=findViewById(R.id.nota);
           datos= new nota("4.5");
           nota nt = new nota();

        Bundle personaR=getIntent().getExtras();
        TextView usuarios = (TextView) findViewById(R.id.usuest);
        usuarios.setText(personaR.getString(ENVIAR_USUARIO));
        TextView contrasenas = (TextView) findViewById(R.id.contres);
        contrasenas.setText(personaR.getString(ENVIAR_CONTRA));
        ae1.setText(datos.getNotas());

    }
}