"use strict";
class Person {
    static inCount() {
        count += 1;
    }
    constructor(name, age) {
        this.name = name;
        this.age = age || 0;
        count = count + 2;
    }
    greet() {
        console.log("Welcome");
    }
}
Person.count = 0; //it does not appply to instaneous of a class, it applies to class directly 
const p = new Person("Kani");
p.greet();
Person.inCount();
Person.inCount();
console.log(Person.count);
