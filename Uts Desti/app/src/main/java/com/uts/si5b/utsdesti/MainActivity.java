package com.uts.si5b.utsdesti;

import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;


public class MainActivity extends AppCompatActivity {
    private TextView tvFormulirPendaftaran, tvInfo;
    private EditText etNamaLengkap, etNomorPendaftaran;
    private CheckBox cbFacebook, cbInstagram, cbWebsite;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFormulirPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        tvInfo = findViewById(R.id.tv_info);

        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);

        cbFacebook = findViewById(R.id.cb_facebook);
        cbInstagram = findViewById(R.id.cb_instagram);
        cbWebsite = findViewById(R.id.cb_website);

        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namalengkap, nomorpendaftaran, facebook, instagram, website;
                int selectedID;

                namalengkap = etNamaLengkap.getText().toString();
                nomorpendaftaran = etNomorPendaftaran.getText().toString();
                facebook = cbFacebook.getText().toString();
                instagram = cbInstagram.getText().toString();
                website = cbWebsite.getText().toString();

                if (namalengkap.trim().equals("")) {
                    etNamaLengkap.setError("nama tidak boleh kosong");
                }
                else if (nomorpendaftaran.trim().equals("")) {
                    etNomorPendaftaran.setError("nomor tidak boleh kosong");

                }
                else {
                    Intent intent = new Intent(MainActivity.this, ActivityResult.class);
                    intent.putExtra("varNamaLengkap", namalengkap);
                    
                }
            }
        });
    }
}

