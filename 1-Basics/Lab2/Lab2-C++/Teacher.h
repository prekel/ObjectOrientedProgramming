#ifndef TEACHER_H
#define TEACHER_H

#include "Person.h"
#include "Department.h"

class Teacher : public Person
{
private:
    Department* _Department;

public:
    Department* getDepartment()
    {
        return _Department;
    }

    Teacher(const std::string& firstName, const std::string& lastName,
            const Date& dateOfBirth, Department* department) : Person(
            firstName, lastName, dateOfBirth)
    {
        _Department = department;
    }
};

#endif // TEACHER_H
