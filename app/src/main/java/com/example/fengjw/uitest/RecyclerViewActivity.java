package com.example.fengjw.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.fengjw.adapter.FruitAdapterOfRecyclerView;
import com.example.fengjw.utils.Fruit;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initFruit();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.activity_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterOfRecyclerView adapterOfRecyclerView = new FruitAdapterOfRecyclerView(fruitList);
        recyclerView.setAdapter(adapterOfRecyclerView);
    }
    private void initFruit(){
        for (int i = 0; i < 2; i ++){
            Fruit apple = new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("banana",R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("orange",R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("watermelon",R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("pear",R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("grape",R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("pineapple",R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("strawberry",R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("cherry",R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("mango",R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }
}
