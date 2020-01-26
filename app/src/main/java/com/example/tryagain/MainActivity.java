package com.example.tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    @BindView(R.id.main_type_spinner)
    Spinner spinner;

    GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        SupportMapFragment frag = new SupportMapFragment();
        frag.getMapAsync(this);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_full_fragment, frag, frag.getTag())
                .commit();

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
    }
}
