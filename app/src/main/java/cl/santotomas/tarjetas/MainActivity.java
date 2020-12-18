package cl.santotomas.tarjetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido, tarjeta, mes, año, codigo, calle, cuidad, estado, codigop;
    Button bton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre      = (EditText)findViewById(R.id.nombre);
        apellido    = (EditText)findViewById(R.id.apellido);
        tarjeta     = (EditText)findViewById(R.id.tarjeta);
        mes         = (EditText)findViewById(R.id.mes);
        año         = (EditText)findViewById(R.id.año);
        calle       = (EditText)findViewById(R.id.calle);
        cuidad      = (EditText)findViewById(R.id.ciudad);
        estado      = (EditText)findViewById(R.id.estado);
        codigop     = (EditText)findViewById(R.id.codigop);
        codigo      = (EditText)findViewById(R.id.codigo);
        bton1        = (Button)findViewById(R.id.bton);

        bton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nombre.getText().toString();
                String m = mes.getText().toString();
                String a = año.getText().toString();
                String card = tarjeta.getText().toString();
                String ape = apellido.getText().toString();

                Intent bton1 = new Intent(MainActivity.this, DetailActivity.class);

                bton1.putExtra("name", name);
                bton1.putExtra("m", m);
                bton1.putExtra("a", a);
                bton1.putExtra("card", card);
                bton1.putExtra("ape", ape);

                startActivity(bton1);
            }
        });

    }
}