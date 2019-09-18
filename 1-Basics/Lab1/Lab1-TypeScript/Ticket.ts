import {Person} from "./Person";

export class Ticket {
    private readonly _owner: Person;

    get owner(): Person {
        return this._owner;
    }

    private readonly _buyTime: Date;

    get buyTime(): Date {
        return this._buyTime;
    }

    constructor(owner: Person, buyTime: Date) {
        this._owner = owner;
        this._buyTime = buyTime;
    }

    public toString = () : string => {
        return `Покупатель: ${this.owner}; Время покупки: ${this.buyTime}`;
    }
}