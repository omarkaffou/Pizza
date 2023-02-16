package com.example.pizaaapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizaaapp.R;
import com.example.pizaaapp.beans.Pizza;

import java.util.List;



public class ProduitAdapter extends BaseAdapter {
    private List<Pizza> pizza;
    private LayoutInflater inflater;

    public ProduitAdapter(Activity activity, List<Pizza> pizza) {
        this.pizza = pizza;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return pizza.size();
    }

    @Override
    public Object getItem(int position) {
        return pizza.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.pizza_item, null);

        TextView idf = convertView.findViewById(R.id.idf);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView duree = convertView.findViewById(R.id.duree);
        ImageView photo = convertView.findViewById(R.id.photo);
        TextView nbreIngredient = convertView.findViewById(R.id.nbreIngredients);

        idf.setText(pizza.get(position).getId()+"");
        nom.setText(pizza.get(position).getNom());
        duree.setText(pizza.get(position).getDuree());
        nbreIngredient.setText(pizza.get(position).getNbreIngredients()+" ");


        photo.setImageResource(pizza.get(position).getPhoto());




        return convertView;
    }
}
