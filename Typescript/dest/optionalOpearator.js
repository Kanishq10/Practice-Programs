"use strict";
var _a;
function getCustomer(id) {
    return id == 0 ? null : { birthday: new Date() };
}
let customer = getCustomer(0);
// if(customer!==null && customer!==undefined){
//     console.log(customer.birthday);
// }
//upper code is headache so why given operator is below
//optional property access operator
console.log((_a = customer === null || customer === void 0 ? void 0 : customer.birthday) === null || _a === void 0 ? void 0 : _a.getFullYear); //here it is ,
//optional elements access operator
//it is used for array
let cust = [null, 1, 3];
console.log(cust === null || cust === void 0 ? void 0 : cust[0]);
//optional call
let log = null;
log === null || log === void 0 ? void 0 : log('a'); //only get called if not null ,undefined
