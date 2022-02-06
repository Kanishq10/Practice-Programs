let fs=require("fs")
let path=require("path")

//=>10 folders
//=>files in folder with some text

for(let i=0;i<10;i++){
    let dirname=`Folder${i}`
    fs.mkdirSync(dirname)
    // fs.writeFileSync(dirname+"//"+"Readme.md","This is readme file")     "//" is window specific it will not work for mac,so for this problem path module is introduced
    fs.writeFileSync(path.join(dirname,"Readme.md"),"This is readme file")    //it will work for mac and linux also
  }

  //fetures
  let ext=path.extname(path.join(__dirname,"arrays.js"))  //get the extension name
  console.log(ext)

  let bn=path.basename(__dirname)   //gives the base folder
  console.log(bn)

  bn=path.basename(path.join(__dirname,"intro.js"))
  console.log(bn)

