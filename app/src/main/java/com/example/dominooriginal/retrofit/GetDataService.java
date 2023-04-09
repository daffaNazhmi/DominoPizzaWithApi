package com.example.dominooriginal.retrofit;

import com.example.dominooriginal.model.Pizza;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/PizzaDomino.json")
    public Call<List<Pizza>> getPizzas();
}
