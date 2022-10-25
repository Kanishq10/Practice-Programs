const express=require('express')
const app=express()

app.get('/',function(request,response){    //get request and response for home route
    // console.log(request);
    // console.log('_______________________');
    // console.log(response);
    response.send("<h1>Hello World</h1>");
});

app.get('/contact',function(req,res){
    res.send("<h2>987654321</h2>")
})

app.get('/about',function(req,res){
    res.send(`
    <h1>Hello I am Kanishq</h1>
    <h2>I am a full stack developer</h2>
    <h3>He he How are you</h3>
    `)
})

app.listen(2000,function(err){     //open a server on localhost
    if(err) console.log(err);
    else console.log("started");
})