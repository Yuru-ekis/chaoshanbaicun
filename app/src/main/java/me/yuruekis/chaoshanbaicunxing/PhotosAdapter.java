package me.yuruekis.chaoshanbaicunxing;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.ViewHolder> {

    private Context mContext;

    private List<Photos> mPhotosList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView photosImage;
        TextView photosName;

        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view;
            photosImage = (ImageView) view.findViewById(R.id.photos_image);
            photosName = (TextView) view.findViewById(R.id.photos_name);
        }
    }

    public PhotosAdapter(List<Photos> photosList) {
        mPhotosList = photosList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (mContext == null) {
            mContext = viewGroup.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.photos_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Photos photos = mPhotosList.get(i);
        viewHolder.photosName.setText(photos.getName());
        Glide.with(mContext).load(photos.getPhotosImgURL()).into(viewHolder.photosImage); //加入加载中图片
    }

    @Override
    public int getItemCount() {
        return mPhotosList.size();
    }
}
