package com.example.pzza;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizaaapp.R;
import com.example.pzza.beans.Pizza;
import com.example.pzza.service.PizzaService;

public class DetailsPizza extends AppCompatActivity {
     private PizzaService fs;
     private ImageView image;
     private TextView desc;
     private TextView nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizzas);
        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idf"));
        fs = PizzaService.getInstance();
        image = findViewById(R.id.photo);
        nom = findViewById(R.id.nom);


        Pizza f = fs.findById(id);
        image.setImageResource(f.getPhoto());
        desc = findViewById(R.id.desc);
        desc.setText(f.getDesc());
        nom.setText(f.getNom());

    }
}
