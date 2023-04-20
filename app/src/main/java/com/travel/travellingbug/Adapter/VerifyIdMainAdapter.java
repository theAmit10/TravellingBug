package com.travel.travellingbug.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.travel.travellingbug.Model.VerifyIdMainModel;
import com.travel.travellingbug.R;

import java.util.ArrayList;

public class VerifyIdMainAdapter extends RecyclerView.Adapter<VerifyIdMainAdapter.ViewHolder> {

    Context context;
    ArrayList<VerifyIdMainModel> list;

    public VerifyIdMainAdapter(Context context, ArrayList<VerifyIdMainModel> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.design_verify_id_main,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        VerifyIdMainModel verifyIdMainModel = list.get(position);

        holder.titleVIMtv.setText(verifyIdMainModel.getTitleVIMtv());
        holder.descriptionVIMtv.setText(verifyIdMainModel.getDescriptionVIMtv());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleVIMtv,descriptionVIMtv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleVIMtv = itemView.findViewById(R.id.titleVIMtv);
            descriptionVIMtv = itemView.findViewById(R.id.descriptionVIMtv);
        }
    }
}
