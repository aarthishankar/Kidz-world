package com.example.kidzzworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity3 extends Activity {
	
	int mFlipping = 0 ; // Initially flipping is off
	Button mButton ; // Reference to button available in the layout to start and stop the flipper

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
		
		 OnClickListener listener = new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper1);
					
					if(mFlipping==0){
						/** Start Flipping */
						flipper.startFlipping();
						mFlipping=1;
						mButton.setText("start slideshow");
					}
					else{
						/** Stop Flipping */
						flipper.stopFlipping();					
						mFlipping=0;
						mButton.setText("stop slideshow");
					}
				}
			};
			
			/** Getting a reference to the button available in the resource */
	        mButton = (Button) findViewById(R.id.btn);
	        
	        /** Setting click event listner for the button */
	        mButton.setOnClickListener(listener);
	        
	        
	    }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_activity3, menu);
		return true;
	}

}
