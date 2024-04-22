plugins {
    id("nowinjun.android.library")
    id("nowinjun.android.compose")
}

android {
    namespace = "com.nowinjun.designsystem"
}

dependencies {
    implementation(libs.androidx.appcompat)

    implementation(libs.androidx.junit.ktx)
}
