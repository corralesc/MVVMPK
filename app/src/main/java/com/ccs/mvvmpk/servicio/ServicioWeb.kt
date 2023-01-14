package com.ccs.mvvmpk.servicio

import com.ccs.mvvmpk.modelo.PkResponse
import retrofit2.Response
import retrofit2.http.GET



// Se crea este Interface dentro de Servicios para poder acceder al retrofit
// y utilizar la API de pokemon
// Cuando se crea el comando @GET("") : al presionar Alt+Enter nos traera el
// import de la libreria retrofit: import retrofit2.http.GET
interface ServicioWeb {
    // Este GET unida a un Objeto (patron singleton , que permite solo una instancia)
    // llamado ClienteRetrofit bajo los paquetes de Servicio tambien.
    // nos va a estructurar el URL que nos a a permitir
    // consumir el servicio de la API
    @GET("pokedex.json")

    // Al ir creando este comando en <Pkresponse> el traera el import com.ccs.mvvmpk.modelo.PkResponse
    // automaticamente
    // Luego nos ubicamos sobre Response : Al presionar Alt+Enter nos traera el
    // la libreria : import retrofit2.Response
    suspend fun getPK(): Response<PkResponse>
}