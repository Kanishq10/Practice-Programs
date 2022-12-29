const express=require('express')
const session=require('express-session')     //for session
const cookieParser=require("cookie-parser")   //for cookie

const app=express()
const port=1000
app.use(express.static(__dirname));
app.use(cookieParser());
app.use(express.urlencoded({extended:false}))
app.use(express.json());
app.use(session({     //session config
    secret:'scdc@ddR$332%%ssd',
    saveUninitilized:true,
    resave:false,
    cookieParser:{maxAge:8000000}
}))

//if you can't give the home route some file, it will automatically take the index.html file,if not existed than give error
app.get('/dashboard',(req,res)=>{
    if(req.session.userid)
    res.sendFile(__dirname+"/dashboard.html")
    else
    res.redirect("/login")
})


app.get('/login',(req,res)=>{
    res.sendFile(__dirname+"/login.html")
})

app.get("/logout",(req,res)=>{
    req.session.destroy();     //destroys the session
    res.redirect("/login");
})

app.post('/login',(req,res)=>{
    if(req.body.username==req.body.password){
        req.session.userid=req.body.username;
        res.redirect("/dashboard");
    }
    else{
        res.redirect("/login");
    }
})

app.listen(port,()=>{
    console.log("Server Started");
})