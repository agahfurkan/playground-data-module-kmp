# Playground Data Module (KMP)

This is a Kotlin Multiplatform data module targeting native Android and iOS applications.

## Project Structure

* [/shared](./shared/src) contains the shared data layer code:
  - [commonMain](./shared/src/commonMain/kotlin) - Common business logic, repositories, and models
  - [androidMain](./shared/src/androidMain/kotlin) - Android-specific implementations
  - [iosMain](./shared/src/iosMain/kotlin) - iOS-specific implementations

## Features

- **Networking**: Ktor client with platform-specific implementations (OkHttp for Android, Darwin for iOS)
- **Serialization**: Kotlinx Serialization for JSON parsing
- **Coroutines**: For asynchronous operations
- **Repositories**: Clean architecture data layer with repositories for:
  - User management (login, register, token validation)
  - Product catalog
  - Product details
  - Categories
  - Shopping cart
  - Announcements
  - PDF handling

## Integration

### Android
Add this to your native Android app's `settings.gradle.kts`:
```kotlin
include(":shared")
project(":shared").projectDir = file("../playground-data-module-kmp/shared")
```

Then add the dependency in your app's `build.gradle.kts`:
```kotlin
dependencies {
    implementation(project(":shared"))
}
```

### iOS
The project generates an XCFramework for iOS. To build it:
```shell
./gradlew :shared:assembleSharedReleaseXCFramework
```

The framework will be available at `shared/build/XCFrameworks/release/shared.xcframework`

#### Using SPM (Swift Package Manager)
1. Build the XCFramework
2. Copy it to the `SPM/` directory
3. Add the local Swift package to your Xcode project

Or integrate the framework directly into your Xcode project.

## Building

### Build XCFramework for iOS
```shell
./gradlew :shared:assembleSharedReleaseXCFramework
```

### Build Android Library
```shell
./gradlew :shared:assembleRelease
```

## Development

To add new features:
1. Define models in `shared/src/commonMain/kotlin/.../model/`
2. Create repository interfaces in `shared/src/commonMain/kotlin/.../repository/`
3. Implement repositories with Ktor for API calls
4. Add platform-specific code in `androidMain` or `iosMain` if needed

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)

