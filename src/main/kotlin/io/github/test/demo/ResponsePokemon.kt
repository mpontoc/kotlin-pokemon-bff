package io.github.test.demo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class ResponsePokemon(
	val id: Int,
	val name: String,
	val height: Int,
	val weight: Int,
	val base_experience: Int?,
	val abilities: List<AbilityEntry>,
	val types: List<TypeEntry>,
	val sprites: Sprites?,
	val moves: List<MoveEntry>
)

data class AbilityEntry(
	val ability: NamedAPIResource,
	val is_hidden: Boolean,
	val slot: Int
)

data class TypeEntry(
	val slot: Int,
	val type: NamedAPIResource
)

data class MoveEntry(
	val move: NamedAPIResource,
	val version_group_details: List<VersionGroupDetailsItem>
)

data class VersionGroupDetailsItem(
	val level_learned_at: Int,
	val move_learn_method: NamedAPIResource,
	val version_group: NamedAPIResource
)

data class NamedAPIResource(
	val name: String,
	val url: String
)

data class Sprites(
	val front_default: String?
)