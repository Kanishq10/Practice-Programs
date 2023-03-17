"use strict";
class Transaction {
    constructor(value) {
        this.value = value;
        this.value = value;
    }
}
class Account {
    constructor(accno) {
        this.accno = accno;
    }
    process(t) {
        if (t.value !== 0)
            return true;
        return false;
    }
}
class FilteredAccount extends Account {
    constructor(accno) {
        super(accno);
        FilteredAccount.filteredCount = 0;
    }
    process(t) {
        if (t.value === 0) {
            FilteredAccount.filteredCount++;
            return true;
        }
        else {
            return super.process(t);
        }
    }
    show() {
        console.log(FilteredAccount.filteredCount);
    }
}
const acc = new FilteredAccount(1233);
const t1 = new Transaction(5000);
const t2 = new Transaction(0);
const t3 = new Transaction(-20);
console.log(acc.process(t1));
console.log(acc.process(t2));
console.log(acc.process(t3));
acc.show();
