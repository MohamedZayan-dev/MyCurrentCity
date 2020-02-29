package com.example.android.mycurrentcity;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {
    ArrayList<CityInfo> cityInfoArrayList;
    Context mContext;

    CityAdapter(Context context, ArrayList<CityInfo> cityInfos) {
        mContext = context;
        cityInfoArrayList = cityInfos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.info, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int imageRes = cityInfoArrayList.get(position).getmImage();
        String title = cityInfoArrayList.get(position).getmTitle();
        String info = cityInfoArrayList.get(position).getMinfo();
        String speciality = cityInfoArrayList.get(position).getMspeciality();
        String address = cityInfoArrayList.get(position).getMaddress();
        holder.image.setImageResource(imageRes);
        holder.title.setText(title);
        holder.info.setText(info);
        holder.speciality.setText(speciality);
        holder.address.setText(address);
    }

    @Override
    public int getItemCount() {
        return cityInfoArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title, info, speciality, address;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            info = itemView.findViewById(R.id.info);
            speciality = itemView.findViewById(R.id.speciality);
            address = itemView.findViewById(R.id.address);
        }
    }
}
