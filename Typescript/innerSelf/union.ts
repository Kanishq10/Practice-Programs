//union lets multiple types of data
let height:number | string;  //a union 


function kgToLBS(weight:number | string) :number{
    if(typeof weight=== 'number'){
      return weight*2.2;
    }
    else{
      return parseInt(weight)*2.2;
    }
  }

  kgToLBS(10);
  kgToLBS('10');