package com.example.dominooriginal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dominooriginal.R;
import com.example.dominooriginal.model.Pizza;

import java.text.BreakIterator;
import java.util.List;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.CustomViewHolder> {
    private List<Pizza> dataPizza;
    private Context context;

    public PizzaAdapter(List<Pizza> dataPizza, Context context) {
        this.dataPizza = dataPizza;
        this.context = context;
    }

//    Membuat Tampilan Awal (create from parent)
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_pizza_domino, parent, false);
        return new CustomViewHolder(view);
    }

//    Mengakses Komponen Layout
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.judulKonten.setText(dataPizza.get(position).getJudulKonten());
        holder.isiKonten.setText(dataPizza.get(position).getIsiKonten());
        holder.hargaKonten.setText(dataPizza.get(position).getHarga());
        holder.promoKonten.setText(dataPizza.get(position).getPromo());
        Glide.with(context).load(dataPizza.get(position).getImageKonten()).into(holder.imageKonten);
    }

//    Mendapatkan Jumlah Array / List
    @Override
    public int getItemCount() {
        return dataPizza.size();
    }

//    Melakukan Proses Binding Terhadap Komponen Layout
    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public final View mview;

        TextView judulKonten, isiKonten, hargaKonten, promoKonten;
        ImageView imageKonten;
        CustomViewHolder(View itemView){
            super(itemView);
            mview = itemView;

            judulKonten = mview.findViewById(R.id.judul);
            isiKonten = mview.findViewById(R.id.isi);
            hargaKonten = mview.findViewById(R.id.harga);
            promoKonten = mview.findViewById(R.id.usepromo);
            imageKonten = mview.findViewById(R.id.img_1);
        }
    }
}
