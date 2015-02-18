package atanasoski.at.webviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.GoogleButton).setOnClickListener(this);
        findViewById(R.id.SpengergasseButton).setOnClickListener(this);
        findViewById(R.id.RedditButton).setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.GoogleButton:
                Intent GoogleIntent = new Intent(this, WebActivity.class);
                GoogleIntent.putExtra("Button", "Google");
                startActivity(GoogleIntent);
                break;
            case R.id.SpengergasseButton:
                Intent spIntent = new Intent(this, WebActivity.class);
                spIntent.putExtra("Button", "Spengergasse");
                startActivity(spIntent);
                break;
            case R.id.RedditButton:
                Intent redditIntent = new Intent(this, WebActivity.class);
                redditIntent.putExtra("Button", "Reddit");
                startActivity(redditIntent);
                break;
        }
    }
}
