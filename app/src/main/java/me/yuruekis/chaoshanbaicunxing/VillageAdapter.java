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
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

public class VillageAdapter extends RecyclerView.Adapter<VillageAdapter.ViewHolder> {

    private Context mContext;

    private List<Village> mVillageList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView villageImage;
        TextView villageName;

        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view;
            villageImage = (ImageView) view.findViewById(R.id.village_image);
            villageName = (TextView) view.findViewById(R.id.village_name);
        }
    }

    public VillageAdapter(List<Village> villageList) {
        mVillageList = villageList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (mContext == null) {
            mContext = viewGroup.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.village_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Village village = mVillageList.get(i);
        viewHolder.villageName.setText(village.getName());
        Glide.with(mContext)
                .load(village.getVillageImageURL())
                .thumbnail(Glide.with(mContext).load(R.drawable.loading))
                .into(viewHolder.villageImage);
    }

    @Override
    public int getItemCount() {
        return mVillageList.size();
    }
}
