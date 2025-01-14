// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories{
        google()
    }
    dependencies{
        val nav_version = "2.8.0"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}


plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    kotlin("kapt") version "2.0.20"
}