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
    ":feature:project",
    ":feature:setting",
    ":feature:introduce"

)
