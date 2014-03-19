package com.example.ecommerce1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Infibeam extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.infibeam);
		WebView infi=(WebView) findViewById(R.id.infibeam);
		infi.loadUrl("http://www.infibeam.com");
		infi.setWebViewClient(new WebViewClient());
	}

}
