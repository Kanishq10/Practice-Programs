const express=require('express')
const app=express()
const port=3000
app.set("view engine","ejs")
app.use(express.static(__dirname))

app.get("/home",(req,res)=>{
    console.log(req.query.name);
    res.render("home",{name:req.query.name,courses:["course1","course2","course3"]});

})

app.get('/',(req,res)=>{
    res.send('Hello World!')
}) 

app.listen(port,()=>{
    console.log(`Listening in ${port}`);
})