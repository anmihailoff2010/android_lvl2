package com.example.jetpack_compose.presentation.navigation

sealed class Screen(val route: String) {
    object CharacterListScreen : Screen("character_list")
    object CharacterDetailScreen : Screen("character_detail")
}