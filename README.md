# Bookpedia
### This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.
### Structure:
- `composeApp` is for code that will be shared across your Compose Multiplatform applications. It contains several subfolders:
- `commonMain` is for code that’s common for all targets.
Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name. For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app, iosMain would be the right folder for such calls.
- `iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

### Screenshots:
#### Book list screen
Search kotlin books            |  Empty search
:-------------------------:|:-------------------------:
<img src="Screenshots/book_search_screen_empty_query.png" alt="Search kotlin books" style="width:25%; height:auto;">|  <img src="Screenshots/book_search_screen_kotlin.png" alt="Empty search" style="width:25%; height:auto;">
