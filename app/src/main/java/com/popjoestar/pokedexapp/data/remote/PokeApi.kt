package com.popjoestar.pokedexapp.data.remote

import com.popjoestar.pokedexapp.data.remote.responses.Pokemon
import com.popjoestar.pokedexapp.data.remote.responses.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("/pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("/value/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String,
    ): Pokemon
}