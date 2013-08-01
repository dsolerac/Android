package com.example.pruebaandroid.fragmens;

import com.example.pruebaandroid.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
//		return super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.fragment2, container, false);
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		Button btnGetText = (Button) getActivity().findViewById(R.id.btnG) 
	}

}
