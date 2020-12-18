package cl.santotomas.tarjetas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView adnombre, admes, adaño, adapellido, adtarjeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        adnombre =(TextView)findViewById(R.id.adnombre);
        admes =(TextView)findViewById(R.id.admes);
        adaño =(TextView)findViewById(R.id.adaño);
        adtarjeta =(TextView)findViewById(R.id.adtarjeta);
        adapellido =(TextView)findViewById(R.id.adapellido);


            detailActivity();
    }

    private void detailActivity() {

        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("name");
        String tarjeta = datos.getString("card");
        String mes = datos.getString("m");
        String año = datos.getString("a");
        String ape = datos.getString("ape");

        adtarjeta.setText(tarjeta);
        adaño.setText(año);
        admes.setText(mes);
        adnombre.setText(nombre);
        adapellido.setText(ape);

    }
}