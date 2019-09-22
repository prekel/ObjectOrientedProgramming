cmake_minimum_required(VERSION 3.5)
project(Lab2_CPP)

set(CMAKE_CXX_STANDARD 17)

add_executable(Lab2_CPP main.cpp Person.cpp Person.h Student.cpp Student.h Teacher.cpp Teacher.h HeadOfDepartment.cpp HeadOfDepartment.h Department.cpp Department.h Date.cpp Date.h)
