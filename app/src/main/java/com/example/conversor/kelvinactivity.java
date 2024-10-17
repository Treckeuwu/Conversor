package com.example.conversor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import nav.Celsius;
import nav.Farenheit;
import nav.Kelvin;

public class kelvinactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kelvinactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonCelsius = findViewById(R.id.buttonConvert);
        EditText textoplano = findViewById(R.id.editTextCelsius);
        TextView resultado = findViewById(R.id.textViewResult);

        buttonCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Double valorkelvin = Double.parseDouble(textoplano.getText().toString());

                Kelvin kelvin = new Kelvin("F", valorkelvin);

                Farenheit farenheit = new Farenheit("k",kelvin.getValor());
                Kelvin convertidorfaren = kelvin.parse(farenheit);
                Celsius celsius = new Celsius("C",kelvin.getValor());
                Kelvin convertidorcelsius = kelvin.parse(celsius);

                // Mostrar los resultados en el TextView
                resultado.setText("Convertido a celsius: " + convertidorcelsius.getValor() +
                        "\nConvertido a faren: " + convertidorfaren.getValor());

            }
        });
    }
}