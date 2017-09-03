package org.androidtown.tablayoutexample;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static org.androidtown.tablayoutexample.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
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
        // mMap 객체 생성

        double latitude = 37.507630;
        double longitude = 127.026648;

        // Add a marker in Sydney and move the camera
        LatLng seoul = new LatLng(latitude, longitude);

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        // sydney 객체명으로 ("Marker in sydney") title 을 붙여 마커를 추가
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        // camera 위치를 sydeney 객체 위치로 이동

        // mMap.addMarker(new MarkerOptions().position(seoul).title("Marker in seoul"));
        // sydney 객체명으로 ("Marker in seoul") title 을 붙여 마커를 추가
        // mMap.moveCamera(CameraUpdateFactory.newLatLng(seoul));
        // camera 위치를 seoul 객체 위치로 이동
        mMap.addMarker(new MarkerOptions().position(seoul).title("카페베네 신논현점"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(seoul));
        // camera 위치를 seoul
        mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        // 지도를 레벨 확대 레벨16으로 출력

    }




}
