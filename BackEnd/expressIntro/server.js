const express=require('express')
const app=express()      //middleware func-> post ,front -> json
app.use(express.json())

let user={}

//code to reduce headache of routing
//It is called express mounting
const userRouter=express.Router()
app.use('/about',userRouter)
userRouter
.route('/')
.get(getUser)
.post(postUser)
.patch(patchUser)
.delete(deleteUser)

userRouter
.route('/:username')
.get(getUsername)

app.get('/',function(request,response){    //get request and response for home route
    // console.log(request);
    // console.log('_______________________');
    // console.log(response);
    response.send("<h1>Hello World</h1>");
});

app.get('/contact',function(req,res){
    res.send("<h2>987654321</h2>")
})


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

function getUsername(req,res){
    console.log(req.params.username);
    console.log(req.params);
    res.send("username recieved")
}

app.listen(2000,function(err){     //open a server on localhost
    if(err) console.log(err);
    else console.log("started");
})