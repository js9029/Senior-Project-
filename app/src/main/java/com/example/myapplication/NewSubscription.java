package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.SearchView;


public class NewSubscription extends AppCompatActivity {

    View blankview;
    private Subscriptions subscriptionList[];
    private LinearLayout subscriptionContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_subscription);
        Toolbar toolbar = (Toolbar)findViewById(R.id.new_sub_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_launcher_background);

        ScrollView scrollView =(ScrollView)findViewById(R.id.subscriptionScrollView);
        scrollView.setVerticalScrollBarEnabled(false);

        subscriptionContainer=(LinearLayout) scrollView.findViewById(R.id.subscriptionScrollViewContent);

        blankview = View.inflate(this, R.layout.no_template_found, null);
        subscriptionContainer.addView(blankview);
        blankview.setVisibility(View.GONE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_new_subscriptions, menu);

        SearchView searchView = (SearchView)menu.findItem(R.id.search).getActionView();
        searchView.setOnQueryTextListener(
                new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String query) {
                        return false;
                    }
                }
        );

        return true;
    }

    public void searchSubscriptions(String query) {
        boolean allResults = true;

        for(int i = 0; i<subscriptionList.length; i++) {
            String name = subscriptionList[i].getName().toLowerCase();
            boolean same = name.contains(query.toLowerCase());
            subscriptionContainer.getChildAt(i);
            allResults &= !same;
        }
    }
}
