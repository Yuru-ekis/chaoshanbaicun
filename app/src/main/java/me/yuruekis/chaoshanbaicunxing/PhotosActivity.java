package me.yuruekis.chaoshanbaicunxing;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PhotosActivity extends AppCompatActivity {

    public static final String VILLAGE_NAME = "village_name";

    private DrawerLayout mDrawerLayout;

    private List<Photos> photosList = new ArrayList<>(Arrays.asList(new Photos("大门", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("庭院", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("广场", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("房屋", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("住宅", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("院子", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg")));

    private PhotosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);

        // 头像简介
        TextView introVillage = (TextView) findViewById(R.id.intro_village);
        CircleImageView introAvatar = (CircleImageView) findViewById(R.id.avatar_village);
        //界面 头像
        introAvatar.setImageResource(R.drawable.village);


        Intent intent = getIntent();
        String villageName = intent.getStringExtra(VILLAGE_NAME); //从 intent 中获取村庄名

        photosList = PhotosSwitcher.getPhotosList(villageName); //获取到村庄名对应的

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_2);
        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_2);
        final NavigationView navView = (NavigationView) findViewById(R.id.nav_view_2);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
            actionBar.setSubtitle(villageName);
        }
//通过村庄名来设置简介文本
        switch (villageName) {
            case "乔林村":
                introVillage.setText("乔林村位于广东省潮州市潮安县政府驻地东南2.2千米，庵埠镇政府驻地东2.1千米。地处庵江东南。属庵埠镇。人口687人，面积0.125平方公里。");  //设置简介
                //introAvatar.setImageResource(R.drawable.meihua);  //设置简介处头像
                break;
            case "桃山村":
                introVillage.setText("桃山村受揭阳管辖，于新市村、浮岗村相邻，民风淳朴。有两座古牌坊-跃禹门坊和百岁坊。桃山村村庄秀丽，人文鼎盛，是炮台镇的一个有名村庄");
                //introAvatar.setImageResource(R.drawable.avatar_new);
                break;
            case "贾里村":
                introVillage.setText("贾里村总面积约2平方公里，720户，3269人，地处潮、揭交界，包括西厝、东厝、寨内和巷头四个自然村");
                break;
            default:
                break;
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
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_2);

        final View header = findViewById(R.id.header);
        header.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                recyclerView.setPadding(0, header.getMeasuredHeight(), 0, 0);
                recyclerView.scrollToPosition(0);
                header.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            private int scrollY = 0; // side-effect: this will be out of accuracy after changing items
            private boolean isCollapsed = false;

            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                scrollY += dy;
                /*
                    Makito 写的，太感谢惹！！！！！！！！！！！！！


                    Makito 棒棒！！！！！！！！！！
                */
                // 使用哪种效果就取消注释即可，三选一

                // 第一种效果，上滑 header 跟随滑动直至隐藏，下滑 header 跟随直至完全显示
                /*
                if (dy > 0) {
                    header.setTranslationY(Math.max(header.getTranslationY() - dy, -header.getMeasuredHeight()));
                } else if (dy < 0) {
                    header.setTranslationY(Math.min(0, header.getTranslationY() - dy));
                }
                */

                // 下面是第二种效果，手指向上滑动 header 高度后 header 隐藏，手指向下滑动时快到顶部时显示 header
                /*
                if (scrollY > header.getMeasuredHeight() && !isCollapsed) {
                    isCollapsed = true;
                    header.clearAnimation();
                    header.animate().translationY(-header.getMeasuredHeight()).setDuration(300).start();
                } else if (scrollY < header.getMeasuredHeight() && isCollapsed) {
                    isCollapsed = false;
                    header.clearAnimation();
                    header.animate().translationY(0).setDuration(300).start();
                }
                */

                // 第一种效果的变体，自带动画不跟随滑动

                if (scrollY > header.getMeasuredHeight() && dy > 0 && !isCollapsed) {
                    isCollapsed = true;
                    header.clearAnimation();
                    header.animate().translationY(-header.getMeasuredHeight()).setDuration(300).start();
                } else if (dy < 0 && isCollapsed) {
                    isCollapsed = false;
                    header.clearAnimation();
                    header.animate().translationY(0).setDuration(300).start();
                }

            }
        });
        adapter = new PhotosAdapter(photosList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
