#include "Person.h"

#include <utility>

Person::Person(std::string firstName, std::string lastName)
{
    _firstName = std::move(firstName);
    _lastName = std::move(lastName);
}
