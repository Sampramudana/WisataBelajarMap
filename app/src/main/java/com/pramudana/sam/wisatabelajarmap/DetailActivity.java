package com.pramudana.sam.wisatabelajarmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static String exNama = "nama";
    public static String exGambar = "gambar";
    public static String exLat = "latitude";
    public static String exLong = "longitude";

    ImageView imgDetail, mapsImage;
    TextView namaWisata;

    String nama, gambar;
    double latI, longI;

    private static String BASE_URL = "https://maps.googleapis.com/maps/api/staticmap?center=";
    private static String END_URL = "&zoom=15&size=1000x500&maptype=hybrid&markers=color:red%7C";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgDetail = findViewById(R.id.imgDetail);
        mapsImage = findViewById(R.id.mapsImage);
        namaWisata = findViewById(R.id.namaWisata);

        nama = getIntent().getStringExtra(exNama);
        gambar = getIntent().getStringExtra(exGambar);
        latI = getIntent().getDoubleExtra(exLat,0);
        longI = getIntent().getDoubleExtra(exLong,0);

        setTitle(nama);
        Picasso.with(this)
                .load(gambar)
                .placeholder(R.drawable.click)
                .fit()
                .into(imgDetail);
        namaWisata.setText(nama);

        Picasso.with(this)
                .load(BASE_URL + latI + "," + longI + END_URL + latI + "," + longI)
                .fit()
                .into(mapsImage);

        mapsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(DetailActivity.this)
                        .load(BASE_URL + latI + "," + longI + END_URL + latI + "," + longI)
                        .placeholder(R.drawable.click)
                        .fit()
                        .into(mapsImage);
            }
        });
    }
}
