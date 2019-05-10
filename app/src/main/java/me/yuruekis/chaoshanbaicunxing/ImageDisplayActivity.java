package me.yuruekis.chaoshanbaicunxing;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.blankj.utilcode.util.ImageUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.SimpleTarget;

import com.bumptech.glide.request.transition.Transition;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

import java.io.File;

import static android.view.View.GONE;

public class ImageDisplayActivity extends AppCompatActivity {
    File resource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);
        //从 intent 中获取图片的 URL
        Intent intent = getIntent();
        String photoImageURL = intent.getStringExtra("photo_url");

        final SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) findViewById(R.id.largeImageDisplay);

        /*subsamplingScaleImageView.setMinimumScaleType(SubsamplingScaleImageView.SCALE_TYPE_CUSTOM);              subsamplingScaleImageView.setMinScale(0.1F);//最小显示比例
        subsamplingScaleImageView.setMaxScale( 5.0f);//最大显示比例
        File file = new File(saveFilePath);
// 将图片文件给SubsamplingScaleImageView,这里注意设置ImageViewState设置初始显示比例
// ImageViewState的三个参数为：scale,center,orientation
        subsamplingScaleImageView.setImage(ImageSource.uri(Uri.fromFile(file)),new ImageViewState(1.0f, new PointF(0, 0), 0));
*/

        /*Glide.with(this).load(photoImageURL).downloadOnly(new SimpleTarget<File>() {
            @Override
            public void onResourceReady(File resource, GlideAnimation<? super File> glideAnimation) {
                subsamplingScaleImageView.setImage(ImageSource.uri(resource.getAbsolutePath()),
                        new ImageViewState(1.0f, new PointF(0, 0), 0));
            }
        });

*/

        Glide.with(this).load(photoImageURL).into(new CustomViewTarget<SubsamplingScaleImageView, Drawable>(subsamplingScaleImageView) {
            @Override
            public void onLoadFailed(@Nullable Drawable errorDrawable) {

            }

            @Override
            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                Bitmap bitmap = ImageUtils.drawable2Bitmap(resource);
                subsamplingScaleImageView.setImage(ImageSource.bitmap(bitmap));
            }

            @Override
            protected void onResourceCleared(@Nullable Drawable placeholder) {

            }
        });

    }



    /**
     * 计算出图片初次显示需要放大倍数
     * @param imagePath 图片的绝对路径
     */
    public float getInitImageScale(String imagePath){
        Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
        WindowManager wm = this.getWindowManager();
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        // 拿到图片的宽和高
        int dw = bitmap.getWidth();
        int dh = bitmap.getHeight();
        float scale = 1.0f;
        //图片宽度大于屏幕，但高度小于屏幕，则缩小图片至填满屏幕宽
        if (dw > width && dh <= height) {
            scale = width * 1.0f / dw;
        }
        //图片宽度小于屏幕，但高度大于屏幕，则放大图片至填满屏幕宽
        if (dw <= width && dh > height) {
            scale = width * 1.0f / dw;
        }
        //图片高度和宽度都小于屏幕，则放大图片至填满屏幕宽
        if (dw < width && dh < height) {
            scale = width * 1.0f / dw;
        }
        //图片高度和宽度都大于屏幕，则缩小图片至填满屏幕宽
        if (dw > width && dh > height) {
            scale = width * 1.0f / dw;
        }
        return scale;
    }
}
