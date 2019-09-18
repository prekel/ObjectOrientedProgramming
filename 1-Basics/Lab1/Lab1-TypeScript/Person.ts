export class Person {
    private readonly _firstName: string;

    get firstName(): string {
        return this._firstName;
    }

    private readonly _lastName: string;

    get lastName(): string {
        return this._lastName;
    }

    constructor(firstName: string, lastName: string) {
        this._firstName = firstName;
        this._lastName = lastName;
    }

    public toString = () : string => {
        return this.firstName + " " + this.lastName;
    }
}