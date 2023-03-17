//Type aliases
//predefined structure for custom type
//use your custom type

type icon='😎' | '😉';
let i1: icon ='😎';
let i2: icon ='😉';
console.log(i1+i2);



type employee={
    id:number,
    name: string,
    rep:(date:Date)=> void
  }

  //can use multiple times
  let em:employee={
    id: 1,
    name: "jajd",
    rep:(date:Date) => console.log(date)
  }

  let em1:employee={
    id: 1,
    name: "jajd",
    rep:(date:Date) => console.log(date)
  }
