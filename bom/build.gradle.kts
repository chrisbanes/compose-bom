plugins {
    `java-platform`
    id("com.vanniktech.maven.publish") version "0.25.3"
}

dependencies {
    constraints {
        api("androidx.compose.animation:animation:1.6.0-alpha02")
        api("androidx.compose.animation:animation-core:1.6.0-alpha02")
        api("androidx.compose.animation:animation-graphics:1.6.0-alpha02")
        api("androidx.compose.foundation:foundation:1.6.0-alpha02")
        api("androidx.compose.foundation:foundation-layout:1.6.0-alpha02")
        api("androidx.compose.material:material:1.6.0-alpha02")
        api("androidx.compose.material:material-icons-core:1.6.0-alpha02")
        api("androidx.compose.material:material-icons-extended:1.6.0-alpha02")
        api("androidx.compose.material:material-ripple:1.6.0-alpha02")
        api("androidx.compose.material3:material3:1.2.0-alpha04")
        api("androidx.compose.material3:material3-window-size-class:1.2.0-alpha04")
        api("androidx.compose.runtime:runtime:1.6.0-alpha02")
        api("androidx.compose.runtime:runtime-livedata:1.6.0-alpha02")
        api("androidx.compose.runtime:runtime-rxjava2:1.6.0-alpha02")
        api("androidx.compose.runtime:runtime-rxjava3:1.6.0-alpha02")
        api("androidx.compose.runtime:runtime-saveable:1.6.0-alpha02")
        api("androidx.compose.ui:ui:1.6.0-alpha02")
        api("androidx.compose.ui:ui-geometry:1.6.0-alpha02")
        api("androidx.compose.ui:ui-graphics:1.6.0-alpha02")
        api("androidx.compose.ui:ui-test:1.6.0-alpha02")
        api("androidx.compose.ui:ui-test-junit4:1.6.0-alpha02")
        api("androidx.compose.ui:ui-test-manifest:1.6.0-alpha02")
        api("androidx.compose.ui:ui-text:1.6.0-alpha02")
        api("androidx.compose.ui:ui-text-google-fonts:1.6.0-alpha02")
        api("androidx.compose.ui:ui-tooling:1.6.0-alpha02")
        api("androidx.compose.ui:ui-tooling-data:1.6.0-alpha02")
        api("androidx.compose.ui:ui-tooling-preview:1.6.0-alpha02")
        api("androidx.compose.ui:ui-unit:1.6.0-alpha02")
        api("androidx.compose.ui:ui-util:1.6.0-alpha02")
        api("androidx.compose.ui:ui-viewbinding:1.6.0-alpha02")
    }
}
