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
    String sDown, sUp;
    TextView textCounter;
    TextView textHeader;

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
        textHeader = findViewById(R.id.text1);
        textCounter = findViewById(R.id.text2);
    }

    public void tapBober(View view) {
        counter += 1;
        sDown = "Потрогали " + counter + ok(counter);
        sUp = "Потрогай бобра!";
        if(counter == 10) {
            sUp = "Трогай, трогай, не останавливайся!";
        }
        if(counter > 20 & counter < 25) {
            sUp = "Ты молодец! трогай дальше!";
        }
        textHeader.setText(sUp);
        textCounter.setText(sDown);
    }

    String ok(int x) {
        String str = " раз";
        if(x%10>1 & x%10<5 & x/10%10!=1){
            str = " раза";
        }
        return str;
    }
}