package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvIsi = findViewById(R.id.tvHasil);
        Intent intent = getIntent();
        String isi = intent.getStringExtra("editText");
        tvIsi.setText(isi);
    }
}
