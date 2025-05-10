package io.github.test.demo

import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface PokemonMapper {

    fun toDTO(response: ResponsePokemon): ResponsePokemonDTO

}