#include "Person.h"

#include <utility>
#include <string>

Person::Person(std::string firstName, std::string lastName, Date dateOfBirth)
{
    _FirstName = std::move(firstName);
    _LastName = std::move(lastName);
    _DateOfBirth = dateOfBirth;
    getAllPerson()->push_back(this);
}

std::string Person::getAllPersonInfo()
{
    std::string result;
    for (auto person : _AllPerson)
    {
        result += person->ToString() + "\n";
    }
    return result;
}

std::string Person::ToString()
{
    return this->getFirstName() + " " + getLastName() + "; Дата рождения: " +
           getDateOfBirth().ToString();
}
