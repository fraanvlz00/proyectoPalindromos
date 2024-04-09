package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void hacerCadaLetraMinuscula() {
    }

    @org.junit.jupiter.api.Test
    public void testEsPalindromo() {
        String input = "xdx";
        boolean expected = true;
        boolean actual = Main.esPalindromo(input);
        Assertions.assertEquals(expected, actual);
    }

}