package br.com.vrtracker.vtracker.desafio.main;

import br.com.vrtracker.vtracker.desafio.service.Plataforma;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Main implements MainInterface{

    @Autowired
    private List<Plataforma> plataformas;

    public void main(String arg) {

        System.out.println("-- INICIO --");

        plataformas.forEach(e -> e.chamaApi(arg));

        System.out.println("-- FIM --");
    }
}
