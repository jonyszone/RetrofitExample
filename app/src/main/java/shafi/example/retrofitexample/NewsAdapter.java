package shafi.example.retrofitexample;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import shafi.example.retrofitexample.NewsDetailsActivity;
import shafi.example.retrofitexample.R;
import shafi.example.retrofitexample.newsresponse.Article;

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
        newsViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Article article = articleList.get(i);
                Intent intent = new Intent(context, NewsDetailsActivity.class);
                intent.putExtra("article", article);
                context.startActivity(intent);
            }
        });
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
