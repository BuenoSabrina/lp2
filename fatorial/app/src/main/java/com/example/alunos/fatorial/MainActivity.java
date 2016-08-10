package com.example.alunos.fatorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num = (EditText) findViewById(R.id.numero);
        Button btn = (Button) findViewById(R.id.botao);
        final TextView txt = (TextView) findViewById(R.id.resposta);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(num.getText().toString());
                int a=1,b=1;

                while (a<= i){
                    b = b * a;
                    a++;
                }

                txt.setText("O resultado da fatoração é: "+ b);
            }
        });
    }
}
