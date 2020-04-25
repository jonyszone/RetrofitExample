package shafi.example.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import shafi.example.retrofitexample.newsresponse.Article;

public class NewsDetailsActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        imageView = findViewById(R.id.newImage);
        Article article  = (Article) getIntent().getSerializableExtra("article");
        if (article != null) {
            String imageUrl = article.getUrlToImage();
            Picasso.get().load(imageUrl).into(imageView);
        }
    }
}
