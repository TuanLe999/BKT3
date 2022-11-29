package com.example.bkt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ThiAdapter extends RecyclerView.Adapter<ThiAdapter.PhepTinhViewHolder> {
    private static final String TAG = "SongAdapter";
    private List<Thi> mThiList;
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public ThiAdapter(Context context, List<Thi> datas) {
        mContext = context;
        mThiList = datas;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public PhepTinhViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate view from row_item_song.xml
        View itemView = mLayoutInflater.inflate(R.layout.row_item_vidu, parent, false);
        return new PhepTinhViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PhepTinhViewHolder holder, int position) {
        // Get song in mSong via position
        Thi thi = mThiList.get(position);

        //bind data to viewholder
        holder.thi_txt.setText(String.valueOf(thi.getTen()));
        holder.viDu_txt.setText(String.valueOf(thi.getViDu()));

    }

    @Override
    public int getItemCount() {
        return mThiList.size();
    }


    class PhepTinhViewHolder extends RecyclerView.ViewHolder {
        private TextView thi_txt;
        private TextView viDu_txt;



        public PhepTinhViewHolder(View itemView) {
            super(itemView);
            viDu_txt = itemView.findViewById(R.id.vidu_txt);
            thi_txt = itemView.findViewById(R.id.thi_txt);

        }
    }
}
