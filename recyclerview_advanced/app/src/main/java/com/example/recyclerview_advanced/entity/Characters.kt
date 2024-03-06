package com.example.recyclerview_advanced.entity

import com.example.recyclerview_advanced.data.characters.InfoDto

interface Characters {
    val info: InfoDto?
    val results: List<ResultCharacter>
}