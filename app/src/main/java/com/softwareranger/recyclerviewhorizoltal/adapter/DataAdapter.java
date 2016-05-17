package com.softwareranger.recyclerviewhorizoltal.adapter;

/**
 * Created by mac on 5/6/16 AD.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.softwareranger.recyclerviewhorizoltal.R;
import com.softwareranger.recyclerviewhorizoltal.model.Model;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{

    private ArrayList<Model> android;
    private Context context;
    private String strName;

    public DataAdapter(Context context, ArrayList<Model> android) {
        this.context = context;
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int i) {
        final View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_row, viewGroup, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(context, strChannels, Toast.LENGTH_SHORT).show();
            }
        });
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        //  String thumbnail = android.get(i).getChannel_thumbnail_circle();
        viewHolder.tvName.setText(android.get(i).getName());

        try {
            Picasso.with(context).load(android.get(i).getImage()).resize(80, 80).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(viewHolder.ivImage);
        } catch (IllegalArgumentException e) {
            viewHolder.ivImage.setImageResource(R.mipmap.ic_launcher);
        }

        strName = android.get(i).getName();
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName;
        private ImageView ivImage;
        public ViewHolder(View view) {
            super(view);

            tvName = (TextView)view.findViewById(R.id.textView);
            ivImage = (ImageView) view.findViewById(R.id.imageView);

        }
    }

}
