// Лабораторная работа 1. Связывание объектов по ассоциациям классов
// Вариант 16
// Прекель Владислав

import {Person} from "./Person";
import {Ticket} from "./Ticket";
import {Flight} from "./Flight";
import {Aircraft} from "./Aircraft";

let passengers = new Array<Person>();
passengers.push(new Person("Пётр", "Петров"));
passengers.push(new Person("Аркадий", "Аркадьев"));
passengers.push(new Person("Емельян", "Емельянов"));
passengers.push(new Person("Анастасия", "Анастасьева"));

let buyTime = new Date(2019, 9, 18, 15, 36, 50, 0);

let tickets1 = new Array<Ticket>();
tickets1.push(new Ticket(passengers[0], buyTime));
tickets1.push(new Ticket(passengers[1], buyTime));
tickets1.push(new Ticket(passengers[2], buyTime));
let tickets2 = new Array<Ticket>();
tickets2.push(new Ticket(passengers[1], buyTime));
tickets2.push(new Ticket(passengers[2], buyTime));
tickets2.push(new Ticket(passengers[3], buyTime));

let flightTime1 = new Date(2019, 9, 19, 14, 35, 56, 0);
let flightTime2 = new Date(2019, 9, 20, 13, 32, 51, 0);

let flights = new Array<Flight>();
flights.push(new Flight("Красноярск", flightTime1, "Москва", tickets1));
flights.push(new Flight("Москва", flightTime2, "Красноярск", tickets2));

let pilot = new Person("Иван", "Иванов");
let aircraft = new Aircraft(flights, pilot);

console.log(aircraft.toStringDetails());
console.log("\n");
console.log(aircraft.allTimeFlights[0].toStringDetails());
console.log();
console.log(aircraft.allTimeFlights[1].toStringDetails());
