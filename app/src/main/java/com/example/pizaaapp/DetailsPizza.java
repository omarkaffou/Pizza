package com.example.pizaaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizaaapp.beans.Pizza;
import com.example.pizaaapp.service.ProduitService;

public class DetailsPizza extends AppCompatActivity {
    private ProduitService fs;
    private ImageView image;
    private TextView desc;
    private TextView nom;
    private TextView ingred;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);
        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idf"));

        fs = ProduitService.getInstance();
        image = findViewById(R.id.photo);
        nom = findViewById(R.id.nom);
        desc = findViewById(R.id.desc);
        ingred = findViewById(R.id.ingred);


        Pizza f = fs.findById(id);
        image.setImageResource(f.getPhoto());
        desc.setText(f.getDescription());
        nom.setText(f.getNom());
        ingred.setText(f.getDetaisIngred());

    }
}

