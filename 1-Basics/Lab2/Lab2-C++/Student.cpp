#include "Student.h"

Student::Student(const std::string& firstName,
                 const std::string& lastName, Date dateOfBirth,
                 int ticketId)
        : Person(firstName, lastName, dateOfBirth)
{
    _TicketId = ticketId;
}

std::string Student::getFullInfo()
{
    return std::to_string(getTicketId());
}
