package com.source.showcase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.source.showcase.model.ResponseModel;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        WebServiceDelegate.restAdapter.getJsonValues(new Callback<ResponseModel>() {
            @Override
            public void success(ResponseModel responseModel, Response response) {
                textView.setText(responseModel.toString());
            }

            @Override
            public void failure(RetrofitError error) {
                textView.setText("Error: " + error.getMessage());
            }
        });
    }
}
