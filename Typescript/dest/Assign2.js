"use strict";
class safeArray {
    constructor() {
        this.arr = new Array(5);
    }
    set(index, value) {
        if (index >= this.arr.length) {
            console.log("Out of bound");
            return;
        }
        this.arr[index] = value;
    }
    get(index) {
        if (index >= this.arr.length || index < 0)
            return -1;
        return this.arr[index];
    }
}
const heh = new safeArray();
heh.set(3, 15);
heh.set(2, 5);
heh.set(1, 1);
heh.set(4, 7);
heh.set(16, 15);
heh.set(18, 15);
heh.set(78, 15);
heh.set(0, 34);
console.log(heh.get(11));
console.log(heh.get(10));
console.log(heh.get(9));
console.log(heh.get(0));
console.log(heh.get(1));
console.log(heh.get(2));
console.log(heh.get(3));
console.log(heh.get(4));
console.log(heh.get(5));
