package ru.netology.fishbook.dto

data class Guide (
    val id: Long,
    val login: String,
    val name: String,
    val country: String,
    val city:String,
    val avatar: String? = null,
    val tackleType: String,
    val transportType: String,
    val rating: Int = 0,
    val fishSpecies: List<String?>? = null,
)