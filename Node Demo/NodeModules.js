const path= require('path');

const filepath= path.parse(__filename);
console.log(filepath);

const os=require('os')
const tm= os.totalmem();
console.log(`Total memory: ${tm}`);

const fs =require('fs')
//it is async function , so there will always be callback function
fs.readdir('./',function(err,res){
    if(err) console.log(err);
    else console.log(res,"Hey");
})    //callback function , give result or error
console.log('____')
const files=fs.readdirSync('./')