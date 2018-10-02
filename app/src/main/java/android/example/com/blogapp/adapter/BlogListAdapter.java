package android.example.com.blogapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.example.com.blogapp.R;
import android.example.com.blogapp.activity.DescriptionActivity;
import android.example.com.blogapp.model.BlogListModel;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BlogListAdapter extends RecyclerView.Adapter<BlogListAdapter.BlogListViewHolder> {
    private Context mCtx;
    private ArrayList<BlogListModel> mData;

    public BlogListAdapter(Context mCtx, ArrayList<BlogListModel> mData) {
        this.mCtx = mCtx;
        this.mData = mData;
    }

    @NonNull
    @Override
    public BlogListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.blog_item,parent,false);

        return new BlogListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BlogListViewHolder holder, int position) {
        BlogListModel model = mData.get(position);
        holder.image.setImageResource(R.drawable.ic_launcher_background);
        holder.textView.setText(model.getTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class BlogListViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView textView;
        public BlogListViewHolder(final View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageBlogList);
            textView =itemView.findViewById(R.id.txtBlogListName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mCtx.startActivity(new Intent(mCtx, DescriptionActivity.class));
                }
            });
        }
    }


}
