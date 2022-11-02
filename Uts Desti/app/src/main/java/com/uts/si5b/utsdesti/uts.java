package com.uts.si5b.utsdesti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class uts extends AppCompatActivity {
    private TextView tvNomorPendaftaran, tvInfo, tvNamaLengkap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts);

        tvNomorPendaftaran = findViewById(R.id.tv_nomor_pendaftaran);
        tvInfo = findViewById(R.id.tv_info);
        tvNamaLengkap = findViewById(R.id.tv_nama_lengkap);

        Intent intent = getIntent();
        tvNamaLengkap.setText(intent.getStringExtra("varNamaLengkap"));
        tvInfo.setText(intent.getStringExtra("varInfo"));
        tvNomorPendaftaran.setText(intent.getStringExtra("varNomorPendaftaran"));


    }
}