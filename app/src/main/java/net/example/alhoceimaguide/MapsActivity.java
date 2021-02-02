package net.example.alhoceimaguide;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }





        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera. In this case,
         * we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to install
         * it inside the SupportMapFragment. This method will only be triggered once the user has
         * installed Google Play services and returned to the app.
         */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng maroc = new LatLng(35.2516500,-3.9372300);
        mMap.addMarker(new MarkerOptions().position(maroc).title("Marker in Al Hoceïma"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(maroc));

        LatLng quemado = new LatLng(35.244939, -3.927001);
        mMap.addMarker(new MarkerOptions().position(quemado).title("Marker in QUEMADO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(quemado));

        LatLng calabonita = new LatLng(35.234752, -3.922739);
        mMap.addMarker(new MarkerOptions().position(calabonita).title("Marker in CALABONITA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(calabonita));

        LatLng matadero = new LatLng(35.236847, -3.923349);
        mMap.addMarker(new MarkerOptions().position(matadero).title("Marker in MATADERO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(matadero));


        LatLng sfiha = new LatLng(35.207889, -3.891175);
        mMap.addMarker(new MarkerOptions().position(sfiha).title("Marker in SFIHA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sfiha));


        LatLng souani= new LatLng(35.199207, -3.860369);
        mMap.addMarker(new MarkerOptions().position(souani).title("Marker in SOUANI"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(souani));


        LatLng bades = new LatLng(35.171085, -4.293863);
        mMap.addMarker(new MarkerOptions().position(bades).title("Marker in BADES"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bades));

        LatLng tala = new LatLng(35.243174, -3.976588);
        mMap.addMarker(new MarkerOptions().position(tala).title("Marker in TALA YOUSSEF"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tala));




    }
}
