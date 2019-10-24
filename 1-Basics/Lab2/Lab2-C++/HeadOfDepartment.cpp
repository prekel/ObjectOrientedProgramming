#include "HeadOfDepartment.h"

#include <utility>

HeadOfDepartment::HeadOfDepartment(std::string firstName,
                                   std::string lastName, Date dateOfBirth,
                                   Department* department) : Teacher(std::move(firstName), std::move(lastName),
                                                                     dateOfBirth, department)
{
    department->setHead(this);
}

std::string HeadOfDepartment::ToString()
{
    return "Зав. кафедры, " + Teacher::ToString();
}
