
type customer={
    birthday: Date
};

function getCustomer(id : number): customer | null{
    return id==0? null: {birthday: new Date()};
}

let customer=getCustomer(0);
// if(customer!==null && customer!==undefined){
//     console.log(customer.birthday);
    
// }
//upper code is headache so why given operator is below
//optional property access operator
console.log(customer?.birthday?.getFullYear);   //here it is ,


//optional elements access operator
//it is used for array
let cust:any[]=[null,1,3];
console.log(cust?.[0]);

//optional call
let log: any=null;
log?.('a')    //only get called if not null ,undefined
