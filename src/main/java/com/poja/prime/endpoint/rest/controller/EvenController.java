package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.PojaGenerated;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@Value
public class EvenController {
    @GetMapping("/even")
    public int ping() {

        int n = (int) (Integer.MAX_VALUE * Math.random());
        return n/2 == 0 ? n : n-1;
    }
}
