package com.example.ramadhan.jadwalsolat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import com.example.ramadhan.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;


public class MainAdapterSholat extends RecyclerView.Adapter<MainHolderSholat> {

    private Context mContext;
    private List<ModelMainSholat> items;
    private MainAdapterSholat.onSelectData onSelectData;

    public interface onSelectData {
        void onSelected(ModelMainSholat modelMainSholat);
    }

    public MainAdapterSholat(Context context, List<ModelMainSholat> items, MainAdapterSholat.onSelectData xSelectData) {
        this.mContext = context;
        this.items = items;
        this.onSelectData = xSelectData;
    }

    @Override
    public MainHolderSholat onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_jadwal, parent, false);
        return new MainHolderSholat(v);
    }

    @Override
    public void onBindViewHolder(MainHolderSholat holder, int position) {
        final ModelMainSholat data = items.get(position);

        holder.tvDateMasehi.setText(data.txtDate);
        holder.tvDateHijri.setText(data.txtDay);
        holder.rlPrayList.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.anim));
        holder.rlPrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSelectData.onSelected(data);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
