import {Ticket} from "./Ticket";

export class Flight
{
    arrivalPlace : string;
    flightTime : Date;
    passengers : Array<Ticket>;
    departurePlace : string;
}