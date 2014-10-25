package com.natdroids.natcodes.phoogle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SearchResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the Intent from SearchActivity
        Intent searchIntent = getIntent();
        String searchTerm = searchIntent.getStringExtra(SearchActivity.SEARCH_KEYWORD);

        // Create a TextView to display the searched term
        TextView displayResult = new TextView(this);
        displayResult.setTextSize(25);
        displayResult.setText(searchTerm);

        // Set the layout to the above TextView to display the message
        setContentView(displayResult);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
