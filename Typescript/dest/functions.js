"use strict";
function caltax(income, taxYear = 12) {
    let x;
    console.log(income, taxYear);
    if (taxYear < 2022) {
        return income * 1.2;
    }
    else {
        return income * 2.2;
    }
}
console.log(caltax(5));
console.log(caltax(4, 23));
