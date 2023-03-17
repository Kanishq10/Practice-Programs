"use strict";
//custom type Vs Interfaces
//it cannot be  initiated like java interface
// interface Person{
//     name: string;
//     age: number;
//     address:() =>string;
// }
function printlab(labelObj) {
    console.log(labelObj.label);
}
let myObj = { label: 'size of obj is 10' }; //it will work without interface but will need interface for mendetry structure
printlab(myObj); //yes tis code will run in typescript , because typescript only checks the shapes so atleast one parameter should be same
function createSquare(config) {
    let newSquare = { color: 'white', area: 10 };
    if (config.color) {
        newSquare.color = config.color;
    }
    if (config.width) {
        newSquare.area = config.width * config.width;
    }
    return newSquare;
}
let mySquare = createSquare({ color: 'black' });
let zsuare = createSquare({ width: 23 });
let msqua = createSquare({ color: 'red', width: 34 }); //don't pass direct values to it ,prone to error
let obbj = { color: 'red', width: 100 };
console.log(createSquare(obbj));
console.log(mySquare, zsuare, msqua);
let p1 = { x: 10, y: 10 };
console.log(p1);
// p1.x=5;    //can't change readonly
