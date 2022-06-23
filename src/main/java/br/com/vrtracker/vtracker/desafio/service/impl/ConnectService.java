package br.com.vrtracker.vtracker.desafio.service.impl;

import br.com.vrtracker.vtracker.desafio.util.JsonUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectService {

    public static void connect(String url) {

        try {
            URL ulr = new URL(url);

            HttpURLConnection con = (HttpURLConnection) ulr.openConnection();

            BufferedReader resp = new BufferedReader(new InputStreamReader(con.getInputStream()));

            System.out.println(resp);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
