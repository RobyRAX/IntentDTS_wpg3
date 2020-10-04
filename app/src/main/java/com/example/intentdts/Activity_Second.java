package com.example.intentdts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Second extends AppCompatActivity implements View.OnClickListener
{
    TextView tvNama, tvInstitusi;
    Button btnPindahTiga;
    public static final String EXTRA_NAMA = "extra_age";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__second);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);
        btnPindahTiga = findViewById(R.id.btn_pindah_tiga);


        btnPindahTiga.setOnClickListener(this);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if(TextUtils.isEmpty(nama))
        {
            tvNama.setText("Nama : -");
        }
        else
        {
            tvNama.setText("Nama : " + nama);
        }

        if(TextUtils.isEmpty(institusi))
        {
            tvInstitusi.setText("Asal Institusi : -");
        }
        else
        {
            tvInstitusi.setText("Asal Institusi : " + institusi);
        }
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_pindah_tiga:
                pindahTiga();
                break;
        }
    }

    private void pindahTiga()
    {
        String namaSaja = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        Intent moveTiga = new Intent(Activity_Second.this, Activity_third.class);

        moveTiga.putExtra(this.EXTRA_NAMA, namaSaja);
        startActivity(moveTiga);
    }
}