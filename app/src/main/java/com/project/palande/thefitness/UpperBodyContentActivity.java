package com.project.palande.thefitness;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class UpperBodyContentActivity extends AppCompatActivity {
    CardView mCardView;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, UpperBodyContentActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mCardView = (CardView) findViewById(R.id.barbell_bench_press_card);
        mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = UpperBodyScrollingActivity.newIntent(UpperBodyContentActivity.this, "benchPress");
                startActivity(intent);
            }
        });


    }

}
