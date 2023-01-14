package com.ccs.mvvmpk.servicio

import retrofit2.Retrofit

object ClienteRetrofit {
    // Creamos un objeto Retrofit de tipo Retrofit Y le agregamos el signo de interrogacion
    // para que sea "NULABLE" (que podran contener valores nulos sin generar errores)
    private var retrofit: Retrofit? = null
    // Se declara la url de la api que se complementa con el @GET("") de la Interface :ServicioWeb
    private const val BASE_URL= "https://raw.githubusercontent.com/Biuni/PokemonGO-Pokedex/master/"

}