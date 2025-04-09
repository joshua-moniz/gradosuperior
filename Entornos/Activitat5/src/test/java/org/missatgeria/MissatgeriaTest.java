package org.missatgeria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MissatgeriaTest {

    @Test
    void enviarMissatge() {
        Missatgeria mensahe = new Missatgeria();
        mensahe.enviarMissatge("main","este es el mensahe");
    }
}