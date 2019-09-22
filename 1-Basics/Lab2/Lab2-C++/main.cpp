#include <iostream>

#ifdef _WIN32
#include <windows.h>
#endif

#include "Person.h"
#include "Student.h"

#include <chrono>

int main()
{
#ifdef _WIN32
    SetConsoleOutputCP(CP_UTF8);
    SetConsoleCP(CP_UTF8);
#endif

    std::cout << "Hello, World!" << std::endl;

    auto p1 = new Student("Иван", "Иванов", Date(22, 9, 2019), 1234);
    auto p2 = new Student("Иван1", "Иванов1", Date(21, 9, 2019), 12345);

    std::cout << p1->getFirstName() << std::endl;

    std::cout << p1->getFullInfo() << std::endl;

    Person::getAllPerson()->push_back(p1);
    Person::getAllPerson()->push_back(p2);

    auto allp = Person::getAllPerson();

	delete p1;
	delete p2;
    return 0;
}
