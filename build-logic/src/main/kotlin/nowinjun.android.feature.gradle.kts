import com.kotlinstudy.nowinjun.configureHiltAndroid
import com.kotlinstudy.nowinjun.libs

plugins {
    id("nowinjun.android.library")
    id("nowinjun.android.compose")
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

configureHiltAndroid()

dependencies {
    //implementation(project(":core:model"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:domain"))

    val libs = project.extensions.libs
    implementation(libs.findLibrary("hilt.navigation.compose").get())
    implementation(libs.findLibrary("androidx.compose.navigation").get())
    androidTestImplementation(libs.findLibrary("androidx.compose.navigation.test").get())

    implementation(libs.findLibrary("androidx.lifecycle.viewModelCompose").get())
    implementation(libs.findLibrary("androidx.lifecycle.runtimeCompose").get())
}
