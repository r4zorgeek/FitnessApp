package com.project.palande.thefitness;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class UpperBodyScrollingActivity extends AppCompatActivity {
    TextView mTextView;

    public static Intent newIntent(Context context, String cardName) {
        Intent intent = new Intent(context, UpperBodyScrollingActivity.class);
        intent.putExtra("CardName", cardName);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        String cardView = getIntent().getSerializableExtra("CardName").toString();
        switch (cardView) {
            case "benchPress":

        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_upper_body_scrolling_container);
        if (fragment == null) {
            fragment = new UpperBodyScollingFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_upper_body_scrolling_container, fragment).commit();
        }
    }



}
