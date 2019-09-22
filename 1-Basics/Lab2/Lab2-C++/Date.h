#ifndef DATE_H
#define DATE_H

struct Date
{
    int Day = 1;
    int Month = 1;
    int Year = 1970;

    Date() = default;

    Date(int day, int month, int year)
    {
        Day = day;
        Month = month;
        Year = year;
    }
};


#endif // DATE_H
