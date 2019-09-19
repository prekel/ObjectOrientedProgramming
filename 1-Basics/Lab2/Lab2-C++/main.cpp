#include <iostream>

#include "Person.h"

int main()
{
    std::cout << "Hello, World!" << std::endl;

    auto p1 = new Person("Иван", "Иванов");

    std::cout << p1->getFirstName() << std::endl;

    return 0;
}
