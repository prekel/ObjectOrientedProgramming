import {Person} from "./Person";
import {Ticket} from "./Ticket";
import {Flight} from "./Flight";
import {Aircraft} from "./Aircraft";

let pilot = new Person("Иван", "Иванов");

let passengers = [];
passengers.push(new Person("Пётр", "Петров"));
passengers.push(new Person("Аркадий", "Аркадьев"));
passengers.push(new Person("Емельян", "Емельянов"));
passengers.push(new Person("Анастасия", "Анастасьева"));

let buyTime = new Date(2019, 9, 18, 15, 36, 50, 0);

let tickets1 = [];
tickets1.push(passengers[0]);
tickets1.push(passengers[1]);
tickets1.push(passengers[2]);
let tickets2 = [];
tickets2.push(passengers[1]);
tickets2.push(passengers[2]);
tickets2.push(passengers[3]);

let flightTime1 = new Date(2019, 9, 19, 14, 35, 56, 0);
let flightTime2 = new Date(2019, 9, 20, 13, 32, 51, 0);

let flights = [];
flights.push(new Flight("Красноярск", flightTime1, "Москва", tickets1));
flights.push(new Flight("Москва", flightTime2, "Красноярск", tickets2));

let aircraft = new Aircraft(flights, pilot);

console.log(pilot.firstName);

console.log(123);
