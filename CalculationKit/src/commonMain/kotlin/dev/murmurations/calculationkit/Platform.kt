package dev.murmurations.calculationkit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform