package com.example.fengjw.adapter;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fengjw.uitest.R;
import com.example.fengjw.utils.Fruit;

import java.util.List;

/**
 * Created by fengjw on 2017/7/19.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){ //optimize efficiency
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageID());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }

    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }

}
