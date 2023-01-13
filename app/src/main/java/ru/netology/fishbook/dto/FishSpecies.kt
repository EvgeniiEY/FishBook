package ru.netology.fishbook.dto

data class FishSpecies (
    val id: Long,
    val nameOfType: String,
    val weight: Int,
    val length: Int,
)

data class FishRecord(
    val nameOfType: String,
    val weight: Int,
    val length: Int
    )