package com.example.tespkl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText username,pwd;
	Button sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        username = (EditText)findViewById(R.id.nama);
        pwd 	 = (EditText)findViewById(R.id.pwd);
        sign_in  = (Button)findViewById(R.id.signin);
        
        sign_in.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				
				if (username.getText().toString().equals("svara") && pwd.getText().toString().equals("123"))
				{
					Intent home = new Intent(getApplicationContext(),MainHome.class);
					startActivity(home);
				}
				else{
					Toast.makeText(getApplicationContext(), "Username atau Password Salah", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
