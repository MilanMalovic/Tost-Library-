
[![](https://jitpack.io/v/MilanMalovic/Tost-Library-.svg)](https://jitpack.io/#MilanMalovic/Tost-Library-)


groovy
Copy code
dependencies {
    implementation 'com.github.MilanMalovic:Tost-Library-:<last-release>'
}
Configuration

Configuring Toasty Library is optional, but it allows you to customize the appearance and behavior of the toast messages. To configure the library, follow the steps below:

Locate a suitable place in your app, such as the onCreate method of your application class or an activity.
Add the following code to configure the toast message:
java
Copy code
ToastMessage().create(this, "Hello World");
Replace "Hello World" with the desired message you want to display.

Usage

To use Toasty Library in your application, simply call the ToastMessage().create() method with the desired parameters. This will display a toast message with the specified text.

java
Copy code
ToastMessage().create(context, "Your message goes here");
License

This project is licensed under the MIT License - see the LICENSE file for details.
