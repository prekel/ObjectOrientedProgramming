#include <iostream>

#ifdef _WIN32
#include <windows.h>
#endif

#include "Person.h"

int main()
{
#ifdef _WIN32
    SetConsoleOutputCP(CP_UTF8);
    SetConsoleCP(CP_UTF8);
#endif

    std::cout << "Hello, World!" << std::endl;

    auto p1 = new Person("Иван", "Иванов");

    std::cout << p1->getFirstName() << std::endl;

	delete p1;
    return 0;
}
