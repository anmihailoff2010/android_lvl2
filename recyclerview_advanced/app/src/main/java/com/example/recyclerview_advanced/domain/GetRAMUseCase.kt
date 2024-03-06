package com.example.recyclerview_advanced.domain

import com.example.recyclerview_advanced.data.RaMRepository
import com.example.recyclerview_advanced.data.characters.CharactersDto
import javax.inject.Inject

class GetRAMUseCase @Inject constructor(
    private val ramRepository: RaMRepository
) {
    suspend fun executeCharacters(count: Int, pages: Int, status: String, gender: String): CharactersDto {
        return ramRepository.getCharacters(count, pages, status, gender)
    }
}