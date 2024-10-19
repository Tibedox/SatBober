package com.example.satbober;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    TextView textCounter;
    TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textCounter = findViewById(R.id.text2);
        textTitle = findViewById(R.id.text1);
    }

    public void tapBober(View view) {
        counter += 1;
        textCounter.setText("Потрогали " + counter + " раз");
        if(counter == 10){
            textTitle.setText("Молодец, тапай, не останавливайся");
        } else if(counter == 20){
            textTitle.setText("Ты герой, продолжай!");
        } else if(counter == 30){
            textTitle.setText("Вау, как круто!");
        } else{
            textTitle.setText("Потапай бобра!");
        }
    }
}