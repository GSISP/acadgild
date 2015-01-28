package com.example.first;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends Activity {

	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b=(Button) findViewById(R.id.msg);
		
		
		
		
	}
}
