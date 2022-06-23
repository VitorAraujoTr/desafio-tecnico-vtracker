package br.com.vrtracker.vtracker.desafio.util;

import java.io.BufferedReader;
import java.io.IOException;

public class JsonUtil {

    public static String converteJsonEmString(BufferedReader buff) {

        String resposta;
        StringBuilder jsonEmString = new StringBuilder();

        try {
            while ((resposta = buff.readLine()) != null) {
                jsonEmString.append(resposta);
            }
        } catch (IOException e) {
            System.out.println("Falha de conversão Json");
        }

        return jsonEmString.toString();
    }
}
