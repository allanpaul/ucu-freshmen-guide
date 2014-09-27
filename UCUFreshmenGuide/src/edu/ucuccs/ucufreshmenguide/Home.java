package edu.ucuccs.ucufreshmenguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockFragment;

public class Home extends SherlockFragment {

	public int currentimageindex = 0;

	ImageView slidingimage;

	/*private int[] IMAGE_IDS = { R.drawable.ucu_front, R.drawable.ucu_ob2,
			R.drawable.ucu_gymn };*/

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final View rootView = inflater.inflate(R.layout.home, container, false);
		/*final Handler mHandler = new Handler();

		// Create runnable for posting
		final Runnable mUpdateResults = new Runnable() {
			public void run() {

				AnimateandSlideShow();

			}

			private void AnimateandSlideShow() {
				// TODO Auto-generated method stub
				slidingimage = (ImageView) rootView.findViewById(R.id.img);
				slidingimage.setImageResource(IMAGE_IDS[currentimageindex
						% IMAGE_IDS.length]);

				currentimageindex++;

				Animation rotateimage = AnimationUtils.loadAnimation(
						getActivity(), R.anim.fade_in);

				slidingimage.startAnimation(rotateimage);

			}
		};

		int delay = 500;

		int period = 10000;

		Timer timer = new Timer();

		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {

				mHandler.post(mUpdateResults);

			}

		}, delay, period);*/

		return rootView;
	}

}