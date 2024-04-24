plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "nowinjun.android.hilt"
            implementationClass = "com.kotlinstudy.nowinjun.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "nowinjun.kotlin.hilt"
            implementationClass = "com.kotlinstudy.nowinjun.HiltKotlinPlugin"
        }
        register("androidRoom") {
            id = "nowinjun.android.room"
            implementationClass = "com.kotlinstudy.nowinjun.AndroidRoomPlugin"
        }
        register("androidGlide"){
            id = "nowinjun.android.glide"
            implementationClass = "com.kotlinstudy.nowinjun.AndroidGlidePlugin"
        }
    }
}