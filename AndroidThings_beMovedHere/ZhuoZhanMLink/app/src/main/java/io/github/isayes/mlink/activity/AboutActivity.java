package io.github.isayes.mlink.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import io.github.isayes.mlink.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getToolbar();
    }

    @SuppressWarnings("ConstantConditions")
    private void getToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.id_toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(R.drawable.ic_navigate_before_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView pageTitle = (TextView) findViewById(R.id.id_page_title);
        pageTitle.setText(R.string.pageTitle_reg);
    }
}