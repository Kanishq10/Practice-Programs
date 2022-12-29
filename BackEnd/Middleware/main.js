const express=require("express");
const app=express();
const bodyparser=require("body-parser");

app.use(express.static("public"))
app.use(bodyparser.urlencoded({extended:false}))
app.use(express.json())

const userRouter = express.Router();
const authRouter = express.Router();

app.use("/user", userRouter);     //app.use is a global middelware
app.use("/auth", authRouter);     //giving home route

userRouter
.route("/")
.get(getUser)     //these are specific middleware
.post(postUser)
.patch(patchUser)
.delete(deleteUser)

authRouter
.route("/signup")
.get(middleware1,getSignup,middleware2)   //multiple functions
.post(postsignup)


function getUser(req,res){    
    res.write(`
    <h1>Hello I am Kanishq</h1>
    <h2>I am a full stack developer</h2>
    `)
    console.log(req.query);    //for getting parameters given in body
    res.write(JSON.stringify(user))
    res.send()
}

function postUser(req,res){
    console.log(req.body);
    user=req.body
    res.json({
        message:"data received successfully",
        user:req.body
    });
}

function patchUser(req,res){
    console.log('req->body', req.body);
    //update data
    let dataToBeUpdated=req.body;
    for(key in dataToBeUpdated){
        user[key]=dataToBeUpdated[key];
    }
    res.json({
        message:"data updated successfully"
    }) 
}

function deleteUser(req,res){
    user={}
    res.json({
        message:"data has been deleted"
    })
}

function middleware1(req,res,next){
    console.log("middleware1 encountered");
    next();  //execute next function 
}

function middleware2(req,res,next){
    console.log("middleware2 encountered");
    res.sendFile('/public/login.html',{root:__dirname})
}

function getSignup(req,res,next){
    console.log("getSignup called");
    // res.sendFile(__dirname+'/public/login.html')
    next()
}

function postsignup(req,res){
    let obj=req.body;
    console.log("backend",obj);
    res.json({
        message:"user signed up",
        data:obj
    });
}
app.listen(3000,()=>{console.log("Server Started");})