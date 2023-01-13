package ru.netology.fishbook.dto

data class Place(
    val id: Long,
    val placeName: String,
    val description: String,
    val contacts: String,
    val rating: Int = 0,
    val fishSpecies: MutableList<String> = mutableListOf<String>(),
    val feedback: MutableList<String> = mutableListOf<String>(),
    val secretLevel:Int = 0,
    val transport:String,
    val difficulty:Int,
    val coords: Coordinates? = null,

)

