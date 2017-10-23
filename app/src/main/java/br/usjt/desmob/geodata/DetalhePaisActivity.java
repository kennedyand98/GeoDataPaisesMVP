package br.usjt.desmob.geodata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhePaisActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListaPaisesActivity.PAIS);

        ImageView bandeira = (ImageView)findViewById(R.id.img_bandeira_pais);
        bandeira.setImageDrawable(Util.getDrawable(this, pais.getCodigo3().toLowerCase()));

        TextView nome = (TextView)findViewById(R.id.txt_nome_pais);
        nome.setText(pais.getNome());

        TextView capital = (TextView)findViewById(R.id.txt_capital);
        capital.setText(pais.getCapital());

        TextView regiao = (TextView)findViewById(R.id.txt_regiao);
        regiao.setText(pais.getRegiao());

        TextView subregiao = (TextView)findViewById(R.id.txt_subregiao);
        subregiao.setText(pais.getSubRegiao());

        TextView demonimo = (TextView)findViewById(R.id.txt_demonimo);
        demonimo.setText(pais.getDemonimo());

        TextView area = (TextView)findViewById(R.id.txt_area);
        area.setText(""+pais.getArea());

        TextView populacao = (TextView)findViewById(R.id.txt_populacao);
        populacao.setText(""+pais.getPopulacao());


    }
}
