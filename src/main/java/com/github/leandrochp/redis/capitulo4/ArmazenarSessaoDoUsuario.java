package com.github.leandrochp.redis.capitulo4;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class ArmazenarSessaoDoUsuario {

    public static void main(String[] args) {
        String codigoDoUsuario = "1962";
        String nomeDoUsuario = "Peter Parker";
        String emailDoUsuario = "spidey@marvel.com";

        String chave = "usuario:" + codigoDoUsuario + ":sessao";

        Map<String, String> campos = new HashMap<>() {{
            put("codigo", codigoDoUsuario);
            put("nome", nomeDoUsuario);
            put("email", emailDoUsuario);
        }};

        Jedis jedis = new Jedis("localhost");

        String resultado = jedis.hmset(chave, campos);
        System.out.println(resultado);
    }

}