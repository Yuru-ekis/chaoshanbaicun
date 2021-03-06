/*
* 我永远喜欢
* Makito
*
*
 */


package me.yuruekis.chaoshanbaicunxing;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private MediaPlayer mp=new MediaPlayer();
    public static boolean isToastShowed = false;

    private DrawerLayout mDrawerLayout;
    //private SwipeRefreshLayout swipeRefresh;

    //private Village[] villages = {new Village("乔林村", "https://i.loli.net/2019/03/29/5c9e1a0004541.jpg"), new Village("桃山村", "https://i.loli.net/2019/03/29/5c9e1a0004541.jpg"), new Village("贾里村", "https://i.loli.net/2019/03/29/5c9e1a0004541.jpg")};

    private List<Village> villageList = new ArrayList<>(Arrays.asList(new Village("乔林村", "https://i.loli.net/2019/05/15/5cdbc8941f86c91854.jpg"), new Village("桃山村", "https://i.loli.net/2019/05/15/5cdbc894c991a23083.jpg"), new Village("贾里村", "https://i.loli.net/2019/05/15/5cdbc8937099e58434.jpg")));

    private VillageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MediaPlayer mp =MediaPlayer.create(this, R.raw.bgm);
        //mp.start();
        Intent intent = new Intent(MainActivity.this, MusicService.class);
        startService(intent);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        final NavigationView navView = (NavigationView) findViewById(R.id.nav_view);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //actionBar.setDisplayHomeAsUpEnabled(true);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.tobecontinue:
                        Snackbar.make(navView, "未完成的功能", Snackbar.LENGTH_SHORT)
                                .setActionTextColor(Color.parseColor("#f48fb1"))
                                .setAction("好的", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                    }
                                }).show();
                }
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new VillageAdapter(villageList);
        recyclerView.setAdapter(adapter);
    }

    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.play:
                //mp.start();
                //Intent intent = new Intent(this, MusicService.class);
                //startService(intent);
            case R.id.stop:
                //Intent intent2 = new Intent(this, MusicService.class);
                //stopService(intent2);
            default:
        }
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent2 = new Intent(this, MusicService.class);
        stopService(intent2);
    }
}
