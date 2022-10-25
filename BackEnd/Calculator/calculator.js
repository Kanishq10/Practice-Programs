const express=require("express");
const app=express();
const bodyparser=require('body-parser');
app.use(bodyparser.urlencoded({extended:true}));

app.get("/",function(req,res){        //get req and res from file
    res.sendFile(__dirname+'/index.html')
});

app.post("/",function(req,res){     //get req and res from server
    var num1=Number(req.body.b1);   //req contains data from file
    var num2=Number(req.body.b2);
    var ans=num1+num2;
    res.send("Result is "+ans);
});

app.get("/bmi",function(req,res){
    res.sendFile(__dirname+"/bmi.html");
});

app.post("/bmi",function(req,res){
    var weight=parseFloat(req.body.w);
    var height=parseFloat(req.body.h);
    var ans=(weight)/(height*height);
    res.send("Your BMI is "+ans);
});

app.listen(3000,function(){
    console.log("Server Started");
});