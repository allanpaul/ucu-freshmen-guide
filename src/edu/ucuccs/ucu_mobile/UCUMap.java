package edu.ucuccs.ucu_mobile;

import android.app.Fragment;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.ui.IconGenerator;

public class UCUMap extends Fragment {

	
	
	public UCUMap() {
	}

	private GoogleMap map;
	private static final LatLng UCU = new LatLng(15.9802657, 120.5608399);
	private static View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		if (view != null) {
			ViewGroup parent = (ViewGroup) view.getParent();
			if (parent != null)
				parent.removeView(view);
		}
		try {
			view = inflater.inflate(R.layout.activity_ucu__map, container,
					false);
			map = ((MapFragment) getFragmentManager()
					.findFragmentById(R.id.map)).getMap();

			map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

			BitmapDescriptor image = BitmapDescriptorFactory
					.fromResource(R.drawable.ic_launcher);
			// Add a ground overlay over UCU
			// 50% transparency (100 meters high & wide)
			float width = 130;
			float height = 130;
			GroundOverlay groundOverlay = map
					.addGroundOverlay(new GroundOverlayOptions().image(image)
							.position(UCU, width, height)
							.transparency((float) 0.8));
			map.moveCamera(CameraUpdateFactory.newLatLngZoom(UCU, 19.0f));

			IconGenerator iconFactory = new IconGenerator(getActivity());

			iconFactory.setStyle(IconGenerator.STYLE_GREEN);
			addIcon(iconFactory, "Gymnasium", new LatLng(15.9786106,
					120.5608737));

			iconFactory.setStyle(IconGenerator.STYLE_ORANGE);
			addIcon(iconFactory, "Orata Building", new LatLng(15.9803493,
					120.5603938));

			iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
			addIcon(iconFactory, "New Building", new LatLng(15.9799419,
					120.5607604));

			iconFactory.setStyle(IconGenerator.STYLE_BLUE);
			addIcon(iconFactory, "Engineering Building", new LatLng(15.9801533,
					120.5602726));

			iconFactory.setStyle(IconGenerator.STYLE_ORANGE);
			addIcon(iconFactory, "Orata Building 2", new LatLng(15.979417,
					120.560476));

			iconFactory.setStyle(IconGenerator.STYLE_GREEN);
			addIcon(iconFactory, "Quadrangle", new LatLng(15.9799959,
					120.5610247));

			iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
			addIcon(iconFactory, "AVR", new LatLng(15.9802868, 120.5617505));

			iconFactory.setStyle(IconGenerator.STYLE_GREEN);
			addIcon(iconFactory, "Accounting, Cashier and President Office",
					new LatLng(15.9803681, 120.5615921));

			iconFactory.setStyle(IconGenerator.STYLE_GREEN);
			addIcon(iconFactory, "Green Home", new LatLng(15.9796589,
					120.5607035));

			iconFactory.setStyle(IconGenerator.STYLE_GREEN);
			addIcon(iconFactory, "Green Home 2", new LatLng(15.979793,
					120.5603709));

			iconFactory.setStyle(IconGenerator.STYLE_ORANGE);
			addIcon(iconFactory, "MAPEH Office", new LatLng(15.9782706,
					120.5608631));

			iconFactory.setStyle(IconGenerator.STYLE_BLUE);
			addIcon(iconFactory, "Comfort Rooom", new LatLng(15.9784087,
					120.5609801));

			iconFactory.setStyle(IconGenerator.STYLE_BLUE);
			addIcon(iconFactory, "Comfort Rooom", new LatLng(15.9794789,
					120.5607565));

			iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
			addIcon(iconFactory, "Canteen", new LatLng(15.9797863, 120.561579));

			iconFactory.setStyle(IconGenerator.STYLE_GREEN);
			addIcon(iconFactory, "Orata Park", new LatLng(15.9799288,
					120.5615552));

			iconFactory.setStyle(IconGenerator.STYLE_BLUE);
			addIcon(iconFactory, "Registrar Office", new LatLng(15.9800837,
					120.5616952));

			iconFactory.setStyle(IconGenerator.STYLE_BLUE);
			addIcon(iconFactory, "DBC Room",
					new LatLng(15.9805233,120.561192));
			
			iconFactory.setStyle(IconGenerator.STYLE_GREEN);
			addIcon(iconFactory, "Honasan Hall",
					new LatLng(15.9804238,120.5610754));
			
			iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
			addIcon(iconFactory, "Badar",
					new LatLng(15.9805181,120.56098));
			
			iconFactory.setStyle(IconGenerator.STYLE_ORANGE);
			addIcon(iconFactory, "Square Garden",
					new LatLng(15.9804696,120.560826));


		} catch (InflateException e) {

		}
		return view;
	}


	private void addIcon(IconGenerator iconFactory, String text, LatLng position) {

		MarkerOptions markerOptions = new MarkerOptions()
				.icon(BitmapDescriptorFactory.fromBitmap(iconFactory
						.makeIcon(text))).position(position)
				.anchor(iconFactory.getAnchorU(), iconFactory.getAnchorV());

		map.addMarker(markerOptions);

	}

}
