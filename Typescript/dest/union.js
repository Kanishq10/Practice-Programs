"use strict";
//union lets multiple types of data
let height; //a union 
function kgToLBS(weight) {
    if (typeof weight === 'number') {
        return weight * 2.2;
    }
    else {
        return parseInt(weight) * 2.2;
    }
}
kgToLBS(10);
kgToLBS('10');
