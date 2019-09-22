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
    Student(const std::string& firstName,
            const std::string& lastName, Date dateOfBirth,
            int ticketId);

    std::string getFullInfo() override;
};

#endif // STUDENT_H
