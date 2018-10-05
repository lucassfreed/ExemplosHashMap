package com.entra21.java;

import java.util.HashMap;

/**
 * @author Lucas Rodrigo Frederico
 */
public class Exemplo01 {

    public static void main(String[] args) {

        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Cleiton", 22);
        idades.put("Kleyton", 24);

        if (idades.containsKey("Kreytom")) {
            System.out.println("TEM KREYTOM");
        } else {
            System.out.println("NÃO TEM KREYTOM");
        }

        // Pega o valor daquela chave
        int idade = idades.get("Kleyton");
        System.out.println("Idade do Kleyton: " + idade);

        // Altera o vaslor daquela chave
        idades.put("Kleyton", 27);

        // Remove o valor de acordo com a key
        idades.remove("Kleyton");

    }

}
