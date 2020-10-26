#include <iostream>
#include <string> 
#include <fstream> 
#include <regex>
#include <vector>
using namespace std; 


struct x{
    std::string n;
    std::string num;
    std::string classx;
    std::string fare;   
};
// trim from start (in place)
static inline void ltrim(std::string &s) {
    s.erase(s.begin(), std::find_if(s.begin(), s.end(), [](unsigned char ch) {
        return !std::isspace(ch);
    }));
}

// trim from end (in place)
static inline void rtrim(std::string &s) {
    s.erase(std::find_if(s.rbegin(), s.rend(), [](unsigned char ch) {
        return !std::isspace(ch);
    }).base(), s.end());
}

// trim from both ends (in place)
static inline void trim(std::string &s) {
    ltrim(s);
    rtrim(s);
}

int main(){
    string s; 
    string datex;
    string to;
    string from;
    string status;
    string objectx;
    ifstream file("C:\\Users\\Oleg\\Desktop\\1\\SkyTeam-Exchange.yaml");  // SkyTeam-Exchange
    ofstream fout("C:\\Users\\Oleg\\Desktop\\1\\cppstudio.csv"); 
    std::regex date_regex("(\\d){4}-(\\d){2}-(\\d){2}",
            std::regex_constants::ECMAScript | std::regex_constants::icase);
    std::regex obj_regex("(\\w){2}(\\d){1,6}\\:",
            std::regex_constants::ECMAScript | std::regex_constants::icase);
    std::regex from_regex("FROM",
        std::regex_constants::ECMAScript | std::regex_constants::icase);
    std::regex ff_regex("ff",
        std::regex_constants::ECMAScript | std::regex_constants::icase);
    std::regex status_regex("STATUS",
        std::regex_constants::ECMAScript | std::regex_constants::icase);
    std::regex to_regex("TO",
        std::regex_constants::ECMAScript | std::regex_constants::icase);

    vector <struct x> ivector; // push_back()  pop_back()



    while(getline(file, s)){ 
        if (std::regex_search(s, date_regex)) {
            datex = s.substr (1,10);
            getline(file, s); 
        }

        if (std::regex_search(s, obj_regex)){
            objectx = s.substr (0,6);
            getline(file, s);
            getline(file, s);
            while (!std::regex_search(s, from_regex))
            {      
                trim(s);
                struct x m;
                std::size_t pos = s.find(":");
                m.classx = s.substr (pos+10,1);
                m.fare = s.substr (pos+19,6);
                m.n =  s.substr (0,2);
                m.num =  s.substr (3,pos-3); //CLASS: 
                // std::cout << "classx:" << m.classx << '\n';
                // std::cout << "fare:" << m.fare << '\n';
                // std::cout << "n:" << m.n << '\n';
                // std::cout << "num:" << m.num << '\n';
                getline(file, s);
                ivector.push_back(m);
            }
            from = s.substr (6+4,s.length());
            getline(file, s);
            status = s.substr (8+4,s.length());
            getline(file, s);
            to = s.substr (4+4,s.length());
            for (auto & el : ivector) {
                fout << datex <<';'<< el.classx <<';'<< el.fare << ';'<< el.n<<';'<< el.num <<';'<< from <<';'<< to <<';' << status<< std::endl;
            }
            ivector.clear();

        }

            
        }
      
/*
    FF:
      KE 428364440: {CLASS: Y, FARE: YRSTCQ}
    FROM: LED
    STATUS: LANDED
    TO: SVO
*/


    file.close(); 
    fout.close();

    std::string ss = "2017-01-01";


 
    return 0;
}