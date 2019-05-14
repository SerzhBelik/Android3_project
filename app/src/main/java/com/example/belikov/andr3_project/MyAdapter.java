package com.example.belikov.andr3_project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<String> list;

    public MyAdapter(Context context, List<String> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.bind(i);
    }

    @Override
    public int getItemCount() {
//        return list.size();
        return 20;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            imageView = itemView.findViewById(R.id.image_view);
        }

        public void bind(int i) {
            textView.setText(list.get(i%4));
            switch (i%4){
                case 0:
                    imageView.setImageResource(R.drawable.fruit1);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.fruit2);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.fruit3);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.fruit4);
                    break;
            }
        }
    }
}
