package android.example.com.blogapp.activity;

import android.example.com.blogapp.R;
import android.example.com.blogapp.adapter.BlogListAdapter;
import android.example.com.blogapp.model.BlogListModel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView recBlogList;
    ArrayList<BlogListModel> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mData = new ArrayList<>();
        mData.add(new BlogListModel("Hello", R.drawable.ic_launcher_background));
        mData.add(new BlogListModel("Hi", R.drawable.ic_launcher_background));
        mData.add(new BlogListModel("Tanya", R.drawable.ic_launcher_background));
        mData.add(new BlogListModel("perrot", R.drawable.ic_launcher_background));
        recBlogList = findViewById(R.id.recycler_blog_list);
        recBlogList.setHasFixedSize(true);
        recBlogList.setLayoutManager(new LinearLayoutManager(this));
        recBlogList.setAdapter(new BlogListAdapter(this,mData));
    }
}
