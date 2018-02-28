# Decompiling, modifing and recompiling an Android app

## Decompiling
An android application is packaged into zip archive with the [apk](https://en.wikipedia.org/wiki/Android_application_package) extension. You can extract it by the following command:

```
cd apk
unzip app-release.apk
```
After extracting the apk you can find *classes.dex* file - **D**alvik **Ex**ecutable file. The file contains Dalvik bytecode which [Dalvik VM](https://en.wikipedia.org/wiki/Dalvik_(software)) or [Android Runtime (ART)](https://en.wikipedia.org/wiki/Android_Runtime) executes (translates to native instructions). Dalvik bytecode is translated Java bytecode. Thus if you want to read the source code of the app you have to convert dex file to java bytecode, then decompile java bytecode to java. To convert dex file to java bytecode (to jar - java archive with java class files) we will use [dex2jar](https://github.com/pxb1988/dex2jar). You can download it from [tools/](https://github.com/andronmobi/android-reverse-engineering/tree/master/tools) directory.
