package com.example.intentdts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_third extends AppCompatActivity implements View.OnClickListener
{
    TextView tvNamaSaya;
    Button btnPindahSatu;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvNamaSaya = findViewById(R.id.tv_namaSaya);
        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);

        btnPindahSatu = findViewById(R.id.btn_pindah_satu);

        btnPindahSatu.setOnClickListener(this);

        if(TextUtils.isEmpty(nama))
        {
            tvNamaSaya.setText("Field Nama belum diisi");
        }
        else
        {
            tvNamaSaya.setText("Nama Saya " + nama);
        }
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_pindah_satu:
                pindahSatu();
                break;
        }
    }

    private void pindahSatu()
    {
        Intent moveSatu = new Intent(Activity_third.this, MainActivity.class);
        startActivity(moveSatu);
    }

}