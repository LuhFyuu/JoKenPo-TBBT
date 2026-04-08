package com.example.jokenpo_thebigbangtheory;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class JogarActivity extends AppCompatActivity {

        ImageView imgKripke,imgResultKripke, imgResultJogador, imgResultSimbolo;
        ImageView imgPedra, imgPapel, imgTesoura, imgLagarto, imgSpock;
        ImageView imgSheldon, imgLeoanrd, imgAmy,imgPenny;
        TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogar);

            imgKripke = findViewById(R.id.imgKripke);
            imgResultKripke = findViewById(R.id.imgResultKripke);
            imgResultJogador = findViewById(R.id.imgResultJogador);
            imgResultSimbolo = findViewById(R.id.imgResultSimbolo);
            txtResultado = findViewById(R.id.txtResultado);

            imgPedra = findViewById(R.id.imgPedra);
            imgPapel = findViewById(R.id.imgPapel);
            imgTesoura = findViewById(R.id.imgTesoura);
            imgLagarto = findViewById(R.id.imgLagarto);
            imgSpock = findViewById(R.id.imgSpock);

            imgSheldon = findViewById(R.id.imgSheldon);
            imgLeoanrd = findViewById(R.id.imgLeoanrd);
            imgAmy = findViewById(R.id.imgAmy);
            imgPenny = findViewById(R.id.imgPenny);

            imgPedra.setOnClickListener(v -> Jogar("Pedra"));
            imgPapel.setOnClickListener(v -> Jogar("Papel"));
            imgTesoura.setOnClickListener(v -> Jogar("Tesoura"));
            imgLagarto.setOnClickListener(v -> Jogar("Lagarto"));
            imgSpock.setOnClickListener(v -> Jogar("Spock"));

            imgPenny.setOnClickListener(v -> UserSelect(R.drawable.img_penny));
            imgAmy.setOnClickListener(v -> UserSelect(R.drawable.img_amy));
            imgSheldon.setOnClickListener(v -> UserSelect(R.drawable.img_sheldon));
            imgLeoanrd.setOnClickListener(v -> UserSelect(R.drawable.img_leonard));
        }

    public void UserSelect(int image) {
        imgResultJogador.setImageResource(image);
    }

    public void Jogar(String EscolhaUsuario) {

        switch (EscolhaUsuario) {
            case "Pedra": imgResultSimbolo.setImageResource(R.drawable.img_pedra_um); break;
            case "Papel": imgResultSimbolo.setImageResource(R.drawable.img_papel); break;
            case "Tesoura": imgResultSimbolo.setImageResource(R.drawable.img_tesoura); break;
            case "Lagarto": imgResultSimbolo.setImageResource(R.drawable.img_lagarto); break;
            case "Spock": imgResultSimbolo.setImageResource(R.drawable.img_spock); break;
        }

        String[] opcoes = {"Pedra", "Papel", "Tesoura", "Lagarto", "Spock"};
        int numero = new Random().nextInt(5);
        String EscolhaKripke = opcoes[numero];

        switch (EscolhaKripke) {
            case "Pedra": imgResultKripke.setImageResource(R.drawable.img_pedra_um); break;
            case "Papel": imgResultKripke.setImageResource(R.drawable.img_papel); break;
            case "Tesoura": imgResultKripke.setImageResource(R.drawable.img_tesoura); break;
            case "Lagarto": imgResultKripke.setImageResource(R.drawable.img_lagarto); break;
            case "Spock": imgResultKripke.setImageResource(R.drawable.img_spock); break;
        }

        if (EscolhaUsuario.equals(EscolhaKripke)) {
            txtResultado.setText("Empate!");
        } else if (
                (EscolhaUsuario.equals("Pedra") && (EscolhaKripke.equals("Tesoura") || EscolhaKripke.equals("Lagarto"))) ||
                        (EscolhaUsuario.equals("Papel") && (EscolhaKripke.equals("Pedra") || EscolhaKripke.equals("Spock"))) ||
                        (EscolhaUsuario.equals("Tesoura") && (EscolhaKripke.equals("Papel") || EscolhaKripke.equals("Lagarto"))) ||
                        (EscolhaUsuario.equals("Lagarto") && (EscolhaKripke.equals("Spock") || EscolhaKripke.equals("Papel"))) ||
                        (EscolhaUsuario.equals("Spock") && (EscolhaKripke.equals("Tesoura") || EscolhaKripke.equals("Pedra")))
        ) {
            txtResultado.setText("Bazinga! Você ganhou!");
        } else {
            txtResultado.setText("Você perdeu pro Kripke!");
        }
    }
}

