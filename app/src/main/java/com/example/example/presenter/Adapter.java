package com.example.example.presenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.example.R;
import com.example.example.model.Data;

import java.util.ArrayList;

//import butterknife.BindView;
//import butterknife.ButterKnife;

public class Adapter  extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private ArrayList<Data> mDataList;

    public Adapter(ArrayList<Data> mDataList) {
        this.mDataList = mDataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
       MyViewHolder myViewHolder=new MyViewHolder(v);
       return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Data current = mDataList.get(position);
        holder.mImageView.setImageResource(current.getmImageResource());
        holder.textView.setText(current.getmText());



    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

//        @BindView(R.id.image_view)
//        ImageView imageView;
//
//        @BindView(R.id.Text_view)
//        TextView text1;

        public ImageView mImageView;
        public TextView textView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //ButterKnife.bind(this,itemView);
            // imageView = findViewByid
            mImageView = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.Text_view);

        }
    }
}
