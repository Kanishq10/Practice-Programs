// object
let emp = { id: 1 }; //its shape is defined
// emp.name = "Sandeep"; //we cannot add new property in it

let bob: { id: number; name: String; retire: (date: Date) => void } = {   //prototype of object
  id: 1,
  name: "Ravi",
  retire: (date: Date) => {   //real function
    console.log(date);
  },
};

bob.name = "Sandeep";


//literal
let quantity:50;   //it is like constant