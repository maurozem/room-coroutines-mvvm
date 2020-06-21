package br.com.douglasmotta.naivagtioncomponentappmirror.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity (
    @PrimaryKey val id: Long,
    val name: String,
    val bio: String,
    val useName: String,
//    @Ignore - caso não queira esse atributo
    val password: String
)
