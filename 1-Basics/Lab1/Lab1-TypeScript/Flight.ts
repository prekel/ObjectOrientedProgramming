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

    private _passengers: Array<Ticket>;

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

    constructor(arrivalPlace: string, flightTime: Date, departurePlace: string, passengers: Array<Ticket>) {
        this._arrivalPlace = arrivalPlace;
        this._flightTime = flightTime;
        this._departurePlace = departurePlace;
        this._passengers = passengers;
    }
}