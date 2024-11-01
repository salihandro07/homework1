plugins {

}

android {
    compileSdk 33

    defaultConfig {
        applicationId "com.example.homework1"
        minSdk 28
        targetSdk 33
        versionCode 1
        versionName "1.0"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

    viewBinding {
        enabled = true
    }
}

dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib:1.8.0"
    implementation "androidx.core:core-ktx:1.10.1"
    implementation "androidx.appcompat:appcompat:1.6.1"
    implementation "com.google.android.material:material:1.9.0"
    implementation "androidx.constraintlayout:constraintlayout:2.1.4"
    implementation "androidx.navigation:navigation-fragment-ktx:2.8.3"
    implementation "androidx.navigation:navigation-ui-ktx:2.8.3"
}
