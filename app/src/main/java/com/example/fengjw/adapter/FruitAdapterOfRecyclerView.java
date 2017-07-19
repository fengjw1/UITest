package com.example.fengjw.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fengjw.uitest.R;
import com.example.fengjw.utils.Fruit;

import java.util.List;

/**
 * Created by fengjw on 2017/7/19.
 */

public class FruitAdapterOfRecyclerView extends RecyclerView.Adapter<FruitAdapterOfRecyclerView.ViewHolder> {

    private List<Fruit> mFruitList;

    public FruitAdapterOfRecyclerView(List<Fruit> mFruitList) {
        this.mFruitList = mFruitList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(FruitAdapterOfRecyclerView.ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageID());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView fruitName;
        ImageView fruitImage;

        public ViewHolder(View view){
            super(view);
            fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            fruitName = (TextView)view.findViewById(R.id.fruit_name);
        }

    }


}
