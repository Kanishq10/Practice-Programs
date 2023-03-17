"use strict";
class tollBooth {
    constructor() {
        tollBooth.totalCars = 0;
        tollBooth.totalamount = 0;
    }
    payCar() {
        tollBooth.totalCars += 1;
        tollBooth.totalamount += 50;
    }
    noPayCar() {
        tollBooth.totalCars += 1;
    }
    sample(...args) {
        args.forEach(Element => {
            if (Element === "p")
                this.payCar();
            else
                this.noPayCar();
        });
    }
    display() {
        console.log(`The Total amount payable is ${tollBooth.totalamount} , Total Cars ${tollBooth.totalCars}`);
    }
}
const obj = new tollBooth();
obj.sample("p", "n", "n", "p", "n", "p", "p", "n", "p", "n", "p");
obj.display();
