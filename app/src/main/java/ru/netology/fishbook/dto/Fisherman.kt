package ru.netology.fishbook.dto

data class Fisherman (
    val id: Long,
    val login: String,
    val name: String,
    val country: String,
    val city:String,
    val avatar: String? = null,
    val tackleType: String,
    val rating: Int = 0,
    val fishSpecies: MutableList<String> = mutableListOf<String>(),
        )
