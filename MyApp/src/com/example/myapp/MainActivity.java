package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	Button b;
	
   @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	
	setContentView(R.layout.activity_main);
	
	b=(Button) findViewById(R.id.message);
	
	b.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
Toast.makeText(getApplicationContext(), "button clicked",Toast.LENGTH_LONG).show();
			
		}
	});
	
	
}
}
