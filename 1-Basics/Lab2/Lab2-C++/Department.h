#ifndef DEPARTMENT_H
#define DEPARTMENT_H

#include <utility>
#include <vector>
#include <string>

#include "Declarations.h"

class Department
{
private:
    std::string _Name;
    HeadOfDepartment* _Head{};
    std::vector<Teacher*>* _Teachers;
public:
    std::string getName()
    {
        return _Name;
    }

    void setName(std::string name)
    {
        _Name = std::move(name);
    }

    HeadOfDepartment* getHead()
    {
        return _Head;
    }

    void setHead(HeadOfDepartment* head)
    {
        _Head = head;
    }

    std::vector<Teacher*>* getTeachers()
    {
        return _Teachers;
    }

    explicit Department(std::string name);

    std::string ToString();

    ~Department();
};

#endif // DEPARTMENT_H
