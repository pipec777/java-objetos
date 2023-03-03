package com.example.finalandroid;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class principal extends AppCompatActivity {


    public static final String ENVIAR_USUARIO ="usuarios";
    public static final String ENVIAR_CONTRA ="contrasenas";

    private Button consulta;
    private EditText usu;
    private EditText pass;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        consulta=findViewById(R.id.consulta);
        usu=findViewById(R.id.usuario);
        pass=findViewById(R.id.contrasena);
        consulta.setOnClickListener(view -> {

            String mensaje1 = usu.getText().toString();
            String mensaje2 = pass.getText().toString();

            Intent con = new Intent(principal.this, consulta.class);
            Bundle persona = new Bundle();
            persona.putString(ENVIAR_USUARIO,mensaje1);
            persona.putString(ENVIAR_CONTRA,mensaje2);
            con.putExtras(persona);
            startActivity(con);
        });
    }

}