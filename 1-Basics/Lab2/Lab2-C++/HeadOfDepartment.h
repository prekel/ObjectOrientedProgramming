#ifndef HEADOFDEPARTMENT_H
#define HEADOFDEPARTMENT_H

#include "Teacher.h"
//#include "Department.h"

class HeadOfDepartment : public Teacher {
public:
    HeadOfDepartment(const std::string& firstName,
                     const std::string& lastName, const Date& dateOfBirth,
                     Department* department);
};

#endif // HEADOFDEPARTMENT_H
