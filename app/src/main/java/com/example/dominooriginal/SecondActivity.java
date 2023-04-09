package com.example.dominooriginal;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dominooriginal.adapter.PizzaAdapter;
import com.example.dominooriginal.model.Pizza;
import com.example.dominooriginal.retrofit.GetDataService;
import com.example.dominooriginal.retrofit.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecondActivity extends AppCompatActivity {

//    public ImageView btnPindah;
    public ImageView btnPizza;

    private PizzaAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;

//    public ImageView backBeranda;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        progressDialog = new ProgressDialog(SecondActivity.this);
        progressDialog.setMessage("Loading ...");
        progressDialog.show();

        GetDataService service = RetrofitClientInstance.getRetrofit().create(GetDataService.class);
        Call<List<Pizza>> call = service.getPizzas();

        call.enqueue(new Callback<List<Pizza>>() {
            @Override
            public void onResponse(Call<List<Pizza>> call, Response<List<Pizza>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<Pizza>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(SecondActivity.this, "" + t.toString(), Toast.LENGTH_SHORT).show();
                Log.d("error", t.toString());
            }
        });

//        btnPindah = findViewById(R.id.usepromo);
        btnPizza = findViewById(R.id.pizza);
//
//        //        PINDAH HALAMAN
//        btnPindah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent itn = new Intent(getApplicationContext(), ThirdActivity.class);
//                startActivity(itn);
//            }
//        });
//
        btnPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itun = new Intent(getApplicationContext(), FiveActivity.class);
                startActivity(itun);
            }
        });
    }
    private void generateDataList(List<Pizza> body) {
        recyclerView = findViewById(R.id.custom_rec_view);
        adapter = new PizzaAdapter(body, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SecondActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}