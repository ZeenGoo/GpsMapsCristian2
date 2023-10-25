package com.example.prueba25_10_23;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener{

    EditText txt_Latitud, txt_Longitud; //declaran e inicializan las variables
    GoogleMap mMap;// Objeto googleMap que se utilizara para interactuar con el mapa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView MiVideito = findViewById(R.id.videoView);

        String videito = "android.resource://"+getPackageName()+"/"+R.raw.santoo;
        Uri uri= Uri.parse(videito);
        MiVideito.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        MiVideito.setMediaController(mediaController);
        mediaController.setAnchorView(MiVideito);

        txt_Latitud=findViewById(R.id.txt_Latitud);
        txt_Longitud=findViewById(R.id.txt_Longitud);
        //se llama el fragmento mapa para asegurar que el mapa este listo para su uso
        SupportMapFragment mapFragment= (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);


    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap=googleMap;//Se inicializa el objeto mMap con googleMao
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);
        //
        LatLng stm_tco = new LatLng(-38.73158239179535, -72.60379440463231);
        mMap.addMarker(new MarkerOptions().position(stm_tco).title("stm Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_tco));
        //
        LatLng stm_Arica = new LatLng(-18.483263477733253, -70.31036467462965);
        mMap.addMarker(new MarkerOptions().position(stm_Arica).title("stm Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Arica));
        //
        LatLng stm_Iquique= new LatLng(-20.239040108752206, -70.14497547183224);
        mMap.addMarker(new MarkerOptions().position(stm_Iquique).title("stm Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Iquique));
        //
        LatLng stm_Antofagasta = new LatLng(-23.63288365379999, -70.3942675193791);
        mMap.addMarker(new MarkerOptions().position(stm_Antofagasta).title("stm Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Antofagasta));
        //
        LatLng stm_LaSerena= new LatLng(-29.908548231799088, -71.25726270265848);
        mMap.addMarker(new MarkerOptions().position(stm_LaSerena).title("stm La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_LaSerena));
        //
        LatLng stm_Vinia = new LatLng(-33.03750643022142, -71.52212839552725);
        mMap.addMarker(new MarkerOptions().position(stm_Vinia).title("stm Viña del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Vinia));
        //
        LatLng stm_stgo = new LatLng(-33.44327650701258, -70.67957226330253);
        mMap.addMarker(new MarkerOptions().position(stm_stgo).title("stm Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_stgo));
        //
        LatLng stm_Talca = new LatLng(-35.428473575800055, -71.67297608170904);
        mMap.addMarker(new MarkerOptions().position(stm_Talca).title("stm Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Talca));
        //
        LatLng stm_Conce = new LatLng(-36.82180771411773, -73.06144852963799);
        mMap.addMarker(new MarkerOptions().position(stm_Conce).title("stm Concepcion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Conce));
        //
        LatLng stm_losAngeles = new LatLng(-37.47077891970809, -72.35469227714664);
        mMap.addMarker(new MarkerOptions().position(stm_losAngeles).title("stm Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_losAngeles));
        //
        LatLng stm_Valdi = new LatLng(-39.81623247075641, -73.23347709503467);
        mMap.addMarker(new MarkerOptions().position(stm_Valdi).title("stm Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Valdi));
        //
        LatLng stm_Osorno = new LatLng(-40.571398045161445, -73.13787236833845);
        mMap.addMarker(new MarkerOptions().position(stm_Osorno).title("stm Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Osorno));
        //
        LatLng stm_pto = new LatLng(-41.4722815890173, -72.92876463305035);
        mMap.addMarker(new MarkerOptions().position(stm_pto).title("stm Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_pto));


    }
    @Override
    public void onMapClick(@NonNull LatLng latLng){
        txt_Latitud.setText(""+latLng.latitude);
        txt_Longitud.setText(""+latLng.longitude);
    }
    @Override
    public void onMapLongClick(@NonNull LatLng latLng){
        txt_Latitud.setText(""+latLng.latitude);
        txt_Longitud.setText(""+latLng.longitude);
    }
}