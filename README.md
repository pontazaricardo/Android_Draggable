# Android_Draggable

## IDE

About this project:
1. This is an Android Studio project, so in order to open it just open it in Android Studio. 
2. If you use Eclipse for Android development, just create a project in Eclipse and copy the classes in the *src* folder.

## Execution

Normally in both Android Studio and Eclipse you can create a device emulator with Android, but most of the times is extremelly slow to load. Bluestacks is a better option to perform emulations. In order to enable Bluestacks as an emulator in Android Studio, perform the following:
1. Close both Bluestacks and Android Studio if open.
2. Open Bluestacks, wait for it to update if needed and let it load until it reaches the home screen where all the apps are installed.
3. Open Android Studio. Bluestacks should now appear as an option when running the project.

### How to force Android Studio to use Bluestacks

Sometimes after performing the steps above, Bluestacks still does not appear in the list of emulators. To solve this, do the following:
1. Close Android Studio.
2. Open a **cmd** terminal and navigate to the **adb.exe** location. Most of the times is in
```
C:\Users\<Local user>\AppData\Local\Android\sdk\platform-tools
```
3. Run the following command
```
adb connect localhost:5555
```
The previous command should return a *daemon started sucessfully* message. In the case you get an error like 
*Unable to connect to localhost: No connection could be made because the target machine actively refused it*
just run the following command
```
adb connect 127.0.0.1
```

NOTE: For these commands to work, Bluestacks **needs to be open**.

![adb](/images/img_bluestacks_03.png?raw=true)

If after trying the steps above Bluestacks still does not appear as a valid emulator, please read [this](http://mattpilz.com/using-bluestacks-fast-easy-android-emulation/) and [this](https://stackoverflow.com/questions/24598577/connect-bluestacks-to-android-studio) sites where they explain some other alternative solutions.
