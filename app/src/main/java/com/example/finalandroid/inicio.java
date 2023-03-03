package com.example.finalandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class inicio extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap map;
    private Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        ingresar =findViewById(R.id.ingresoapp);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(inicio.this, principal.class);
                startActivity(i);

            }
        });


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng bogota = new LatLng(4.653449139946698, -74.14525301893096);
        map.addMarker(new MarkerOptions()
                .position(bogota)
                .title("UNIAGUSTINIANA"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(bogota,15));
    }
}