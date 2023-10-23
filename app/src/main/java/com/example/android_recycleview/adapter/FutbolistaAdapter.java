package com.example.android_recycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_recycleview.R;

import java.util.List;

import models.Futbolista;

public class FutbolistaAdapter extends RecyclerView.Adapter<FutbolistaAdapter.ViewHolder> {
    private List<Futbolista> futbolistas;

    public FutbolistaAdapter(List<Futbolista> futbolistas) {
        this.futbolistas = futbolistas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.futbolista_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Futbolista futbolista = futbolistas.get(position);
        holder.tvNombre.setText(futbolista.getNombre());
        holder.tvPosicion.setText(futbolista.getPosicion());
        holder.tvNacionalidad.setText(futbolista.getNacionalidad());
    }

    @Override
    public int getItemCount() {
        return futbolistas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvPosicion, tvNacionalidad;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvPosicion = itemView.findViewById(R.id.tvPosicion);
            tvNacionalidad = itemView.findViewById(R.id.tvNacionalidad);
        }
    }
}