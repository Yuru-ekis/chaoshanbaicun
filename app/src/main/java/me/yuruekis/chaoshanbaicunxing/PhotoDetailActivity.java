package me.yuruekis.chaoshanbaicunxing;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class PhotoDetailActivity extends AppCompatActivity {



    public static final String PHOTOS_NAME = "photos_name";

    public static final String PHOTOS_IMAGE_URL = "photos_image_url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);
        Intent intent = getIntent();
        String photosName = intent.getStringExtra(PHOTOS_NAME);
        final String photosImageURL = intent.getStringExtra(PHOTOS_IMAGE_URL);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_3);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        final FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_zoom);

        ImageView photosImageView = (ImageView) findViewById(R.id.photo_image_view);
        TextView photosContentText = (TextView) findViewById(R.id.photo_content_text);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        //collapsingToolbar.setTitle(photosName);
        collapsingToolbar.setTitle(" ");
        if (!MainActivity.isToastShowed) {
            Toast.makeText(PhotoDetailActivity.this, "提示：点击放大镜可以查看大图噢\n(///▽///)", Toast.LENGTH_SHORT).show();
            MainActivity.isToastShowed = true;
        }

//
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Snackbar.make(floatingActionButton, "点击查看大图功能暂未完成", Snackbar.LENGTH_SHORT)
                        .setActionTextColor(Color.parseColor("#f48fb1"))
                        .setAction("好的", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();*/
                Intent intent1 = new Intent(PhotoDetailActivity.this, ImageDisplayActivity.class);
                intent1.putExtra("photo_url", photosImageURL);
                startActivity(intent1);
            }
        });
// 点击图片查看大图
        photosImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(PhotoDetailActivity.this, ImageDisplayActivity.class);
                intent1.putExtra("photo_url", photosImageURL);
                startActivity(intent1);
            }
        });


        Glide.with(this).load(photosImageURL).into(photosImageView);
        //(deprecated)
        // String photosContent = // 待实现 加载照片文字简介
        // photosContentText.setText(photosContent);
        //(deprecated)
        photosContentText.setText(PhotoDetailSwitcher.getPhotoDetail(photosName)); //根据不同 photo 加载不同的文字
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
