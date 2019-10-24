#ifndef DATE_H
#define DATE_H

#include <string>
#include <cassert>

struct Date
{
private:
    int _Day = 1;
    int _Month = 1;
    int _Year = 1970;
public:
    int getDay()
    {
        return _Day;
    }
    void setDay(int day)
    {
        assert(1 <= day && day <= 31);
        _Day = day;
    }
    int getMonth()
    {
        return _Month;
    }
    void setMonth(int month)
    {
        assert(1 <= month && month <= 12);
        _Month = month;
    }
    int getYear()
    {
        return _Year;
    }
    void setYear(int year)
    {
        assert(1970 <= year);
        _Year = year;
    }

    Date() = default;

    Date(int day, int month, int year);

    std::string ToString();
};


#endif // DATE_H
