package edu.ucuccs.ucu_mobile;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class UCUHymn extends Fragment {

	VideoView video;

	public UCUHymn() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.activity_ucu_hymn, container,
				false);

		video = (VideoView) rootView.findViewById(R.id.video);
		video.setVideoPath("android.resource://"
				+ getActivity().getPackageName() + "/" + R.raw.ucuhymn);

		MediaController myController = new MediaController(getActivity());

		video.setMediaController(myController);
		video.start();
		
	
		
		return rootView;

	}

}
