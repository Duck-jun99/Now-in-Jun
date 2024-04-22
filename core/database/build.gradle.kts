plugins {
    id("nowinjun.android.library")
    id("nowinjun.android.hilt")
    id("nowinjun.android.room")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.nowinjun.database"
}

dependencies {
    implementation(libs.androidx.junit.ktx)
    //implementation(projects.core.model)
}
