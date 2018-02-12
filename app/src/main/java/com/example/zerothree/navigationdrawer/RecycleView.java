package com.example.zerothree.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecycleView extends AppCompatActivity {

    RecyclerView recyclerQuiz;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerQuiz = (RecyclerView)findViewById(R.id.recyclerList);

        recyclerQuiz.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter();
        recyclerQuiz.setAdapter(adapter);
    }

    String [] tempat = {
            "Harris Hotel", "Hotel 01", "Hotel Pacific", "Wisma Batam", "Sky-Inn Hotel"
    };
    int [] gambar2 = {
            R.drawable.harishotel,
            R.drawable.hotelkosong,
            R.drawable.pacifichotel,
            R.drawable.pihhotel,
            R.drawable.skyhotel
    };

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclelist, null);
            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {
            holder.judul.setText(tempat[position]);
            holder.img.setImageResource(gambar2[position]);

        }

        @Override
        public int getItemCount() {
            return tempat.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView judul;
            ImageView img;
            public MyViewHolder(View itemView) {
                super(itemView);

                judul = itemView.findViewById(R.id.judul);
                img = itemView.findViewById(R.id.img);

            }
        }
    }

}
