package studycase1.edithadewi.example.com.edithadewipurnamasari_1202150278_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    TextView w, x, y, z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        w = (TextView) findViewById(R.id.namamenu);

        x = (TextView) findViewById(R.id.jumlahporsi);

        y = (TextView) findViewById(R.id.harga);

        z = (TextView) findViewById(R.id.restaurant);

        if (getIntent().getExtras() != null) {

            Bundle bundle = getIntent().getExtras();
            w.setText(bundle.getString("Menu"));
            x.setText(bundle.getString("Jumlah"));
            y.setText(bundle.getString("Total"));
            z.setText(bundle.getString("Restaurant"));
        } else {
            w.setText(getIntent().getStringExtra("Menu"));
            x.setText(getIntent().getStringExtra("Jumlah"));
            y.setText(getIntent().getStringExtra("Total"));
            z.setText(getIntent().getStringExtra("Restaurant"));
        }


    }
}



