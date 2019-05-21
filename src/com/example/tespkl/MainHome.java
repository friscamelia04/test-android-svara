package com.example.tespkl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainHome extends Activity{
	
	ListView list;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bagian_home);
        
        list = (ListView)findViewById(R.id.listView1);
        
        //add label di item pada listview
        String[] values = new String[] {"Playlist","Music","Artist","Radio","Radio Content","Album","Uploaded Content"};
      
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);
        list.setAdapter(adapter);
        
        list.setOnItemClickListener(new OnItemClickListener() {
        	
        	@Override
			public void onItemClick(AdapterView<?> arg0, View View, int posisi,
					long id){
        		switch (posisi){
        		case 0:
        			Intent i = new Intent(MainHome.this, Playlist.class);
        			startActivity(i);
        			break;
        		case 1:
        			Intent musik = new Intent(MainHome.this, Playlist.class);
        			startActivity(musik);
        			break;
        		case 2:
        			Intent artis = new Intent(MainHome.this, Playlist.class);
        			startActivity(artis);
        			break;
        		case 3:
        			Intent radio = new Intent(MainHome.this, Playlist.class);
        			startActivity(radio);
        			break;
        		case 4:
        			Intent radiocontent = new Intent(MainHome.this, Playlist.class);
        			startActivity(radiocontent);
        			break;
        		case 5:
        			Intent uploadcontent = new Intent(MainHome.this, Playlist.class);
        			startActivity(uploadcontent);
        			break;
        		default:
        		break;
        		
        		}
        	}
		});

	}

}
