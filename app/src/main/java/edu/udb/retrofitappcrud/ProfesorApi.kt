package edu.udb.retrofitappcrud

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*


interface ProfesorApi {
    @GET("profesores.php")
    fun obtenerProfesores(): Call<List<Profesor>>

    @GET("profesores/{id}")
    fun obtenerProfesorPorId(@Path("id") id: Int): Call<Profesor>

    @POST("profesores")
    fun crearProfesor(@Body profesor: Profesor): Call<Profesor>

    @PUT("profesores.php")
    fun actualizarProfesor(@Query("id") id: Int, @Body profesor: Profesor): Call<Profesor>

    @DELETE("profesores/{id}")
    fun eliminarProfesor(@Path("id") id: Int): Call<Void>
}