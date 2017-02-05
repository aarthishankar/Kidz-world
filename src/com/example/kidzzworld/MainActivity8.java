package com.example.kidzzworld;


import android.app.Activity;  
import android.net.Uri;
import android.os.Bundle;  
import android.view.Menu;  
import android.view.View;  
import android.widget.AdapterView;  
import android.widget.ArrayAdapter;  
import android.widget.MediaController;
import android.widget.Spinner;  
import android.widget.TextView;  
import android.widget.Toast;  
import android.widget.VideoView;
  
public class MainActivity8 extends Activity implements  
AdapterView.OnItemSelectedListener {  
  
    String[] rhymes = {"Select a rhyme :) ",  "johny johny yes paapa", "baa baa black sheep", "twinkle twinkle little stars", " i am happy", "ringa ringa roses", "five little monkeys", "rain rain go away"  };  
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main_activity8); 
        
        
        
        //Getting the instance of Spinner and applying OnItemSelectedListener on it  
        Spinner spin = (Spinner) findViewById(R.id.spinner1);  
        
        
        spin.setOnItemSelectedListener(this);  
          
        //Creating the ArrayAdapter instance having the country list  
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,rhymes);  
     //   aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
        //Setting the ArrayAdapter data on the Spinner  
        spin.setAdapter(aa);  
    }  
  
      
    //Performing action onItemSelected and onNothing selected  
    @Override  
    
    
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {  
    	
        //Toast.makeText(getApplicationContext(),country[position] ,Toast.LENGTH_LONG).show(); 
    	VideoView videoView =(VideoView)findViewById(R.id.videoView1);  
        //Creating MediaController  
MediaController mediaController= new MediaController(this);  


    mediaController.setAnchorView(videoView);          
 
      //specify the location of media file  
    if(position==1)
    {
   Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.johny);      
   videoView.setMediaController(mediaController);  
   videoView.setVideoURI(uri); 
   videoView.requestFocus();  
     videoView.start(); 
        
    }  
    if(position==2)
    {
   Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.baa);      
   videoView.setMediaController(mediaController);  
   videoView.setVideoURI(uri); 
   videoView.requestFocus();  
     videoView.start(); 
        
    }  
    if(position==3)
    {
   Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.twinkle);      
   videoView.setMediaController(mediaController);  
   videoView.setVideoURI(uri); 
   videoView.requestFocus();  
     videoView.start(); 
        
    }  
    if(position==4)
    {
   Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.happy);      
   videoView.setMediaController(mediaController);  
   videoView.setVideoURI(uri); 
   videoView.requestFocus();  
     videoView.start(); 
        
    }  
    if(position==5)
    {
   Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.ringa);      
   videoView.setMediaController(mediaController);  
   videoView.setVideoURI(uri); 
   videoView.requestFocus();  
     videoView.start(); 
        
    }  
    if(position==6)
    {
   Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.five);      
   videoView.setMediaController(mediaController);  
   videoView.setVideoURI(uri); 
   videoView.requestFocus();  
     videoView.start(); 
        
    }  
    if(position==7)
    {
   Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.rain);      
   videoView.setMediaController(mediaController);  
   videoView.setVideoURI(uri); 
   videoView.requestFocus();  
     videoView.start(); 
        
    }  
    
    }
    @Override  
    public void onNothingSelected(AdapterView<?> arg0) {  
        // TODO Auto-generated method stub  
          
    }  
  
   /* @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
        // Inflate the menu; this adds items to the action bar if it is present.  
        getMenuInflater().inflate(R.menu.activity_main, menu);  
        return true;  
    }*/  
}  
