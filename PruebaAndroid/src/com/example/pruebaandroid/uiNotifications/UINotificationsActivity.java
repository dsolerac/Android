package com.example.pruebaandroid.uiNotifications;

import com.example.pruebaandroid.R;
import com.example.pruebaandroid.R.layout;
import com.example.pruebaandroid.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.Toast;

public class UINotificationsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_uinotifications);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uinotifications, menu);
		return true;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		
		Log.i("onKeyDown metodo", "ENTRA!!!!!");
		Log.i("onKeyDown metodo", event.getCharacters());
		Log.i("onKeyDown metodo", String.valueOf( event.getKeyCode() ) );

		switch (keyCode) {

		case KeyEvent.KEYCODE_DPAD_CENTER:
			Toast.makeText(getBaseContext(), "Center was clicked",
					Toast.LENGTH_LONG).show();
			Log.i("onKeyDown metodo", "KEYCODE_DPAD_CENTER");
			break;
			
		case KeyEvent.KEYCODE_DPAD_LEFT:
			Toast.makeText(getBaseContext(), "left was clicked",
					Toast.LENGTH_LONG).show();
			Log.i("onKeyDown metodo", "KEYCODE_DPAD_LEFT");
			break;
			
		case KeyEvent.KEYCODE_DPAD_RIGHT:
			Toast.makeText(getBaseContext(), "right was clicked",
					Toast.LENGTH_LONG).show();
			Log.i("onKeyDown metodo", "KEYCODE_DPAD_RIGHT");
			break;
			
		case KeyEvent.KEYCODE_DPAD_UP:
			Toast.makeText(getBaseContext(), "up was clicked",
					Toast.LENGTH_LONG).show();
			Log.i("onKeyDown metodo", "KEYCODE_DPAD_UP");
			break;
			
		case KeyEvent.KEYCODE_DPAD_DOWN:
			Toast.makeText(getBaseContext(), "down was clicked",
					Toast.LENGTH_LONG).show();
			Log.i("onKeyDown metodo", "KEYCODE_DPAD_DOWN");
			break;

		}

		return false;

	}

}
