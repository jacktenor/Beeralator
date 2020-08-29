# Beeralator
Calculate your evening beer requirements...

I used Ubuntu to build and for Linux I just used,

g++ -static LinuxBeeralator.cpp -o beeralator

For Armhf

arm-linux-gnueabi-g++ -static LinuxBeeralator.cpp -o beeralator

For Aarch64 (Untested)

aarch64-linux-gnu-g++ -static LinuxBeeralator.cpp -o beeralator

For Windows, If you want an app icon I ran

i686-w64-mingw32-windres icon2.rc -O coff -o icon2.res 

i686-w64-mingw32-g++ -static WindowsBeeralator.cpp icon2.res -o Beeralator.exe

icon2.rc contents point to the icon, for example: id ICON "/path/to/beer2.ico" 
 
Using Windows with msys2 
 
windres icon2.rc -O coff -o icon2.res 
 
g++ -static WindowsBeeralator.cpp icon2.res -o Beeralator.exe 
 
I know very little about all this so if anyone can improve on this please do.
I just put it up because I enjoyed playing with the outputs and thought someone
else may too.





