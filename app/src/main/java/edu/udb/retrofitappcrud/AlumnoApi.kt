package edu.udb.retrofitappcrud

import retrofit2.Call
import retrofit2.http.*

interface AlumnoApi {

    @GET("alumnos.php")
    fun obtenerAlumnos(): Call<List<Alumno>>

    @GET("alumnos/{id}")
    fun obtenerAlumnoPorId(@Path("id") id: Int): Call<Alumno>

    @POST("alumnos")
    fun crearAlumno(@Body alumno: Alumno): Call<Alumno>

    @PUT("alumnos")
    fun actualizarAlumno(@Query("id") id: Int, @Body alumno: Alumno): Call<Alumno>

    @DELETE("alumnos/{id}")
    fun eliminarAlumno(@Path("id") id: Int): Call<Void>
}