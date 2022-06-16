//javascript was developed in 10 days ,so it's syntax is similar to java
console.log("hello world");
let a;
console.log(a);
a=10;
console.log(a);
a=1.5;
console.log('value of a is ',a);
a="i am strong";
console.log(a);
//primitive data types=> strings,numbers,boolean,null,symbol;
a=null;
console.log(a);
a=true;
console.log(a);

//loops and conditions are similar to java
let num=7;
let flag=true;
for (let i = 2; i < num/2; i++) {
    if(num%i==0){
        flag=false;
        break;
    }
}

if(flag==false){
    console.log("not prime");
}
else{
    console.log("prime");
}

//functions
function fx(para){
    console.log(para);
    let val=Math.random()>0.5?true:para;
    return val;
}

fx(123);
let ans=fx(55);
console.log(ans);

