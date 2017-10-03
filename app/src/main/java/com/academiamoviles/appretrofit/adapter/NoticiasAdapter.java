package com.academiamoviles.appretrofit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.academiamoviles.appretrofit.R;
import com.academiamoviles.appretrofit.model.NoticiaModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasAdapter.NoticiaHolder> {

    private List<NoticiaModel> listaNoticias;
    private Context mContext;

    public void setListaNoticias(List<NoticiaModel> listaNoticias) {
        this.listaNoticias = listaNoticias;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public NoticiaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NoticiaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_noticia, parent, false));
    }

    @Override
    public void onBindViewHolder(NoticiaHolder holder, int position) {
        NoticiaModel objetoNoticia = listaNoticias.get(position);
        Picasso.with(mContext).load(objetoNoticia.getImagen()).into(holder.ivImagen);
        holder.tvTitulo.setText(objetoNoticia.getTitulo());
    }

    @Override
    public int getItemCount() {
        return listaNoticias.size();
    }

    class NoticiaHolder extends RecyclerView.ViewHolder {

        ImageView ivImagen;
        TextView tvTitulo;

        public NoticiaHolder(View itemView) {
            super(itemView);

            ivImagen = itemView.findViewById(R.id.ivImagen);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);

        }
    }

}