package com.cjj.httpdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HttpDemoActivity extends AppCompatActivity {
    private RecyclerView rv_list;
    private String[] title_item =
            {
                    "How to use GET obtain String or Object","How to use POST obtain String or Object",
                    "How to download from the Internet","How to display images for the web","How to show local pictures"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_demo);
        rv_list = (RecyclerView) this.findViewById(R.id.rv_list);
        rv_list.setLayoutManager(new LinearLayoutManager(this));
        rv_list.setAdapter(new DemoAdapter());
    }


    private class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = getLayoutInflater().inflate(R.layout.item_demo,null);
            ViewHolder viewHolder = new ViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.tv_title.setText(title_item[position]);
            holder.tv_title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (position)
                    {
                        case 0:
                            startActivity(new Intent(HttpDemoActivity.this,GetExampleActivity.class));
                            break;
                        case 1:
                            startActivity(new Intent(HttpDemoActivity.this,PostExampleActivity.class));
                            break;
                        case 2:
                            startActivity(new Intent(HttpDemoActivity.this,DownloadActivity.class));
                            break;
                        case 3:
                            startActivity(new Intent(HttpDemoActivity.this,DisplayNetImageActivity.class));
                            break;
                        case 4:
                            startActivity(new Intent(HttpDemoActivity.this,DisplayLocalImageActivity.class));
                            break;
                    }
                }
            });
        }

        @Override
        public int getItemCount() {
            return title_item.length;
        }

        public class ViewHolder extends RecyclerView.ViewHolder
        {
            private TextView tv_title;
            public ViewHolder(View itemView) {
                super(itemView);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            }
        }
    }
}
