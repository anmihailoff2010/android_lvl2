package com.example.dependency_injection.data

import com.example.dependency_injection.entity.Frame

class FactoryFrame {
    fun createFrame(number: String, color: Int): Frame {
        return FrameDto(number, color)
    }
}