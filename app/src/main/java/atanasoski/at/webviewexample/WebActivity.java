package atanasoski.at.webviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class WebActivity extends ActionBarActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webactivity);

        webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        Intent intent = getIntent();

        String Button = intent.getStringExtra("Button");

        switch (Button){
            case "Google":
                webView.loadUrl("http://www.google.com");
                break;
            case "Reddit":
                webView.loadUrl("http://www.reddit.com");
                break;
            case "Spengergasse":
                webView.loadUrl("http://www.spengergasse.at");
                break;
        }




        //String customHtml = "<html><body><h2>Greetings from JavaCodeGeeks</h2></body></html>";
        //webView.loadData(customHtml, "text/html", "UTF-8");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_webactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
