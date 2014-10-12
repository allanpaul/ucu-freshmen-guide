package edu.ucuccs.ucufreshmenguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.actionbarsherlock.app.SherlockFragment;

public class UCUHymn extends SherlockFragment {

	VideoView video;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		


		View rootView = inflater.inflate(R.layout.ucuhymn, container, false);

		video = (VideoView) rootView.findViewById(R.id.video);
		video.setVideoPath("android.resource://"
				+ getActivity().getPackageName() + "/" + R.raw.hymn);

		MediaController myController = new MediaController(getActivity());

		video.setMediaController(myController);
		return rootView;
	}

}