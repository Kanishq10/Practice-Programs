const url='http://mylogger.io/log'

function log(message){
    console.log(message);
}

module.exports.log=log;  //this is how we export the function
// module.exports=log;    //it is also applicable