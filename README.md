
[![](https://jitpack.io/v/MilanMalovic/Tost-Library-.svg)](https://jitpack.io/#MilanMalovic/Tost-Library-)


Add this in your root build.gradle file (not your module build.gradle file):

```
allprojects {
	repositories {
		maven { url "https://jitpack.io" }
	}
}
```




Dependency
Add this to your module's build.gradle file (make sure the version matches the JitPack badge above):

```
dependencies {
  implementation 'com.github.MilanMalovic:Tost-Library-:<last-release>'
}
```



Configuration
This step is optional, but if you want you can configure some Toasty parameters. Place this anywhere in your app:


        ToastMessage().create(this,"Hello World")
