package com.example.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class ImageAdapter  extends BaseAdapter {
    private Context mcontext;
    public Integer[]thumbImages={R.drawable.bluetooth,R.drawable.calculator,R.drawable.chrome,R.drawable.clock,R.drawable.email,R.drawable.files,R.drawable.message,R.drawable.netflix,R.drawable.settings,R.drawable.tools,R.drawable.video};

//    public ImageAdapter(GridwithImageandText gridwithImageandText) {
//    }
   public ImageAdapter(Context c){
       mcontext =c;

    }

    @Override
    public int getCount() {
        return thumbImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {

        ImageView imageView=new ImageView(mcontext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(200,200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);

        return null;
    }
}
