plugins {
    id("nowinjun.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.kotlinstudy.nowinjun"

    defaultConfig {
        applicationId = "com.kotlinstudy.nowinjun"
        versionCode = 1
        versionName = "1.0"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    implementation(projects.feature.main)

    implementation(projects.core.designsystem)
}

