package br.com.vrtracker.vtracker.desafio;

import br.com.vrtracker.vtracker.desafio.main.Main;
import br.com.vrtracker.vtracker.desafio.main.MainInterface;
import br.com.vrtracker.vtracker.desafio.service.impl.NewsAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesafioTecnicoVtrackerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesafioTecnicoVtrackerApplication.class, args);
    }

    @Bean
    public MainInterface getmain() {
        return new Main();
    }

    @Override
    public void run(String... args) {
        getmain().main(args[0]);
    }
}
