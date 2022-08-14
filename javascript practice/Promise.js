const fs=require("fs");
console.log("before");
let promise=fs.promises.readFile("f1.txt");
console.log(promise);  //act like real life tokens
//setteled
//either fulfilled or rejected 
//fulfilled
promise.then(function(data){
    console.log(""+data);
});

//rejected
promise.catch(function(err){
    console.log(err);
});
console.log("after");