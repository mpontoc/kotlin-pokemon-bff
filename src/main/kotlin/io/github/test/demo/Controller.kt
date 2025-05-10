package io.github.test.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    val pokemonService: PokemonService,
    private val mapper: PokemonMapper
) {

    @GetMapping("/pokemon")
    fun getPokemon() : ResponsePokemonDTO? {
      return pokemonService.getPokemon()?.let { mapper.toDTO(it) }
    }

}