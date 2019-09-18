import {Person} from "./Person"
import {Flight} from "./Flight";

export class Aircraft
{
    private _pilot : Person;

    get pilot(): Person {
        return this._pilot;
    }

    set pilot(value: Person) {
        this._pilot = value;
    }

    private _allTimeFlights : Array<Flight>;

    get allTimeFlights(): Array<Flight> {
        return this._allTimeFlights;
    }

    constructor(flights: Array<Flight>, pilot: Person) {
        this._allTimeFlights = flights;
        this._pilot = pilot;
    }
}