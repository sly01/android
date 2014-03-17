package com.aerkoc.fatihuni;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	EditText etKullaniciAdi;
	EditText etSifre;
	Button btnGiris;
	TextView tvSonuc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etKullaniciAdi = (EditText) findViewById(R.id.etKullaniciAdi);
		etSifre = (EditText) findViewById(R.id.etSifre);
		btnGiris = (Button) findViewById(R.id.btnGiris);
		btnGiris.setOnClickListener(this);
		tvSonuc = (TextView) findViewById(R.id.tvSonuc);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		if (v == btnGiris) {
			String kullaniciAdi = etKullaniciAdi.getText().toString();
			String sifre = etSifre.getText().toString();

			if (kullaniciAdi.equals("ahmet") && sifre.equals("erkoc")) {
				
				tvSonuc.setText("Basarili");
			} else {
				tvSonuc.setText("Kullanici adi veya sifre yanlis");
			}
		}

	}

}
