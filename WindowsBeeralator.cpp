// beeralator.cpp
#include <iostream>
#include <cmath>
#include <iomanip>
#include <windows.h>
#include <conio.h> 
using namespace std;
void SetColor(int value) {
	SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), value);
}

int main()
{
	char rerun;
	do
	{
	float people = 0, hours = 0;
	float totalpricebottles = 0;
	float price = 0;
	float beersperhour = 0;
	float peoplehours = 0;
	float totalcases = 0;
	float cases = 0;
	float totalcaseprice = 0;
	float doorfee = 0;
	float cost = 0;
	float bottles = 0;
	float bottlesprice = 0;
        float totalcost = 0;
        cout << "" << endl;
        cout << "" << endl;
        SetColor(2);
        cout << "Welcome to the...";
        SetColor(5);
        cout << R"(
    ____                       __      __            
   / __ )___  ___  _________ _/ ____ _/ /_____  _____
  / __  / _ \/ _ \/ ___/ __ `/ / __ `/ __/ __ \/ ___/
 / /_/ /  __/  __/ /  / /_/ / / /_/ / /_/ /_/ / /    
/_____/\___/\___/_/   \__,_/_/\__,_/\__/\____/_/     
        )" << endl;
                cout << "" << endl;
                SetColor(15);
		cout << "Let's calculate your evening beer requirements..." << endl;
		cout << "Note: 1 required case will be subtracted for each bottle purchased." << endl;
		cout << "" << endl;
		SetColor(10);
		cout << "How much are you charging at the door? ";
		SetColor(15);
		cin >> doorfee;
		if (doorfee == 0)
		{
                SetColor(2);   
		cout << "F"; 
		SetColor(4);
		cout << "R";
                SetColor(3);   
		cout << "E"; 
		SetColor(14);
		cout << "E"; 
                cout << " ";
                SetColor(3);   
		cout << "B"; 
		SetColor(4);
		cout << "E"; 
                SetColor(2);   
		cout << "E"; 
		SetColor(14);
		cout << "R"; 
                SetColor(2);   
		cout << "!"; 
		SetColor(4);
		cout << "!";
                SetColor(14);
		cout << "!" << endl;
                SetColor(2);   
		cout << "	F"; 
		SetColor(4);
		cout << "R";
                SetColor(3);   
		cout << "E"; 
		SetColor(14);
		cout << "E"; 
                cout <<	" ";
                SetColor(3);   
		cout << "B"; 
		SetColor(4);
		cout << "E"; 
                SetColor(2);   
		cout << "E"; 
		SetColor(14);
		cout << "R"; 
                SetColor(2);   
		cout << "!"; 
		SetColor(4);
		cout << "!";
                SetColor(14);
		cout << "!" << endl;
                SetColor(2);   
		cout << "		F"; 
		SetColor(4);
		cout << "R";
                SetColor(3);   
		cout << "E"; 
		SetColor(14);
		cout << "E"; 
                cout << " ";
                SetColor(2);   
		cout << "B"; 
		SetColor(4);
		cout << "E"; 
                SetColor(3);   
		cout << "E"; 
		SetColor(14);
		cout << "R"; 
                SetColor(2);   
		cout << "!"; 
		SetColor(4);
		cout << "!";
                SetColor(14);
		cout << "!" << endl;
		}
		if (doorfee >= 1 && doorfee <= 4)
		{
		cout << "What an odd cover charge." << endl;
		}
		if (doorfee == 5)
		{
		cout << "This ain't no reggae party, 5 dollars at the door..." << endl;
		}
		if (doorfee >= 6 && doorfee <= 10)
		{
		cout << "A resonable cover charge." << endl;
		}
		if (doorfee >= 11 && doorfee <= 20)
		{
		cout << "No free booze here." << endl;
		}
		if (doorfee >= 21)
		{
		cout << "What is this a fund raiser?" << endl;
		}
		SetColor(10);
		cout << "How many people will be attending? ";
		SetColor(15);
                cin >> people;
		if (people <= 5)
		{
		cout << "No friends?" << endl;
		}
		if (people >= 6 && people <= 24)
		{
		cout << "A shindig!" << endl;
		}
		if (people >= 25 && people <= 49)
		{
		cout << "Now that's a party!" << endl;
		}
		if (people >= 50 && people <= 100);
		{
	        cout << "Good old fashion rager!" << endl;
		}
		if (people <= 101);
		{
	        cout << "Call in the National Guard!!!" << endl;
		}
		SetColor(10);
		cout << "How many beers will your guests drink per hour? ";
		SetColor(15);
		cin >> beersperhour;
		if (beersperhour == 1)
		{
		cout << "Not getting buzzed that way." << endl;
		}
		if (beersperhour == 6)
		{
		cout << "Your friends are lushes." << endl;
		}
		if (beersperhour >= 7)
		{
		cout << "Bring on the coma!" << endl;
		}
		if (beersperhour <= 2)
		{
		cout << "What a bunch of lightweights!" << endl;
		}
		if (beersperhour == 3)
		{
		cout << "Keeping it mellow?" << endl;
		}
		if (beersperhour == 4)
		{
		cout << "Ahh... a nice steady pace." << endl;
		}
		if (beersperhour == 5)
		{
		cout << "Gonna ty one on!" << endl;
		}
		SetColor(10);
		cout << "How many hours do you plan to drimk? ";
		SetColor(15);
		cin >> hours;
		if (hours >= 1 && hours <= 3)
		{
		cout << "What is this a brunch?" << endl;
		}
		if (hours == 4)
		{
		cout << "The night will still be young..." << endl;
		}
		if (hours == 5)
		{
		cout << "Enough time to get good and loose..." << endl;
		}
		if (hours == 6)
		{
		cout << "The long haul!" << endl;
		}
		if (hours >= 7)
		{
		cout << "An all nighter!!!" << endl;
		}
		SetColor(10);
		cout << "How many bottles will you purchase? ";
		SetColor(15);
		cin >> bottles;
		if (bottles <= 1)
		{
		cout << "You need to get a couple bottles man." << endl;
		}
		if (bottles == 3)
		{
		cout << "Lets do some shots!" << endl;
		}
		if (bottles == 2)
		{
		cout << "People like liquor..." << endl;
		}
		if (bottles == 5)
		{
		cout << "I see blackouts in your future." << endl;
                }
		if (bottles == 4)
		{
		cout << "There will be hangovers." << endl;
		}
		if (bottles >= 6)
		{
		cout << "A nice fully stocked bar, your a gracious host!" << endl;
		}
		SetColor(10);
		cout << "Average price per bottle? ";
		SetColor(15);
		cin >> bottlesprice;
		if (bottlesprice <= 14)
		{
		cout << "The cheap stuff." << endl;
		}
		if (bottlesprice >= 15 && bottlesprice <= 29)
		{
		cout << "The good stuff." << endl;
		}
		if (bottlesprice >= 30)
		{
		cout << "Drinking from the top shelf tonight!" << endl;
		}
		SetColor(10);
		cout << "Average price per case? ";
		SetColor(15);
		cin >> price;
		if (price <= 14)
		{
		cout << "The cheaper the beer, the more you can buy :)" << endl;
		}
		if (price >= 15 && price <= 29)
		{
		cout << "The better the beer, the better the morning..." << endl;
		}
		if (price >= 30)
		{
		cout << "Drinking the good stuff, nice!" << endl;
		}
		peoplehours = hours * (people * beersperhour);
		cases = peoplehours / 24;
		totalcases = cases - bottles;
		totalpricebottles = bottles * bottlesprice;
		totalcaseprice = ceil(totalcases) * price;
		cost = totalcaseprice - (people * doorfee);
		totalcost = cost + totalpricebottles;
                cout <<  "" << endl;
		SetColor(3);
		cout << "You will need ";
		SetColor(2);
		cout << setprecision(0) << ceil(totalcases);
		SetColor(3);
		cout << " cases for the night." << endl;
  	        if (totalcost >= 1)
	        {
                cout << "Your cost will be ";
       	        SetColor(4);    
                cout << "$" << fixed << setprecision(2) << totalcost;
                SetColor(3);
                cout << " dollars." << endl;
	        }
	        if (totalcost <= 0)
	        {
                cout << "You will make ";
                SetColor(2);
                cout << "$" << fixed << setprecision(2) << abs(totalcost);
                SetColor(3);
        	cout << " dollars." << endl;
	    	}
        	cout << "" << endl;	    
		SetColor(10);
	        cout << "Do you need to recalculate? If not enjoy your night and stay safe. (y/n) ";
		cin >> rerun;
		}
		while (rerun == 'y' || rerun == 'Y');
		return 0;
}
