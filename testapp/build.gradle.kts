plugins {
    id("com.android.library") version "8.1.0"
    id("org.jetbrains.kotlin.android")  version "1.8.21"
}

android {
    namespace = "dev.chrisbanes.compose.bom.testapp"
    compileSdk = 32

    defaultConfig {
        minSdk = 27
        targetSdk = 32
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
}

repositories {
    google()
    mavenCentral()
    mavenLocal()
}

dependencies {
    api(platform("dev.chrisbanes.compose:compose-bom:${project.properties["VERSION_NAME"]}"))

    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material:material")
    implementation("androidx.compose.material3:material3")
}