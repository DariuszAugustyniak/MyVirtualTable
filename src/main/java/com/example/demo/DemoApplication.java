package com.example.demo;

import com.example.demo.Card.CardHW4eMapper;
import com.example.demo.Card.CardWH4e;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private final CardHW4eMapper cardHW4eMapper;

    public DemoApplication(CardHW4eMapper cardHW4eMapper) {
        this.cardHW4eMapper = cardHW4eMapper;
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        return args -> {
            CardWH4e cardWH4e = new CardWH4e();
            cardWH4e.setGameClass("Rouge");
            cardWH4e.setName("Boblin");
            cardWH4e.setRace("Goblin");
            cardWH4e.setSkills("YES");
            cardHW4eMapper.insert(cardWH4e);
            System.out.println(this.cardHW4eMapper.findById(cardWH4e.getId()));
        };
    }

}
