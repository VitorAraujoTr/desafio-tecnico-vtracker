package br.com.vrtracker.vtracker.desafio.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;

public class JsonUtil {

    static Logger logger = LogManager.getLogger(JsonUtil.class);

    public static String converteJsonEmString(BufferedReader buffereReader) {
        String resposta;
        StringBuilder jsonEmString = new StringBuilder();
        try {
            while ((resposta = buffereReader.readLine()) != null) {
                jsonEmString.append(resposta);
            }
        } catch (IOException e) {
            System.out.println("Erro de conversão Json.");
            logger.atLevel(Level.ERROR).log(e.getMessage());
        }
        return jsonEmString.toString();
    }
}
