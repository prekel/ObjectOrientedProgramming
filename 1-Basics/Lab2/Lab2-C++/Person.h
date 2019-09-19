#ifndef PERSON_H
#define PERSON_H

#include <string>

class Person
{
private:
    std::string _firstName;
    std::string _lastName;
public:
    std::string getFirstName()
    {
        return _firstName;
    }
    std::string getLastName()
    {
        return _lastName;
    }

    Person(std::string firstName, std::string lastName);
};


#endif // PERSON_H
