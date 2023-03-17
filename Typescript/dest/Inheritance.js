"use strict";
class coder {
    constructor(name, music, age, lang = "TypeScript") {
        this.name = name;
        this.music = music;
        this.age = age;
        this.lang = lang;
        this.name = name;
        this.music = music;
        this.age = age;
        this.lang = lang;
    }
    getAge() {
        return `Hello, I am ${this.age}`;
    }
}
const Dave = new coder('Dave', 'Roack', 42);
console.log(Dave.getAge());
class WebDev extends coder {
    constructor(computer, name, music, age) {
        super(name, music, age);
        this.computer = computer;
        this.computer = computer;
    }
    getLang() {
        return `I write ${this.lang}`;
    }
}
const sara = new WebDev('Mac', 'Sara', 'tantra', 43);
console.log(sara.getAge());
console.log(sara.getLang());
