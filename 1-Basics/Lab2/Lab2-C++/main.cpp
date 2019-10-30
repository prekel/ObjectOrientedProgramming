#include <iostream>

#ifdef _WIN32
#include <windows.h>
#endif

#include "Person.h"
#include "Student.h"
#include "HeadOfDepartment.h"
#include "Department.h"
#include "Teacher.h"

int main(int argc, char** argv)
{
#ifdef _WIN32
    SetConsoleOutputCP(CP_UTF8);
    SetConsoleCP(CP_UTF8);
#endif
    auto dept1 = new Department("Кафедра кафедры");
    auto head1 = new HeadOfDepartment("Арсений", "Арсеньев", Date(21, 10, 1980), dept1);
    auto dept2 = new Department("Кафедра вторая");
    auto head2 = new HeadOfDepartment("Аркадий", "Аркадьев", Date(20, 12, 1990), dept2);

    auto teacher11 = new Teacher("Станислав", "Станиславов", Date(12, 12, 1982), dept1);
    auto teacher12 = new Teacher("Сергей", "Сергеев", Date(6, 2, 1972), dept1);
    auto teacher13 = new Teacher("Леонид", "Леонидов", Date(8, 2, 1984), dept1);

    auto teacher21 = new Teacher("Анастасия", "Анастасьева", Date(1, 4, 1970), dept2);
    auto teacher22 = new Teacher("Виктор", "Викторьев", Date(2, 5, 1981), dept2);
    auto teacher23 = new Teacher("Артемий", "Артемьев", Date(3, 6, 1982), dept2);

    auto p1 = new Student("Иван", "Иванов", Date(22, 9, 2019), 123456);
    auto p2 = new Student("Владислав", "Владиславов", Date(21, 9, 2019), 112345);


    for (auto dept : {dept1, dept2})
    {
        std::cout << dept->getName() << ":" << std::endl;
        for (auto teacher : *dept->getTeachers())
        {
            std::cout << teacher->ToString() << std::endl;
        }
        std::cout << std::endl;
    }
    std::cout << std::endl;

    std::cout << "Все созданные записи о людях: " << std::endl << Person::getAllPersonInfo();

    for (auto person : *Person::getAllPerson())
    {
        delete person;
    }

    delete dept1;
    delete dept2;

    return 0;
}
