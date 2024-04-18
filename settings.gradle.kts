pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "nowinjun"
include(
    ":app",


    ":core:data",
    ":core:database",
    ":core:designsystem",
    ":core:domain",


    ":feature:main",
    //":feature:login",
    //":feature:signin"


)
include(":core")
include(":feature")
include(":feature:main")
include(":core:database")
include(":core:data")
include(":core:designsystem")
include(":core:domain")
