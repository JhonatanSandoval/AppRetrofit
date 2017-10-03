package com.academiamoviles.appretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ProgressBar;

public class NoticiasActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private RecyclerView rvNoticias;
    private ProgressBar pbLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);

        setupToolbarAndTitle();
        initViews();

        loadNoticias();

    }

    private void loadNoticias() {

    }

    private void initViews() {
        rvNoticias = (RecyclerView) findViewById(R.id.rvNoticias);

        // ADMINISTRADOR DE DISEñO
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(NoticiasActivity.this);
        rvNoticias.setLayoutManager(layoutManager);

        pbLoader = (ProgressBar) findViewById(R.id.pbLoader);
    }

    private void setupToolbarAndTitle() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            setTitle("Noticias del Día");
        }
    }

}
