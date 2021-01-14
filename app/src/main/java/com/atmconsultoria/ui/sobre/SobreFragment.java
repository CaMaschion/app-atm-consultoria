package com.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "A ATM consultoria deseja alcançar o sucesso através da " +
                "excelência em gestão e da busca pela qualidade.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://www.google.com/", "Acesse nosso site")

                .addGroup("Redes Sociais")
                .addFacebook("jamiltodamasceno", "Facebook")
                .addInstagram("jamiltodamasceno", "Instagram")
                .addTwitter("jamiltodamasceno", "Twitter")
                .addYoutube("jamiltodamasceno", "Youtube")
                .addGitHub("jamiltodamasceno", "Github")
                .addPlayStore("com.facebook.katana", "Download App")

                .addItem( versao )

                .create();

       // return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}