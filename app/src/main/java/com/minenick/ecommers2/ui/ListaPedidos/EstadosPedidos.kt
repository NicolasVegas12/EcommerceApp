package com.minenick.ecommers2.ui.ListaPedidos

enum class EstadosPedidos(val id:String,val valor:Int) {
    PENDIENTE("P",1),
    RECIBIDO("R",2),
    ENVIADO("E",3),
    ENTREGADO("TR",4),
    ANULADO("A",5)
}