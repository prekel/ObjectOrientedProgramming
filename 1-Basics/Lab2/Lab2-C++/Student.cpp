#include <utility>
#include <iostream>

#include "Student.h"

Student::Student(std::string firstName,
                 std::string lastName, Date dateOfBirth,
                 int ticketId) : Person(std::move(firstName), std::move(lastName), dateOfBirth)
{
    _TicketId = ticketId;
}

std::string Student::ToString()
{
    return "Студент: " + Person::ToString() + "; Номер билета: " + std::to_string(getTicketId());
}

void Student::DoSomething()
{
    std::cout << "Студент что-то выполняет" << std::endl;
}
