package com.natdroids.natcodes.phoogle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;


public class SearchActivity extends Activity{

    public final static String SEARCH_KEYWORD = "com.natcodes.natdroids.phoogle.SEARCH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search, menu);
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

    public void search(View view) {
        // Get the keyword entered by user
        EditText searchText = (EditText)findViewById(R.id.searchText);
        String searchKey = searchText.getText().toString();

        // Build an Intent add the searched keyword and pass it on
        Intent searchIntent = new Intent(this, SearchResultActivity.class);
        searchIntent.putExtra(SEARCH_KEYWORD, searchKey);
        startActivity(searchIntent);
    }
}
