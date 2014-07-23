package com.vivek.projectvivek;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyMenu extends ListActivity {

	String options[] = { "Adding", "TextPlay", "Email", "Faltoo 3", "Data",
			"Faltoo 5", "Faltoo 6", "Faltoo 7", "Faltoo 8" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MyMenu.this,
				android.R.layout.simple_expandable_list_item_1, options));

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese = options[position];
		try {
			Class myclass = Class.forName("com.vivek.projectvivek." + cheese);
			Intent ourIntent = new Intent(MyMenu.this, myclass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater blow = getMenuInflater();
		blow.inflate(R.menu.cool_menu, menu);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.aboutus:
			Intent i = new Intent("com.vivek.adding.ABOUT");
			startActivity(i);
			break;

		case R.id.preferences:
			Intent p = new Intent("com.vivek.adding.PREFS");
			startActivity(p);
			break;

		case R.id.exit:
			finish();
			break;
		}
		return false;
	}
}