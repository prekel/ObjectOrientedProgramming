#include "Person.h"

#include <utility>

Person::Person(std::string firstName, std::string lastName, Date dateOfBirth)
{
    _FirstName = std::move(firstName);
    _LastName = std::move(lastName);
    _DateOfBirth = dateOfBirth;
}
