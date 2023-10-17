package com.pmdm.examen


fun main() {
    //EJERCICIO 1
    println(precioPlato(15.0))

    //EJERCICIO 2
    println(mesasLibres)
    println(reservas(mesasLibres, 3))

    //EJERCICIO 3
    println(mensajeReserva("Iván", "19:00", 5, 11, 23, true))
    println(mensajeReserva("David", "18:00", 6, 5, 23, false))

    //EJERCICIO 4
    println(procesoReservas())
}

//EJERCICIO 1
fun precioPlato(dato: Double): String {
    when (dato) {
        in Double.MIN_VALUE..5.0 -> return "€"
        in 5.5..8.0 -> return "€€"
        in 8.5..15.0 -> return "€€€"
        in 15.5..21.5 -> return "€€€€"
        in 22.0..Double.MAX_VALUE -> return "€€€€€"
        else -> {
            return "no valido"
        }
    }
}

//EJERCICIO 2

var mesasLibres: MutableList<Int> = mutableListOf(
    1,
    1,
    2
)

fun reservas(mesasLibres: List<Int>, comensales: Int?) {
    var res = true
    for ((i, value) in mesasLibres.withIndex()) {
        if (mesasLibres[i] == comensales) {
            mesasLibres.drop(i)
            res = true
        } else {
            res = false
        }
    }
}

//EJERCICIO 3
fun mensajeReserva(
    nombre: String?,
    hora: String?,
    dia: Int?,
    mes: Int?,
    anyo: Int?,
    booleano: Boolean?
) {
    if (booleano == true) {
        println("Sr $nombre su reserva para la hora $hora con fecha de $dia/$mes/$anyo ha sido reservada correctamente")
    } else {
        println("$nombre La reserva no ha sido realizada")
    }
}

//EJERCICIO 4
fun procesoReservas() {
    var nombre: String? = null
    var hora: String? = "18:00"
    var dia: Int? = 5
    var mes: Int? = 11
    var anyo: Int? = 23
    var comensales: Int? = 5
    var booleano: Boolean? = true


    reservas(mesasLibres, comensales)
    mensajeReserva(nombre, hora, dia, mes, anyo, booleano)
    if (nombre == null ||
        hora == null ||
        dia == null ||
        mes == null ||
        anyo == null ||
        booleano == null){
        println("Algún dato es null")
    }else{
        println("Todo está correcto")
    }
}

//comentario de prueba

//comentario de prueba prueba
