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

    Teacher(std::string firstName, std::string lastName,
            Date dateOfBirth, Department* department);

    std::string ToString() override;

    ~Teacher() override = default;
};

#endif // TEACHER_H
