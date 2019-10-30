#include <string>
#include <iostream>
#include <iomanip>
#include <sstream>

#include "Date.h"

Date::Date(int day, int month, int year)
{
    setDay(day);
    setMonth(month);
    setYear(year);
}

std::string Date::ToString()
{
    std::stringstream ss;

    ss << std::setfill('0') << std::setw(4) << getYear() << "."
       << std::setfill('0') << std::setw(2) << getMonth() << "."
       << std::setfill('0') << std::setw(2) << getDay();

    return ss.str();
}
