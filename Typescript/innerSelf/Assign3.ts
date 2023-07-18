class Transaction{
    constructor(public value:number){
        this.value=value;
    }
}

class Account{
    accno:number;
    constructor(accno:number){
        this.accno=accno;
    }

    process(t:Transaction):boolean{
        if(t.value!==0) return true;
        return false;
    }
}

class FilteredAccount extends Account{
    filteredCount:number;
    constructor(accno:number){
        super(accno);
        this.filteredCount=0;
    }

    process(t:Transaction):boolean{
        if(t.value===0){
            this.filteredCount++;
            return true;
        }
        else{
            return super.process(t);
        }
    }
}

const acc=new FilteredAccount(1233);
const t1=new Transaction(5000);
const t2=new Transaction(0);
const t3=new Transaction(-20);
console.log(acc.process(t1));
console.log(acc.process(t2));
console.log(acc.process(t3));
console.log(acc.filteredCount);



//todo app made with typescript