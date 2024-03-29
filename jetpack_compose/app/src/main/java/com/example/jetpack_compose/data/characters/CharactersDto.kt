package com.example.jetpack_compose.data.characters

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.example.jetpack_compose.entity.characters.Characters
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class CharactersDto(
    @Json(name = "info") override val info: InfoDto?,
    @Json(name = "results") override val results: List<ResultCharacterDto>
) : Characters, Parcelable