package com.github.leandrochp.redis.capitulo2;

import redis.clients.jedis.Jedis;

public class ObterUltimoUsuarioLogado {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        String resultado = jedis.get("ultimo_usuario_logado");

        System.out.println(resultado);
    }
}
