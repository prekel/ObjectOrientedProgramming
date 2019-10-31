#include "Department.h"
#include "HeadOfDepartment.h"

Department::Department(std::string name)
{
    _Name = std::move(name);
    _Teachers = new std::vector<Teacher*>();
}

std::string Department::ToString()
{
    if (getHead())
    {
        return getName() + "; Зав. кафедры: " + getHead()->getFirstName() + " " + getHead()->getLastName();
    }
    else
    {
        return getName() + "; Зав. кафедры отсутствует";
    }
}

Department::~Department()
{
    delete _Teachers;
}
