package com.example.pruebaandroid.fragmens;


import com.example.pruebaandroid.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment { 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
//		return super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.fragment1, container, false);
//		  View view = inflater.inflate(R.layout.fragment1, container, false);
//			    return view;		
	}

	
}
