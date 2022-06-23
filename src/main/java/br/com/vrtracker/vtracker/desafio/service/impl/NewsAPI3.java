package br.com.vrtracker.vtracker.desafio.service.impl;

import br.com.vrtracker.vtracker.desafio.service.Plataforma;
import org.springframework.stereotype.Component;

@Component
public class NewsAPI3 implements Plataforma {

    private final static String URL_NEW_API = "https://newsapi.org";

    public void chamaApi(String name) {

        String URL = URL_NEW_API + "/v2/everything?q=" + name +
                "&from=2022-05-22&sortBy=publishedAt&apiKey=API_KEY";

        ConnectService.connect(URL);
    }
}

