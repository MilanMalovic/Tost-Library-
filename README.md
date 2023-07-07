
[![](https://jitpack.io/v/MilanMalovic/Tost-Library-.svg)](https://jitpack.io/#MilanMalovic/Tost-Library-)


Description

- Toasty Library is a lightweight library for displaying customizable toast messages in your Android application. It provides an easy and convenient way to        show informative and visually appealing toast notifications.



Installation

- To use Toasty Library in your Android project, follow the steps below:

    Open your root build.gradle file.
    Add the following code snippet inside the allprojects block:


        allprojects {
            repositories {
            maven { url "https://jitpack.io" }
            }
        }


- Open your module's build.gradle file.
    Add the following dependency inside the dependencies block. Make sure to replace <last-release> with the latest release version:

        dependencies {
        implementation 'com.github.MilanMalovic:Tost-Library-:<last-release>'
      }


Configuration

- Configuring Toasty Library is optional, but it allows you to customize the appearance and behavior of the toast messages. To configure the library,         follow the steps below:

   Locate a suitable place in your app, such as the onCreate method of your application class or an activity.                                                  Add the following code to configure the toast message:
   
         ToastMessage().create(this, "Hello World");

   Replace "Hello World" with the desired message you want to display.



Usage

- To use Toasty Library in your application, simply call the ToastMessage().create() method with the desired parameters. This will display a toast message    with the specified text.

          ToastMessage().create(context, "Your message goes here");

Contributing

Contributions are welcome! If you encounter any issues or have suggestions for improvement, please open an issue or submit a pull request on the GitHub repository.

License

This project is licensed under the MIT License - see the LICENSE file for details.
