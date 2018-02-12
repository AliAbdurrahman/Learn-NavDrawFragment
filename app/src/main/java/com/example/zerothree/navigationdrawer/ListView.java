package com.example.zerothree.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListView extends AppCompatActivity {

    android.widget.ListView listQuiz;
    CustomAdaptor adapter;

    String [] menu = {
            "Persib", "Viking Batam", "Viking Persib Club", "SPMB"
    };
    int [] gambar = {
            R.drawable.persib,
            R.drawable.vblogo,
            R.drawable.vpc,
            R.drawable.spmb
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listQuiz = findViewById(R.id.quizList);

        CustomAdaptor customAdaptor = new CustomAdaptor();
        listQuiz.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return gambar.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int Position, View convertView, ViewGroup viewGroup) {

            View view = getLayoutInflater().inflate(R.layout.listlist, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView);
            TextView mTextView = (TextView) view.findViewById(R.id.textView);

            mImageView.setImageResource(gambar[Position]);
            mTextView.setText(menu[Position]);

            return view;
        }
    }
}
