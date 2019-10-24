#ifndef HEADOFDEPARTMENT_H
#define HEADOFDEPARTMENT_H

#include "Teacher.h"
#include "Department.h"

class HeadOfDepartment : public Teacher
{
public:
    HeadOfDepartment(std::string firstName,
                     std::string lastName, Date dateOfBirth,
                     Department* department);

    std::string ToString() override;
};

#endif // HEADOFDEPARTMENT_H
