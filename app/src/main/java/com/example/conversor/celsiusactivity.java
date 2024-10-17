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
import nav.Grados;
import nav.Kelvin;
import nav.grado;

public class celsiusactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_celsiusactivity);
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
                Double valorCelsius = Double.parseDouble(textoplano.getText().toString());

                Celsius celsius = new Celsius("C",valorCelsius);
                Kelvin kelvin = new Kelvin("k",celsius.getValor());
                Celsius convertidoKelvin = celsius.parse(kelvin);
                Farenheit farenheit = new Farenheit("F",celsius.getValor());
                Celsius convertidoFarenheit = celsius.parse(farenheit);


                resultado.setText("Convertido a Kelvin: " + convertidoKelvin.getValor() +
                        "\nConvertido a Fahrenheit: " + convertidoFarenheit.getValor());


            }
        });
    }

}