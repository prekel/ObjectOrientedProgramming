#ifndef PERSON_H
#define PERSON_H

#include <string>

class Person
{
private:
    std::string _FirstName;
    std::string _LastName;
public:
    std::string getFirstName()
    {
        return _FirstName;
    }
    std::string getLastName()
    {
        return _LastName;
    }

    Person(std::string firstName, std::string lastName);

    virtual ~Person() = default;
};

#endif // PERSON_H
