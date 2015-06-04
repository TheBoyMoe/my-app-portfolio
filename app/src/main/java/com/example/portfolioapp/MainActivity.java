package com.example.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonSpotifyApp;
    private Button mButtonScoresApp;
    private Button mButtonLibraryApp;
    private Button mButtonBuildItApp;
    private Button mButtonReaderApp;
    private Button mButtonCapstoneApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // get references to all the button view's
        mButtonSpotifyApp = (Button) findViewById(R.id.button_spotify_app);
        mButtonScoresApp = (Button) findViewById(R.id.button_scores_app);
        mButtonLibraryApp = (Button) findViewById(R.id.button_library_app);
        mButtonBuildItApp = (Button) findViewById(R.id.button_build_it_app);
        mButtonReaderApp = (Button) findViewById(R.id.button_reader_app);
        mButtonCapstoneApp = (Button) findViewById(R.id.button_capstone_app);

        // set the onClick listener on the buttons
        mButtonSpotifyApp.setOnClickListener(this);
        mButtonScoresApp.setOnClickListener(this);
        mButtonLibraryApp.setOnClickListener(this);
        mButtonBuildItApp.setOnClickListener(this);
        mButtonReaderApp.setOnClickListener(this);
        mButtonCapstoneApp.setOnClickListener(this);

    }


    // deal with button clicks
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button_spotify_app:
                showText(getString(R.string.button_spotify_streamer_title));
                break;
            case R.id.button_scores_app:
                showText(getString(R.string.button_scores_app_title));
                break;
            case R.id.button_library_app:
                showText(getString(R.string.button_library_app_title));
                break;
            case R.id.button_build_it_app:
                showText(getString(R.string.button_build_it_app_title));
                break;
            case R.id.button_reader_app:
                showText(getString(R.string.button_reader_app_title));
                break;
            case R.id.button_capstone_app:
                showText(getString(R.string.button_capstone_app_title));
                break;

        }

    }


    private void showText(String title) {
        Toast.makeText(MainActivity.this, "Launch the "
                + title, Toast.LENGTH_SHORT).show();
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


}
