# SmartCab Reservation

SmartCab Reservation is an Android application built with Kotlin and Jetpack Compose that allows users to book and track cab rides conveniently. The app provides features like user authentication, ride booking, real-time tracking, ride history, and user profile management.

## Features

- **User Authentication**: Login and signup functionality for secure access.
- **Ride Booking**: Enter pickup location, destination, and pickup time to find and book a cab.
- **Real-time Tracking**: Track the driver's location and estimated time of arrival (ETA).
- **Ride History**: View past rides and details.
- **User Profile**: Manage personal information and settings.
- **Splash Screen**: Engaging startup experience.

## Screenshots

Here are screenshots of the key screens in the SmartCab Reservation app:

### Splash Screen
![Splash Screen](screenshots/splash_screen.png)
*The initial screen displayed when the app launches.*

### Login Screen
![Login Screen](screenshots/login_screen.png)
*User authentication screen for logging in or signing up.*

### Home Screen
![Home Screen](screenshots/home_screen.png)
*Main screen for booking rides, entering pickup and destination locations.*

### Ride Details Screen
![Ride Details Screen](screenshots/ride_details_screen.png)
*Displays estimated fare, time, and distance for the selected ride.*

### Tracking Screen
![Tracking Screen](screenshots/tracking_screen.png)
*Real-time tracking of the driver's location and ETA.*

### History Screen
![History Screen](screenshots/history_screen.png)
*View past rides and their details.*

### Profile Screen
![Profile Screen](screenshots/profile_screen.png)
*User profile management and settings.*

*Note: Screenshots are placeholders. To add actual screenshots, capture them from the running app in Android Studio or on a device, save them in the `screenshots/` folder in the project root, and update the image paths accordingly.*

## Technologies Used

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Build Tool**: Gradle (Kotlin DSL)
- **Maps Integration**: Google Play Services Maps
- **Architecture**: MVVM (Model-View-ViewModel)
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 35 (Android 15)

## Dependencies

The app uses the following key dependencies:

- AndroidX Core KTX
- AndroidX Lifecycle Runtime KTX
- AndroidX Activity Compose
- AndroidX Compose BOM (including UI, Material3, etc.)
- Google Play Services Maps
- Material Components
- JUnit and Espresso for testing

For a complete list of dependencies and versions, refer to `gradle/libs.versions.toml`.

## Getting Started

### Prerequisites

- Android Studio (latest version recommended)
- JDK 11 or higher
- Android SDK with API 24+ installed

### Installation

1. Clone the repository:
   ```
   git clone https://github.com/ishant-jaiswal/Smart-cab-Reservation.git
   ```

2. Open the project in Android Studio.

3. Sync the project with Gradle files.

4. Build and run the app on an emulator or physical device.

### Configuration

- Ensure you have a Google Maps API key for map functionality. Add it to your `local.properties` file:
  ```
  MAPS_API_KEY=your_api_key_here
  ```

## Project Structure

```
SmartCabReservation/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/smartcabreservation/
│   │   │   │   ├── SplashActivity.kt
│   │   │   │   ├── LoginActivity.kt
│   │   │   │   ├── HomeActivity.kt
│   │   │   │   ├── RideDetailsActivity.kt
│   │   │   │   ├── TrackingActivity.kt
│   │   │   │   ├── HistoryActivity.kt
│   │   │   │   ├── ProfileActivity.kt
│   │   │   │   └── ui/theme/
│   │   │   │       ├── Color.kt
│   │   │   │       ├── Theme.kt
│   │   │   │       └── Type.kt
│   │   │   ├── res/
│   │   │   │   ├── drawable/
│   │   │   │   ├── layout/
│   │   │   │   ├── mipmap/
│   │   │   │   ├── values/
│   │   │   │   └── xml/
│   │   │   └── AndroidManifest.xml
│   │   ├── androidTest/
│   │   └── test/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/
│   ├── libs.versions.toml
│   └── wrapper/
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
├── screenshots/
└── README.md
```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and test thoroughly.
4. Commit your changes with descriptive commit messages.
5. Push to your fork and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or support, please contact the project maintainer at [your-email@example.com].

---

*Note: This app is for demonstration purposes and may require additional backend integration for full functionality.*
