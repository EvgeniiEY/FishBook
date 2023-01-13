package ru.netology.fishbook.dto

data class FishingTransport (
        val id: Long,
        val nameOfType: String,
        val numberOfSeats: Int,
        val engineType: String,
        val enginePower: Int
)