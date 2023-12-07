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

        int nombreAleatoire;

        do {
            nombreAleatoire = (int) (Integer.MAX_VALUE * Math.random());
        } while (!estNombrePremier(nombreAleatoire));

        return  + nombreAleatoire;
    }
    // Méthode pour vérifier si un nombre est premier
    public static boolean estNombrePremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
}
