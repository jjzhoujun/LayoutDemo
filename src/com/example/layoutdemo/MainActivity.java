package com.example.layoutdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	private LinearLayout layout;
	private Button click;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		layout = (LinearLayout)findViewById(R.id.layout);
		if(layout == null){
			Toast.makeText(this, "null@!!!SB", Toast.LENGTH_SHORT).show();
		}else{
			click = new Button(this);
			click.setText("∂ØÃ¨º”‘ÿ");
			click.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT));
			layout.addView(click);
		}
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setBackgroundColor(0xff00ffff);
		
		click.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				Toast.makeText(MainActivity.this, "Test Loading.... add", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(MainActivity.this, ControllerLinkSTB.class);
				startActivity(intent);
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
