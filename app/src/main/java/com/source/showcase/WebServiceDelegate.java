package com.source.showcase;

import com.source.showcase.model.ResponseModel;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;

/**
 * Created by aliyakgul on 21/10/16.
 */

public interface WebServiceDelegate {

    WebServiceDelegate restAdapter = new RestAdapter.Builder()
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .setEndpoint("http://headers.jsontest.com")
            .build()
            .create(WebServiceDelegate.class);

    @GET("/")
    void getJsonValues(Callback<ResponseModel> response);

}
