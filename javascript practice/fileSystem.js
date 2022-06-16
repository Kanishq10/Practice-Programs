//here we use filesystem module
let fs=require('fs')

//we can read,write,append and delete a file with this module

let output=fs.readFileSync('hello.txt')
console.log(""+output)

fs.appendFileSync('hello.txt','\nI am fine,\nnice to meet you too😁.') 

fs.writeFileSync('abc.txt','yo what is this')

console.log(fs.existsSync('abc.txt'))     //check if file exist
console.log(fs.openSync("gfd.txt",'w'))   //open a file or create if not exist with argument w

fs.unlinkSync("abc.txt")     //delete file


//folder
if(fs.existsSync("Folder")==false){
    fs.mkdirSync("Folder")
}

fs.writeFileSync("Folder/yep.txt","yep ,what are you doing here")
console.log(""+fs.readFileSync("Folder/yep.txt"))

let name=fs.readdirSync("Folder")
for(let i=0;i<name.length;i++){
    console.log(`deleting the file: ${name[i]}`)
    fs.unlinkSync("Folder/"+name[i])
}


console.log(__dirname)    //__dirname variable gives current directory path
console.log(__filename)   //__filename variable gives current file path
//lstat  
let checkObj=fs.lstatSync(__dirname)
let checkFile=checkObj.isFile();
console.log(checkFile);
let checkDir=checkObj.isDirectory();
console.log(checkDir)

console.log("removing the folder");
fs.rmdirSync("Folder")