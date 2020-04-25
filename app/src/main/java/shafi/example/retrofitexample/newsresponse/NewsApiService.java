package shafi.example.retrofitexample.newsresponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsApiService {
    @GET("v2/everything?q=bitcoin&from=2020-03-25&sortBy=publishedAt&apiKey=72a36bd86df2459bbee42beaac773b1e")
    Call<NewsResponse> getNewsResponse();
}
