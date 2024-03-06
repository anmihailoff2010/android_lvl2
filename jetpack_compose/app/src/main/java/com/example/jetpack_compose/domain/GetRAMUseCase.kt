package com.example.jetpack_compose.domain

import com.example.jetpack_compose.data.EpisodeDto
import com.example.jetpack_compose.data.RaMRepository
import com.example.jetpack_compose.data.characters.CharactersDto
import javax.inject.Inject

class GetRAMUseCase @Inject constructor(
    private val ramRepository: RaMRepository
) {
    suspend fun executeCharacters(
        count: Int,
        pages: Int,
        status: String,
        gender: String
    ): CharactersDto {
        return ramRepository.getCharactersList(count, pages, status, gender)
    }

    suspend fun executeEpisodeInfo(episodeId: String): List<EpisodeDto> {
        return ramRepository.getEpisodeInfo(episodeId)
    }
}