package com.example.ecommerce1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Snapdeal extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.snapdeal1);
		WebView snap=(WebView) findViewById(R.id.snapdeal);
		snap.loadUrl("http://www.snapdeal.com");
		snap.setWebViewClient(new WebViewClient());
	}

}
