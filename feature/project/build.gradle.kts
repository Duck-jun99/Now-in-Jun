plugins {
    id("nowinjun.android.feature")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.nowinjun.project"
}

kapt {
    correctErrorTypes = true
}