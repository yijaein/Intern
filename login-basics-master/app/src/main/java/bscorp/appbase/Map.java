package bscorp.appbase;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by jan on 2017-02-06.
 */
public class Map extends Activity implements OnMapReadyCallback{
    private final LatLng EVERLAND = new LatLng(37.294141,127.202556);
    private GoogleMap googleMap;

    @Override
    public void onMapReady(GoogleMap googleMap) {

        googleMap.addMarker(new MarkerOptions().position(EVERLAND).title("SEOUL"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(EVERLAND,17.0f));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        Log.d("GoogleMapActivity", "Init GoogleMap Activity");

        MapFragment mapFragment = (MapFragment)getFragmentManager().findFragmentById(R.id.google_map);
        mapFragment.getMapAsync(this);


    }
}
