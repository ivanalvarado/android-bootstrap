# Android Bootstrap
This repository is a starter template for creating Android projects, preconfigured with modern libraries and best practices to streamline development. The goal is to reduce setup time for new projects and provide a robust starting point that aligns with contemporary Android development standards.
## Table of Contents
- [Features](#features)
- [Included Libraries](#included-libraries)
- [Getting Started](#getting-started)
- [Architecture](#architecture)
- [Contributing](#contributing)
- [License](#license)
## Features
- **Kotlin First**: All code is written in Kotlin to leverage its modern, concise syntax and compatibility with Android libraries.
- **Jetpack Libraries**: Includes essential Jetpack components to support modern Android development.
- **Dependency Injection**: Uses Hilt for streamlined dependency management.
- **Network Ready**: Retrofit and OkHttp for efficient networking and API requests.
- **Coroutines for Async Programming**: Integrated with coroutines to handle asynchronous tasks seamlessly.
- **Material Design**: Preconfigured Material Components to achieve a polished, consistent UI.
- **Image Loading**: Coil for easy image loading and caching.
- **Test Suite**: Set up with essential libraries for unit and UI testing.
- **Best Practices**: Architected for scalability and readability, with a focus on MVVM.
## Included Libraries
### Core Libraries
- [**Kotlin Standard Library**](https://kotlinlang.org/api/latest/jvm/stdlib/): Leverages idiomatic Kotlin for cleaner, safer code.
- [**Coroutines**](https://kotlinlang.org/docs/coroutines-overview.html): Manages background threads and async operations.
### UI & Jetpack Components
- [**Jetpack Compose**](https://developer.android.com/compose): For building UI in a declarative way.
- [**Navigation Component**](https://developer.android.com/guide/navigation): Simplifies navigation between screens.
- [**Lifecycle Components**](https://developer.android.com/jetpack/androidx/releases/lifecycle): Manages UI lifecycle states.
- [**Paging**](https://developer.android.com/topic/libraries/architecture/paging/v3-overview): For efficient pagination of data.
### Networking & Data
- [**Retrofit**](https://github.com/square/retrofit): HTTP client for API calls.
- [**OkHttp**](https://github.com/square/okhttp): Lower-level HTTP client for advanced networking capabilities.
- [**Moshi**](https://github.com/square/moshi): JSON parser optimized for Kotlin.
- [**Room**](https://developer.android.com/jetpack/androidx/releases/room): Database management with SQLite abstraction.
- [**DataStore**](https://developer.android.com/jetpack/androidx/releases/datastore): Lightweight, key-value storage solution.
### Dependency Injection
- [**Hilt**](https://developer.android.com/training/dependency-injection/hilt-android): Simplifies dependency injection.
### UI and Image Loading
- [**Material Components**](https://developer.android.com/design/ui/mobile/guides/components/material-overview): UI components adhering to Material Design.
- [**Coil**](https://github.com/coil-kt/coil): Fast, modern image loading library.
### Testing
- [**JUnit**](https://developer.android.com/training/testing/local-tests): Standard unit testing framework.
- [**Mockk**](https://mockk.io/): Mocking library for Kotlin.
- [**Espresso**](https://developer.android.com/training/testing/espresso): UI testing for Android.
- [**Truth**](https://github.com/google/truth): Provides readable assertions for tests.
### Utilities
- [**Timber**](https://github.com/JakeWharton/timber): Flexible logging.
- [**LeakCanary**](https://square.github.io/leakcanary/): Memory leak detection.
- [**WorkManager**](https://developer.android.com/develop/background-work/background-tasks/persistent/getting-started): Manages background tasks with lifecycle awareness.
## Getting Started
### Prerequisites
- **Android Studio** Arctic Fox or later
- **Gradle 8.0+**
- **Minimum SDK**: 21
- **Target SDK**: Latest stable release
### Installation
**Clone the repository**:
   ```bash
   git clone https://github.com/ivanalvarado/android-bootstrap-project.git
   ```
- **Open in Android Studio**: Open the project in Android Studio and sync Gradle files.
- **Run the App**: Build and run the app on an emulator or a physical device.
### Project Structure
This project follows the MVVM architecture pattern:
- **Model**: Data classes, repositories, and data sources (local and remote).
- **ViewModel**: Business logic and data transformation.
- **View**: UI components and views, built with Jetpack Compose.
## Contributing
Contributions are welcome! Please submit a pull request with a clear description of your changes, and ensure all tests pass before submitting.
## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE.txt) file for details.
