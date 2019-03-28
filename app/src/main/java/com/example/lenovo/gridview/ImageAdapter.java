package com.example.lenovo.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
private Context context;
public Integer[] images={R.drawable.antman,R.drawable.blackpanther,R.drawable.captainamerica,
        R.drawable.spiderman,R.drawable.wonderwoman,R.drawable.frozen,R.drawable.gijoe,R.drawable.harrypotter,
        R.drawable.inception,R.drawable.interstellar,R.drawable.johncarter,R.drawable.oceans8,R.drawable.superman,
        R.drawable.fantastic,R.drawable.logan,R.drawable.hulk,R.drawable.thor,R.drawable.ironman};

    public ImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView= new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT,150));
        return imageView;
    }
}
