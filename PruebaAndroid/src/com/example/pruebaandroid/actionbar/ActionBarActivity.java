package com.example.pruebaandroid.actionbar;

import com.example.pruebaandroid.R;
import com.example.pruebaandroid.R.layout;
import com.example.pruebaandroid.R.menu;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class ActionBarActivity extends Activity {
	
	private String tag = "ActionBar";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		
		setContentView(R.layout.activity_action_bar);

		ActionBar actionBar = getActionBar();
		Log.d(tag, ((Boolean)actionBar.isShowing()).toString() );
		actionBar.setDisplayHomeAsUpEnabled(true);
		// actionBar.setTitle("título!!!");
		// actionBar.show();
		// actionBar.hide();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.action_bar, menu);

		createMenu(menu);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		return menuChoice(item);

	}

	private void createMenu(Menu menu) {

		MenuItem mnu1 = menu.add(0, 0, 0, "Item 1");
		mnu1.setIcon(R.drawable.ic_launcher);
		mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM
				| MenuItem.SHOW_AS_ACTION_WITH_TEXT);

		MenuItem mnu2 = menu.add(0, 1, 1, "Item 2");
		mnu2.setIcon(R.drawable.ic_launcher);
		mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

		MenuItem mnu3 = menu.add(0, 2, 2, "Item 3");
		{
			mnu3.setIcon(R.drawable.ic_launcher);
			mnu3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

		MenuItem mnu4 = menu.add(0, 3, 3, "Item 4");
		{
			mnu4.setIcon(R.drawable.ic_launcher);
			mnu4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}
		MenuItem mnu5 = menu.add(0, 4, 4, "Item 5");
		{
			mnu5.setIcon(R.drawable.ic_launcher);
			mnu5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

	}

	private boolean menuChoice(MenuItem item) {

		switch (item.getItemId()) {

		case android.R.id.home:
			Toast.makeText(this, "Has clicado en el icono de la aplicación",
					Toast.LENGTH_LONG).show();
			return true;

		case 0:
			Toast.makeText(this, "You clicked on Item 1", Toast.LENGTH_LONG)
					.show();
			return true;

		case 1:

			Toast.makeText(this, "You clicked on Item 2", Toast.LENGTH_LONG)
					.show();
			return true;

		case 2:
			Toast.makeText(this, "You clicked on Item 3", Toast.LENGTH_LONG)
					.show();
			return true;

		case 3:
			Toast.makeText(this, "You clicked on Item 4", Toast.LENGTH_LONG)
					.show();
			return true;

		case 4:
			Toast.makeText(this, "You clicked on Item 5", Toast.LENGTH_LONG)
					.show();
			return true;

		}

		return false;
	}

}
