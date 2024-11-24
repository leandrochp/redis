package com.github.leandrochp.redis.capitulo2;

import redis.clients.jedis.Jedis;

public class Set {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        String resultado = jedis.set("ultimo_usuario_logado", "Tony Stark");

        System.out.println(resultado);
    }
}
