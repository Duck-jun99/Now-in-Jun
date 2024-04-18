import com.kotlinstudy.nowinjun.configureCoroutineAndroid
import com.kotlinstudy.nowinjun.configureHiltAndroid
import com.kotlinstudy.nowinjun.configureKotest
import com.kotlinstudy.nowinjun.configureKotlinAndroid

plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureKotest()
configureCoroutineAndroid()
configureHiltAndroid()
