package br.edu.welder.aulacinco;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button enviar;
    private TextView mensagemIn;
    private TextView mensagemOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enviar = (Button) findViewById(R.id.app_button);
        mensagemIn = (TextView) findViewById(R.id.editTexto);
        mensagemOut = (TextView) findViewById(R.id.textShowMessage);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (! mensagemIn.getText().toString().equals("")) {
                    mensagemOut.setText(mensagemIn.getText());
                }
            }
        });

    }
}
