import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    kotlin("jvm") apply false
}

group = "ru.duharev.ratings"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }

}
subprojects {
    group = rootProject.group
    version = rootProject.group

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }
}

