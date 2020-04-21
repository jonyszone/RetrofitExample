package shafi.example.retrofitexample.newsresponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsApiService {
    @GET("v2/everything?q=bitcoin&from=2020-03-21&sortBy=publishedAt&apiKey=d7174588e991432ebf4e85023fb69763")
    Call<NewsResponse> getNewsResponse();
}
