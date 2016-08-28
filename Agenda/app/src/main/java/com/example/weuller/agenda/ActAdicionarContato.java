package com.example.weuller.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class ActAdicionarContato extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtTelefone;
    private EditText edtEmail;
    private EditText edtEndereco;
    private EditText edtDatasEspeciais;
    private EditText edtGrupo;

    private Spinner spnTelefone;
    private Spinner spnEmail;
    private Spinner spnEndereco;
    private Spinner spnDatasEspeciais;

    private ArrayAdapter<String> adpTelefone;
    private ArrayAdapter<String> adpEmail;
    private ArrayAdapter<String> adpEndereco;
    private ArrayAdapter<String> adpDatasEspeciais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_adicionar_contato);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtTelefone = (EditText) findViewById(R.id.edtTelefone);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtEndereco = (EditText) findViewById(R.id.edtEndereco);
        edtDatasEspeciais = (EditText) findViewById(R.id.edtDatasEspeciais);
        edtGrupo = (EditText) findViewById(R.id.edtGrupo);

        spnTelefone = (Spinner) findViewById(R.id.spnTipoTelefone);
        spnEmail = (Spinner) findViewById(R.id.spnTipoEmail);
        spnEndereco = (Spinner) findViewById(R.id.spnTipoEndereco);
        spnDatasEspeciais = (Spinner) findViewById(R.id.spnTipoData);


        //instanciando e configurando layout do adapter para preencher spinner de telefone
        adpTelefone = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTelefone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpEmail = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpEmail.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpEndereco = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpEndereco.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpDatasEspeciais = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpDatasEspeciais.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //associando adapters aos spinners
        spnTelefone.setAdapter(adpTelefone);
        spnEmail.setAdapter(adpEmail);
        spnEndereco.setAdapter(adpEndereco);
        spnDatasEspeciais.setAdapter(adpDatasEspeciais);

        //adicionando itens ao adapter de telefone
        adpTelefone.add("Celular");
        adpTelefone.add("Trabalho");
        adpTelefone.add("Casa");
        adpTelefone.add("Principal");
        adpTelefone.add("Fax-Trabalho");
        adpTelefone.add("Fax-Casa");
        adpTelefone.add("Pager");
        adpTelefone.add("Outros");

        //adicionando itens ao adapter de e-mail
        adpEmail.add("Casa");
        adpEmail.add("Trabalho");
        adpEmail.add("Outros");

        adpEndereco.add("Casa");
        adpEndereco.add("Trabalho");
        adpEndereco.add("Outros");

        adpDatasEspeciais.add("Aniversário");
        adpDatasEspeciais.add("Data Comemorativa");
        adpDatasEspeciais.add("Outros");
        

    }
}
