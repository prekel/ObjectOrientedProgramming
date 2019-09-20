#include "Student.h"

Student::Student(const std::string& firstName, const std::string& lastName,
                 int ticketId)
        : Person(firstName, lastName)
{
    _TicketId = ticketId;
}
