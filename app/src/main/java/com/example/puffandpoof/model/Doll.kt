package com.example.puffandpoof.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "doll")
data class Doll(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val desc: String,
    val name: String,
    val size: String,
    val price: String,
//    val rating: String,
    val brand: String,
    val imageLink: String
)

