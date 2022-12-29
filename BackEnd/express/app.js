const express=require("express");
// const res = require("express/lib/response");
const app=express();
const bodyparser=require("body-parser");

app.use(express.static("public"))
app.use(bodyparser.urlencoded({extended:false}))
app.get("/",(req,res)=> {    
    res.sendFile(__dirname+"/public/index.html");   //directly send the data using express.js

});

app.get("/getdata",(req,res)=>{
    console.log(req.query);
res.end();
});

app.post("/",(req,res)=>{
    const vasd=req.body.name;
    console.log(vasd);
});

// app.post("/signup",parse,(req,res)=>{
//     let obj={};
// })
app.listen(3000,(err)=>{
    if(err) console.log(err);
    else console.log("server started...")
});