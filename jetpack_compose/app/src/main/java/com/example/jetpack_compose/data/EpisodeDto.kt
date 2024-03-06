package com.example.jetpack_compose.data

import android.os.Parcelable
import com.example.jetpack_compose.entity.Episode
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class EpisodeDto(
    @Json(name = "air_date") override val airDate: String,
    @Json(name = "characters") override val characters: List<String>,
    @Json(name = "created") override val created: String,
    @Json(name = "episode") override val episode: String,
    @Json(name = "id") override val id: Int,
    @Json(name = "name") override val name: String,
    @Json(name = "url") override val url: String
) : Episode, Parcelable