plugins {
    id("nowinjun.android.library")
}

android {
    namespace = "com.nowinjun.domain"
}
dependencies {
    implementation(projects.core.data)
    //implementation(projects.core.model)
}