#include "Date.h"

Date::Date(int day, int month, int year)
{
    setDay(day);
    setMonth(month);
    setYear(year);
}

std::string Date::ToString()
{
    return std::to_string(_Year) + "." + std::to_string(_Month) + "." + std::to_string(_Day);
}
