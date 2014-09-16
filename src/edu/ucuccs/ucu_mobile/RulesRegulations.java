package edu.ucuccs.ucu_mobile;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RulesRegulations extends Fragment {

	public RulesRegulations(){}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.activity_rules__regulations, container, false);
         
        return rootView;

	}

}
