package com.android.gajju45.retrofitrecyclerview;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiController {

    //1
    private static final String url="https://jsonplaceholder.typicode.com/";

    //2 class obj bec main call it
    private static  apiController clientObject;

    //3
    private static Retrofit retrofit;

    //method1 constructor retrofit object
    apiController()
    {
        retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    //obj initialize 4


    //method2 retunr run time obj
    public static  synchronized  apiController getInstance()
    {
        if (clientObject== null)
        clientObject=new apiController();

        return clientObject;

    }
    //method3 api return

    apiSet getapi(){
        return  retrofit.create(apiSet.class);
    }

}
