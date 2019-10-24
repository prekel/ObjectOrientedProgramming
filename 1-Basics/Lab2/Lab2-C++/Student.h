#ifndef STUDENT_H
#define STUDENT_H

#include "Person.h"

class Student : public Person
{
private:
    int _TicketId;
public:
    int getTicketId()
    {
        return _TicketId;
    }
    Student(std::string firstName,
            std::string lastName, Date dateOfBirth,
            int ticketId);

    std::string ToString() override;
};

#endif // STUDENT_H
