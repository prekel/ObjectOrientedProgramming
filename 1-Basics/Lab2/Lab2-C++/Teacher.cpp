#include <string>
#include <utility>
#include <iostream>

#include "Teacher.h"
#include "Person.h"

Teacher::Teacher(std::string firstName, std::string lastName,
                 Date dateOfBirth, Department* department) : Person(std::move(firstName), std::move(lastName),
                                                                    dateOfBirth)
{
    _Department = department;
    _Department->getTeachers()->push_back(this);
}

std::string Teacher::ToString()
{
    return "Преподаватель: " + Person::ToString() + "; Кафедра: " + getDepartment()->getName();
}

void Teacher::DoSomething()
{
    std::cout << "Предодаватель что-то выполняет" << std::endl;
}
