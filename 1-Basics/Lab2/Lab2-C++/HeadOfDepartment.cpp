#include "HeadOfDepartment.h"

HeadOfDepartment::HeadOfDepartment(const std::string& firstName,
                                   const std::string& lastName,
                                   const Date& dateOfBirth,
                                   Department* department) : Teacher(
        firstName, lastName, dateOfBirth, department)
{}
