package com.example.dependency_injection.data

import com.example.dependency_injection.entity.Frame

data class FrameDto(
    override val number: String,
    override val color: Int
) : Frame