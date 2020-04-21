package shafi.example.retrofitexample.newsresponse;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import shafi.example.retrofitexample.R;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private Context context;
    private List <Article> articleList;

    public NewsAdapter(Context context, List<Article> articleList) {
        this.context = context;
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_row, viewGroup, false);

        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {
        newsViewHolder.titleTV.setText(articleList.get(i).getTitle());
        newsViewHolder.sourceTV.setText(articleList.get(i).getSource().getName());
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    class  NewsViewHolder extends RecyclerView.ViewHolder{

        TextView titleTV, sourceTV;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.row_title);
            sourceTV = itemView.findViewById(R.id.row_source);
        }
    }
}
