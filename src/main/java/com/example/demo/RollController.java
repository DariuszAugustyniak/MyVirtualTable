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
        return new Roll(counter.incrementAndGet(),dice.intValue());
    }
}
