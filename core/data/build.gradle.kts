plugins {
    id("nowinjun.android.library")
    id("nowinjun.android.hilt")
    id("nowinjun.kotlin.hilt")
}

android {
    namespace = "com.nowinjun.data"
}
dependencies {
    //implementation(projects.core.model)
    implementation(projects.core.database)
}