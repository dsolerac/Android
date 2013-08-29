package com.example.pruebaandroid.views.basic;

import com.example.pruebaandroid.R;
import com.example.pruebaandroid.R.layout;
import com.example.pruebaandroid.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class BasicActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic);

		// ---Button view---
		Button btnOpen = (Button) findViewById(R.id.btnOpen);
		btnOpen.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				DisplayToast("You have clicked the Open button");
			}
		});

		// ---Button view---
		Button btnSave = (Button) findViewById(R.id.btnSave);
		btnSave.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				DisplayToast("You have clicked the Save button");
			}
		});

		// ---CheckBox---
		CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);
		checkBox.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (((CheckBox) v).isChecked())
					DisplayToast("CheckBox is checked");
				else
					DisplayToast("CheckBox is unchecked");
			}
		});

		// ---RadioButton---
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);
		radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton rb1 = (RadioButton) findViewById(R.id.rdb1);
				if (rb1.isChecked()) {
					DisplayToast("Option 1 checked!");
				} else {
					DisplayToast("Option 2 checked!");
				}
				
			}
		});

		// ---ToggleButton---
		ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle1);
		toggleButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (((ToggleButton) v).isChecked())
					DisplayToast("Toggle button is On");
				else
					DisplayToast("Toggle button is Off");
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.basic, menu);
		return true;
	}

	private void DisplayToast(String msg) {
		Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
	}

}
