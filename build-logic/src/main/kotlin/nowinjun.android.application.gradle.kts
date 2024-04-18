import com.kotlinstudy.nowinjun.configureHiltAndroid
import com.kotlinstudy.nowinjun.configureKotestAndroid
import com.kotlinstudy.nowinjun.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()
configureKotestAndroid()
