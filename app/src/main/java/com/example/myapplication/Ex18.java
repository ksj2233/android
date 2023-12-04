package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class Ex18 extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap gMap;
    MapFragment mapFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex18);
        setTitle("구글 지도");

        mapFrag = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFrag.getMapAsync(this);
    }

    /**메뉴바*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"위성 지도");
        menu.add(0,2,0,"일반 지도");
        menu.add(0,3,0,"우리집");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1:
                gMap.setMapType(GoogleMap.MAP_TYPE_HYBRID); // 위성지도
                return true;
            case 2:
                gMap.setMapType(GoogleMap.MAP_TYPE_NORMAL); // 일반지도
                return true;
            case 3:
                gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(36.351016,127.367714),18));
                return true;
        }
        return false;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;
//        gMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
//        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(37.568256,126.897240),15));
        gMap.getUiSettings().setZoomControlsEnabled(true); //지도 확대 축소 버튼
    }
}