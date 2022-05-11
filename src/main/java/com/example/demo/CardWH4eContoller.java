package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Card/WH4e")
public class CardWH4eContoller {

    private final CardHW4eMapper cardHW4eMapper;

    public CardWH4eContoller(CardHW4eMapper cardHW4eMapper) {
        this.cardHW4eMapper = cardHW4eMapper;
    }


    @GetMapping
    public List<CardWH4e> getAll() {
          return cardHW4eMapper.findAll();

    }

    @GetMapping("/id/{id}")
    public CardWH4e getOne(@PathVariable Long id) {
        return cardHW4eMapper.findById(id);
    }

    @PostMapping
    public void addCard(@RequestBody CardWH4e cardWH4e) {
         cardHW4eMapper.insert(cardWH4e);
    }
}
