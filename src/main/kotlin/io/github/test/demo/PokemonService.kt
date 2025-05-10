package io.github.test.demo

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import org.springframework.web.client.body
import org.springframework.web.client.toEntity

@Component
class PokemonService(
    private val restClient: RestClient = RestClient.builder()
        .baseUrl("https://pokeapi.co/api/v2/")
        .build(),
) {

    fun getPokemon(): ResponsePokemon? {
        val response = restClient.get()
            .uri("pokemon/bulbasaur").retrieve().body(ResponsePokemon::class.java)

        return response
    }
}


