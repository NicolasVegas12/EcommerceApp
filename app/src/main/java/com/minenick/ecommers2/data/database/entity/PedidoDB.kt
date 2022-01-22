package com.minenick.ecommers2.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Order")
class PedidoDB(
    @PrimaryKey
    var idOrder:Int=0,
    var nombreCliente:String="",
    var direccion:String="",
    var referencia:String="",
    var contacto:String="",
    var telefono:String="",
    var status:Char='P'
)