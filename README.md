# Beeralator
Calculate your evening beer requirements...

This repo is for personal use. Your welcome to checkout the Beeralator but it is a work in progress        
by a newbie developer and may contain bugs.

For Beeralator.apk you should be able to add beeralator_apk_source as a project and build it in Android Studio.

I used Ubuntu to build it and for Linux I just used this command...                                                            
 g++ -static LinuxBeeralator.cpp -o beeralator

For Armhf                                                                                                      
arm-linux-gnueabi-g++ -static LinuxBeeralator.cpp -o beeralator

For Aarch64 (Untested)                                                                                                               
aarch64-linux-gnu-g++ -static LinuxBeeralator.cpp -o beeralator

For Windows I ran these two commands...                                                                                                                      
i686-w64-mingw32-windres icon2.rc -O coff -o icon2.res 
i686-w64-mingw32-g++ -static WindowsBeeralator.cpp icon2.res -o Beeralator.exe
icon2.rc contents point to the icon, for example: id ICON "/path/to/beer2.ico" 
 
Using Windows with Msys2 I used these two commands...                                                 
windres icon2.rc -O coff -o icon2.res                                                                                     
g++ -static WindowsBeeralator.cpp icon2.res -o Beeralator.exe 

I know very little about all this so if anyone can improve on this please do.
I just put it up because I enjoyed playing with the outputs and thought someone
else may too.





