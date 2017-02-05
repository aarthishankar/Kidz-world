package com.example.kidzzworld;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity1 extends Activity {
	
	ImageButton rhymes,animal,bird,num,alpha,colors;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
		
		rhymes=(ImageButton)findViewById(R.id.imageButton5);
		animal=(ImageButton)findViewById(R.id.imageButton2);
		bird=(ImageButton)findViewById(R.id.imageButton6);
		//toys=(ImageButton)findViewById(R.id.r4);
		num=(ImageButton)findViewById(R.id.imageButton4);
		alpha=(ImageButton)findViewById(R.id.imageButton1);
		colors=(ImageButton)findViewById(R.id.imageButton3);
		
		/*toys.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i=new Intent(MainActivity1.this,MainActivity2.class);
			    startActivity(i);
			
				
			}
		});*/
colors.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i=new Intent(MainActivity1.this,MainActivity3.class);
			    startActivity(i);
			
				
			}
		});
num.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent(MainActivity1.this,MainActivity4.class);
	    startActivity(i);
		
	  	}
});
bird.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent(MainActivity1.this,MainActivity6.class);
	    startActivity(i);
		
	  	}
});

alpha.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(MainActivity1.this,MainActivity5.class);
	    startActivity(i);
	
		
	}
});

animal.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(MainActivity1.this,MainActivity7.class);
	    startActivity(i);
	
		
	}
});

rhymes.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(MainActivity1.this,MainActivity8.class);
	    startActivity(i);
	
		
	}
});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_activity1, menu);
		return true;
	}

}//dont move your mouse or key board. this is tarun. wait.
//rofl!! ehat app is that :P
//you have added some premium content. thats why unable to mail/download
//check the slides again
