console.log(this);

function fn() {
  console.log(this);
}

fn();

let obj = {
  name: "uap",
  func: fn,
};

obj.func(); //self object

function fn() {
  console.log(this);
  function abc() {
    console.log(this);
  }
  abc();
}

let obj1 = {
  name: "Peppe",
  func: fn,
};

obj1.func();

const person = {
  firstName: "John",
  lastName: "Doe",
  fullName: function () {
    return this.firstName + " " + this.lastName;
  },
};

console.log(person.fullName()); // Output: "John Doe"

function sayHello() {
  console.log(`Hello, ${this.name}!`);
}

const person1 = { name: "John" };
const person2 = { name: "Jane" };

sayHello.call(person1); // Output: "Hello, John!"
sayHello.call(person2); // Output: "Hello, Jane!"
