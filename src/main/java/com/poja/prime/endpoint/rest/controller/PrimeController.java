package com.poja.prime.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;

@RestController
public class PrimeController {
    @GetMapping("/new-prime")
    public BigInteger newPrime() {
        return BigInteger.probablePrime(1000, new Random());
    }
}
