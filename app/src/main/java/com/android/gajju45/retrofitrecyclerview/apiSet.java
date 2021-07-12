package com.android.gajju45.retrofitrecyclerview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiSet {

   @GET("posts")
    Call<List<responsemodel>> getData();


}
