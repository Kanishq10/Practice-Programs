"use strict";
class guitarist {
    constructor(name, instrument) {
        this.name = name;
        this.instrument = instrument;
    }
    play(action) {
        return `${this.name} ${action} the ${this.instrument}`;
    }
}
const page = new guitarist('Jim', 'guitar');
console.log(page.play('strums'));
