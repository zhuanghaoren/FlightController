package com.example.flight_control_002;

import com.example.flight_control_001.R;

import android.app.Activity;
import android.os.Bundle;

public class InfoActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
		MyActivityManager.getInstance().addActivity(this);
	}

	
}
