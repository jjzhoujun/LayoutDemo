package com.example.layoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class ControllerLinkSTB extends Activity{
	
	Button btn_next;
	private Handler mLoadHandler;
	private ViewStub mViewStub;
	private ImageView img;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.controller_link_stb);
//		FrameLayout layout = (FrameLayout)this.getWindow().getDecorView()
//				.findViewById(android.R.id.content);
//		layout.setBackgroundResource(R.drawable.yindao_bg);
//		LayoutInflater.from(this).inflate(R.layout.controller_link_stb, layout, true);
		
		
		
		//使用ViewStub
		setContentView(R.layout.layout_loading);
		mLoadHandler = new Handler();
		Runnable runnable = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				mViewStub = (ViewStub)findViewById(R.id.viewstub);
				mViewStub.inflate();
				img = (ImageView)findViewById(R.id.background);
				img.setVisibility(View.GONE);
				btn_next = (Button)findViewById(R.id.controller_next);
				
				btn_next.setText("可以实例化");
			}
			
		};
		
		mLoadHandler.postDelayed(runnable, 500);
		
		
		
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		setContentView(R.layout.controller_link_stb);
		
		
		
	}	
}
