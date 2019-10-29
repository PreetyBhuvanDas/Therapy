package com.example.therapy;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.CustomViewHolder>{

    private Context mContext;
    private List<Doctor> doctors;

    public DoctorAdapter(List<Doctor> doctors, Context mContext) {
        this.mContext = mContext;
        this.doctors = doctors;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.find_card_view, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final DoctorAdapter.CustomViewHolder holder, int position) {
        Doctor doctor = doctors.get(position);
        holder.name.setText(doctor.getName());
        holder.desc.setText(doctor.getDesc());
        holder.price.setText(doctor.getPrice());
        holder.avail.setText(doctor.getAvail());
        holder.rating.setText(doctor.getRating());
        holder.language.setText(doctor.getLangauge());
    }


    @Override
    public int getItemCount() {
        return doctors.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView name, desc,price,avail,rating,language;
        public CustomViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.Doctorname);
            desc= (TextView) itemView.findViewById(R.id.docDress);
            price = (TextView) itemView.findViewById(R.id.docPrice);
            avail= (TextView) itemView.findViewById(R.id.dateAvail);
            rating= (TextView) itemView.findViewById(R.id.docRat);
            language= (TextView)itemView.findViewById(R.id.docLan);
        }
    }
}

