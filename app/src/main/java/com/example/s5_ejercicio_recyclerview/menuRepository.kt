package com.example.s5_ejercicio_recyclerview

class MenuRepository {
    fun getMenu(): List<MenuItem> {
        return arrayListOf(
            MenuItem(
                "https://www.venta.com.mx/sh-img/269984038019211_carritos%2Bcar.png",
                "Rayo McQuuen",
                "sepa"
            ),
            MenuItem(
                "https://www.techgames.com.mx/wp-content/uploads/2017/06/Guido.jpg",
                "Guido",
                "x2"
            ),
            MenuItem(
                "https://i.pinimg.com/originals/81/1c/ae/811cae6fe9599a8b9360aad8e8847ec2.jpg",
                "Mate",
                "x3"
            ),
        )
    }
}