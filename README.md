# Beeralator
Calculate your evening beer requirements...

This repo is for personal use. Your welcome to checkout the Beeralator but it is a work in progress        
by a complete beginner, and may contain bugs. The following executables can be found in the "Releases" section.

You should be able to build Beeralator.apk by using the command...               
git clone https://github.com/jacktenor/Beeralator                                 

Then from the Android Studio welcome screen choose "Open an Existing Project".                             
Navigate to and highlight the "beeralator_apk_source"  directory that's inside the "Beeralator" directory you cloned.                      
Click "ok" and after it's imported use the build menu to build it.                             
I'm sure there's a better way but that worked for me.                                  

I used Ubuntu to build the Beeralator console program for Linux by running the command...                                                            
g++ -static LinuxBeeralator.cpp -o beeralator                                                   
from within the project directoty.                                                         

For Armhf                                                                                                      
arm-linux-gnueabi-g++ -static LinuxBeeralator.cpp -o beeralator

For Aarch64                                                                                                                                                    
aarch64-linux-gnu-g++ -static LinuxBeeralator.cpp -o beeralator

For Windows I used these two commands...                                                                                                                      
i686-w64-mingw32-windres icon2.rc -O coff -o icon2.res                                                          
i686-w64-mingw32-g++ -static WindowsBeeralator.cpp icon2.res -o Beeralator.exe                                  
icon2.rc contents point to the icon, for example: id ICON "/path/to/beer2.ico".
 
Using Windows with Msys2 I used these two commands...                                                 
windres icon2.rc -O coff -o icon2.res                                                                                     
g++ -static WindowsBeeralator.cpp icon2.res -o Beeralator.exe 

The .deb file places beeralator in /usr/bin and a beeralator.desktop file                                   
in /usr/share/applications as well as beer2.ico in /usr/share/icons. This should add a menu entry        
and icon. Only tested on Linux Mint 20.1.
Download the file then "cd ~/Downloads" and "sudo dpkg -i beeralator.1.0-1.deb".                                    

I know very little about all this so if anyone can improve on this please do.
