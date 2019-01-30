# android-freckle

[![Build status](https://build.appcenter.ms/v0.1/apps/3a670da0-1f04-4e7b-b867-3e8cdfbd7a51/branches/develop/badge)](https://appcenter.ms) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/723460460764432db2497c1431a629f2)](https://www.codacy.com/app/meshnesh/android-freckle?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=meshnesh/android-freckle&amp;utm_campaign=Badge_Grade)


The Android-Freckle Android app.

## Project Setup

This project is built with Gradle, the [Android Gradle plugin](http://tools.android.com/tech-docs/new-build-system/user-guide). Follow the steps below to set up the project locally.

* Clone [Android-Freckle](https://github.com/meshnesh/android-freckle) inside your working folder.
* Start Android Studio
* Select "Open Project" and select the generated root Project folder.

## Running the application on an emulator or actual device

There can be many ways of running your application in Android Studio.
* First off, lets check out running on an emulator
    * We shall start by installing the emulator into your android studio.

    Installing the Android SDK manager is the first step. Follow these steps to install the system image.

     1. Select `Tools` in the task bar.
     2. Go to `SDK manager`.
     3. Select the Android version. (Android 8.1 Oreo /API Level 27 or later).
     4. Click install.

    * We shall then proceed to run the emulator:

        1. Open the project in your android studio.
        2. click the run button in android studio.
        3. Proceed to `create new virtual device`.
        4. Select the category below:
            - `Tablet`
        5. Proceed to the type of tablet to use and click next.
        6. Select the latest version and the preferred API version `27 or later`.
        7. Click finish.
        8. Now when you click run, you will be able to select the device chosen and proceed to view your work on the emulator

     * Installing the google play services on our emulator.
     Follow this link
     https://medium.com/@dai_shi/installing-google-play-services-on-an-android-studio-emulator-fffceb2c28a1

     * While updating the google play services one can follow this link
     https://developers.google.com/android/guides/setup
     http://www.androiddocs.com/google/play-services/setup.html#