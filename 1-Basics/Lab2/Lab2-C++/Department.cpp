#include "Department.h"
#include "HeadOfDepartment.h"

Department::Department(std::string name)
{
    _Name = std::move(name);
    _Teachers = new std::vector<Teacher*>();
}

std::string Department::ToString()
{
    return getName() + "; Зав. кафедры: " + getHead()->getFirstName() + " " + getHead()->getLastName();
}

Department::~Department()
{
    delete _Teachers;
}
