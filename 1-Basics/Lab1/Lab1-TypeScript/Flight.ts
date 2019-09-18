import {Ticket} from "./Ticket";

export class Flight {
    private _arrivalPlace: string;

    get arrivalPlace(): string {
        return this._arrivalPlace;
    }

    set arrivalPlace(value: string) {
        this._arrivalPlace = value;
    }

    private _flightTime: Date;

    get flightTime(): Date {
        return this._flightTime;
    }

    set flightTime(value: Date) {
        this._flightTime = value;
    }

    private readonly _passengers: Array<Ticket>;

    get passengers(): Array<Ticket> {
        return this._passengers;
    }

    private _departurePlace: string;

    get departurePlace(): string {
        return this._departurePlace;
    }

    set departurePlace(value: string) {
        this._departurePlace = value;
    }

    constructor(departurePlace: string, flightTime: Date, arrivalPlace: string, passengers: Array<Ticket>) {
        this._departurePlace = departurePlace;
        this._flightTime = flightTime;
        this._arrivalPlace = arrivalPlace;
        this._passengers = passengers;
    }

    public toString = () : string => {
        return `Место отправления: ${this.departurePlace}; Место прибытия: ${this.arrivalPlace}; Дата рейса: ${this.flightTime}; Кол-во купленных билетов: ${this.passengers.length}`;
    };

    public toStringDetails = () : string => {
        return `Место отправления: ${this.departurePlace}; Место прибытия: ${this.arrivalPlace}; Дата рейса: ${this.flightTime}\nКупленные билеты:\n${this.passengers.join("\n")}`;
    }
}