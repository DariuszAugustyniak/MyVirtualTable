package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RollController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/roll")
    public Roll roll(@RequestParam(value = "dice", defaultValue = "100") Integer dice) {
        return new Roll(counter.incrementAndGet(), dice.intValue());
    }

    @GetMapping("/roll/WH4e")
    public RollWH4e RollWH4e(@RequestParam(value = "skill", defaultValue = "100") Long skill) {
        return new RollWH4e(counter.incrementAndGet(), skill);
    }

    @GetMapping("/roll/Wrath")
    public RollWrathAndGlory2e RollWrathAndGlory2e(@RequestParam(value = "amount", defaultValue = "1") Long amount) {
        return new RollWrathAndGlory2e(counter.incrementAndGet(), amount);
    }
}
