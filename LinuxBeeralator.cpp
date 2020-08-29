#include <iostream>
#include <cmath>
#include <iomanip>
#define YELLOW      "\033[33m"             /* Yellow */
#define BOLDMAGENTA "\033[1m\033[35m"      /* Bold Magenta */
#define BRIGHTWHITE "\u001b[37;1m"         /* Bright White */
#define BRIGHTBLUE  "\u001b[34;1m"         /* Bright Blue */
#define BRIGHTRED   "\u001b[31;1m"         /* Bright RED */
#define BRIGHTGREEN "\u001b[32;1m"         /* Bright Green */
#define BRIGHTCYAN  "\u001b[36;1m"         /* Bright Cyan */

using namespace std;                        
int main()
	{
	char rerun;
		do
		{
	float people = 0, hours = 0;
	double totalpricebottles = 0;
	double price = 0;
	float beersperhour = 0;
	float peoplehours = 0;
	float totalcases = 0;
	float cases = 0;
	double totalcaseprice = 0;
	float doorfee = 0;
	double cost = 0;
	float bottles = 0;
	double bottlesprice = 0;
	double totalcost = 0;
    	cout << "" << endl;
    	cout << "" << endl;
    	cout << BRIGHTGREEN << "Welcome to the ...";
    	cout << BOLDMAGENTA << R"(
    ____                       __      __            
   / __ )___  ___  _________ _/ ____ _/ /_____  _____
  / __  / _ \/ _ \/ ___/ __ `/ / __ `/ __/ __ \/ ___/
 / /_/ /  __/  __/ /  / /_/ / / /_/ / /_/ /_/ / /    
/_____/\___/\___/_/   \__,_/_/\__,_/\__/\____/_/     
        )" << endl;
    	cout << "" << endl;
    	cout << BRIGHTWHITE << "Let's calculate your evening beer requirements...";
	cout << endl
		 << "Note: 1 required case will be subtracted for each bottle purchased.";
	cout << endl
		 << "";
	cout << BRIGHTGREEN << endl
		 << "How much are you charging at the door? ";
	cin >> doorfee;
	if (doorfee == 0)
	{   
	cout << BRIGHTRED << "F"; 
	cout << BRIGHTBLUE << "R"; 
	cout << YELLOW << "E"; 
	cout << BRIGHTCYAN << "E"; 
    	cout << " "; 
	cout << BRIGHTGREEN << "B";
	cout << BRIGHTRED << "E"; 
	cout << YELLOW << "E"; 
	cout << BRIGHTCYAN << "R"; 
	cout << YELLOW << "!"; 
	cout << BRIGHTRED << "!"; 
	cout << BRIGHTCYAN << "!" << endl;
	}
	if (doorfee >= 1 && doorfee <= 4)
	{
		cout << endl
             << BRIGHTWHITE << "What an odd cover charge." << endl;
	}
	if (doorfee == 5)
	{
		cout << endl
	         << BRIGHTWHITE << "This ain't no reggae party, 5 dollars at the door..." << endl;
	}
	if (doorfee >= 6 && doorfee <= 10)
	{
		cout << endl
	         << BRIGHTWHITE << "A resonable cover charge." << endl;
	}
	if (doorfee >= 11 && doorfee <= 20)
	{
		cout << endl
             << BRIGHTWHITE << "No free booze here." << endl;
	}
	if (doorfee >= 21)
	{
		cout << endl
             << BRIGHTWHITE << "What is this a fund raiser?" << endl;
	}
        cout << BRIGHTGREEN << endl
		 << "How many people will be attending? ";
	cin >> people;
	if (people <= 5)
	{
		cout << endl
		     << BRIGHTWHITE << "No friends?" << endl;
	}
	if (people >= 6 && people <= 24)
	{
		cout << endl
			 << BRIGHTWHITE << "A shindig!" << endl;
	}
	if (people >= 25 && people <= 49)
	{
		cout << endl
			 << BRIGHTWHITE << "Now that's a party!" << endl;
	}
	if (people >= 50 && people <= 99)
	{
		cout << endl
			 << BRIGHTWHITE << "Good old fashion rager!" << endl;
	}
	if (people >= 100)
	{
		cout << endl
			 << BRIGHTWHITE << "Call in the National Guard!!!" << endl;
	}
	cout << BRIGHTGREEN << endl
		 << "How many beers will your guests drink per hour? ";
	cin >> beersperhour;
	if (beersperhour == 6)
	{
		cout << endl
			 << BRIGHTWHITE << "Your friends are lushes." << endl;
	}
	if (beersperhour >= 7)
	{
		cout << endl
			 << BRIGHTWHITE << "Bring on the coma!" << endl;
	}
	if (beersperhour <= 2)
	{
		cout << endl
			 << BRIGHTWHITE << "What a bunch of lightweights!" << endl;
	}
	if (beersperhour == 3)
	{
		cout << endl
			 << BRIGHTWHITE << "Keeping it mellow?" << endl;
	}
	if (beersperhour == 4)
	{
		cout << endl
			 << BRIGHTWHITE << "Ahh... a nice steady pace." << endl;
	}
	if (beersperhour == 5)
	{
		cout << endl
			 << BRIGHTWHITE << "Gonna ty one on!" << endl;
	}	
	cout << BRIGHTGREEN << endl
		 << "How many hours do you plan to drink? ";
	cin >> hours;
	if (hours >= 1 && hours <= 3)
	{
		cout << endl
			 << BRIGHTWHITE << "What is this a brunch?" << endl;
	}
	if (hours == 4)
	{
		cout << endl
			 << BRIGHTWHITE << "The night will still be young..." << endl;
	}
	if (hours == 5)
	{
		cout << endl
			 << BRIGHTWHITE << "Enough time to get good and loose..." << endl;
	}
	if (hours == 6)
	{
		cout << endl
			 << BRIGHTWHITE << "The long haul!" << endl;
	}
	if (hours >= 7)
	{
		cout << endl
			 << BRIGHTWHITE << "An all nighter!!!" << endl;
	}
	cout << BRIGHTGREEN << endl
		 << "How many bottles will you purchase? ";
	cin >> bottles;
	if (bottles == 1)
	{
		cout << endl
			 << BRIGHTWHITE << "You need to get a couple bottles man." << endl;
	}
	if (bottles == 3)
	{
		cout << endl
			 << BRIGHTWHITE << "Lets do some shots!" << endl;
	}
	if (bottles == 2)
	{
		cout << endl
			 << BRIGHTWHITE << "People like liquor, is that sufficient?" << endl;
	}
	if (bottles == 4)
	{
		cout << endl
			 << BRIGHTWHITE << "There will be hangovers." << endl;
	}
	if (bottles >= 5)
	{
		cout << endl
			 << BRIGHTWHITE << "A nice fully stocked bar, your a gracious host!" << endl;
	}
	cout << BRIGHTGREEN << endl
		 << "Average price per bottle? ";
	cin >> bottlesprice;
	if (bottlesprice <= 14)
	{
		cout << endl
			 << BRIGHTWHITE << "The cheap stuff." << endl;
	}
	if (bottlesprice >= 15 && bottlesprice <= 29)
	{
		cout << endl
			 << BRIGHTWHITE << "The good stuff." << endl;
	}
	if (bottlesprice >= 30)
	{
		cout << endl
			 << BRIGHTWHITE << "Drinking from the top shelf tonight!" << endl;
	}
	cout << BRIGHTGREEN << endl
		 << "Average price per case? ";
	cin >> price;
	if (price <= 14)
	{
		cout << endl
			 << BRIGHTWHITE << "The cheaper the beer, the more you can buy :)" << endl;
	}
	if (price >= 15 && price <= 29)
	{
		cout << endl
			 << BRIGHTWHITE << "The better the beer, the better the morning..." << endl;
	}
	if (price >= 30)
	{
		cout << endl
			 << BRIGHTWHITE << "Drinking the good stuff, nice!" << endl;
	}
	peoplehours = hours * (people * beersperhour);
	cases = peoplehours / 24;
	totalcases = cases - bottles;
	totalpricebottles = bottles * bottlesprice;
	totalcaseprice = ceil(totalcases) * price;
	cost = totalcaseprice - (people * doorfee);
	totalcost = cost + totalpricebottles;
    cout << "" << endl;
	cout << BRIGHTWHITE << endl
		 << "You will need " << BRIGHTGREEN << fixed << setprecision(0) << ceil(totalcases) << BRIGHTWHITE << " cases for the night.";
	cout << endl;
	if (totalcost >= 1)
	{
	cout << endl
            << "Your cost will be " << fixed << setprecision(2) << BRIGHTRED << totalcost << BRIGHTWHITE << " dollars."; 
	}
	if (totalcost <= 0)
	{
	cout << endl
            << "You will make " << fixed << setprecision(2) << BRIGHTGREEN << abs(totalcost) << BRIGHTWHITE << " dollars.";
	}
    cout << endl
        << "" << endl; 
    cout << endl << BRIGHTGREEN << "Do you need to recalculate? " << BRIGHTWHITE << "(y/n). " << BRIGHTGREEN << "If not enjoy your night. Stay safe! " << BRIGHTWHITE;
    cin >> rerun;
    }
    while (rerun == 'y' || rerun == 'Y');
	return 0;
}
