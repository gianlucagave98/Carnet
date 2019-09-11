package com.ggave.myapplication;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.encodeBitmap("content", BarcodeFormat.CODE_128, 400, 150);
            ImageView imageViewQrCode = (ImageView) findViewById(R.id.qr);
            imageViewQrCode.setImageBitmap(bitmap);
        } catch(Exception e) {
            Toast.makeText(this, "Error " + e, Toast.LENGTH_SHORT).show();
        }


    }
}
