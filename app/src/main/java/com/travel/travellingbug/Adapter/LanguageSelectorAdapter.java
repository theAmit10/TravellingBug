package com.travel.travellingbug.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.travel.travellingbug.Model.LanguageSelectorModel;
import com.travel.travellingbug.R;

import java.util.ArrayList;

public class LanguageSelectorAdapter extends  RecyclerView.Adapter<LanguageSelectorAdapter.ViewHolder> {

    Context context;
    ArrayList<LanguageSelectorModel> list;

    public LanguageSelectorAdapter(Context context, ArrayList<LanguageSelectorModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.design_language,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        LanguageSelectorModel languageSelectorModel = list.get(position);

        ;

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RadioButton radioButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            radioButton = itemView.findViewById(R.id.radioButton);


        }
    }
}
