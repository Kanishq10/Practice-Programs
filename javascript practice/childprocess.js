//app -module
let cp=require('child_process')
//use
console.log("trying to open")
//we can execute these commands on cmd
let out=cp.execSync('node arrays.js')
cp.execSync("calc")
cp.execSync('start chrome https://www.alphacoders.com')
console.log("opened")
console.log(""+out)   //we need to convert output to string as it is in the buffer form
