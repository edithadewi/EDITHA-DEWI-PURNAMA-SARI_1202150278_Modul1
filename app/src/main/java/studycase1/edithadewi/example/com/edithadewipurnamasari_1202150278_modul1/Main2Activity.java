package studycase1.edithadewi.example.com.edithadewipurnamasari_1202150278_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    TextView a,d,c,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a = (TextView) findViewById(R.id.namamenu);

        d = (TextView) findViewById(R.id.jumlahporsi);

        c = (TextView) findViewById(R.id.harga);

        f = (TextView) findViewById(R.id.restaurant);

        if (getIntent().getExtras()!=null){

            Bundle bundle = getIntent().getExtras();
            a.setText(bundle.getString("Menu"));
            d.setText(bundle.getString("Jumlah"));
            c.setText(bundle.getString("Total"));
            f.setText(bundle.getString("Restaurant"));
        }

        else
        {
            a.setText(getIntent().getStringExtra("Menu"));
            d.setText(getIntent().getStringExtra("Jumlah"));
            c.setText(getIntent().getStringExtra("Total"));
            f.setText(getIntent().getStringExtra("Restaurant"));
        }
//
//        Intent b = getIntent();
//
//        String menu = b.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//        String jmlh = b.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//        String ttal = b.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//        a.setText(menu);
//
//        d.setText(jmlh);
//
//        c.setText(ttal);




    }
}



