package me.chensir.expandabletextview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample2);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new SampleTextListAdapter(this));

    }
}
