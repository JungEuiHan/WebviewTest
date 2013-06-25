package com.ATsolution;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewTest extends Activity {
	
	WebView browser;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.main);
        
      //  browser = (WebView)findViewById(R.id.webkit);
        //browser.loadUrl("http://www.google.co.kr");
    }
}