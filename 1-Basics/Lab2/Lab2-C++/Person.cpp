#include "Person.h"

#include <utility>

Person::Person(std::string firstName, std::string lastName)
{
    _FirstName = std::move(firstName);
    _LastName = std::move(lastName);
}
