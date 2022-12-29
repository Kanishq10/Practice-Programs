// closure : a function always bundled with its lexical scope always form a closure
//a function always have access to its lexical scope
function fun(){
    let a=3
    function funchild(){
        console.log(a+4);
    }
    return funchild
}

let catchFun=fun()

catchFun()   //we are using function even it is flushed from stack