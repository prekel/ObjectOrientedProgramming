#ifndef PERSON_H
#define PERSON_H

#include <string>
#include <ctime>
#include <chrono>
#include <vector>

#include "Date.h"
#include "IShowable.h"

class Person : public IShowable
{
private:
    std::string _FirstName;
    std::string _LastName;

    Date _DateOfBirth;

    inline static std::vector<Person*> _AllPerson;
public:
    std::string getFirstName()
    {
        return _FirstName;
    }

    std::string getLastName()
    {
        return _LastName;
    }

    Date getDateOfBirth()
    {
        return _DateOfBirth;
    }

    static std::vector<Person*>* getAllPerson()
    {
        return &_AllPerson;
    };

    static std::string getAllPersonInfo();

    Person(std::string firstName, std::string lastName, Date dateOfBirth);

    std::string ToString() override;

    virtual ~Person() = default;
};

#endif // PERSON_H
