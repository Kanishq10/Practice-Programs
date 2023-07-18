const http=require('http')
const fs = require('fs');
const server=http.createServer((req,res)=>{
    if(req.url==="/"){
        // res.write("Hello, How are you");
        // const file=fs.readFileSync('index.html');  //in sync function we need to map the file, so store it in variable otherwise it not go ahead
        fs.readFile('index.html',(err,data)=>{
            res.writeHead(200,{'Content-Type':'text/html'})
            // console.log(""+data);
            let file=""+data;
            res.write(JSON.stringify(file))
            res.end()
        })
    }   
    if(req.url==='/data'){
        res.write(JSON.stringify(['Ravi','Nikhil','Rakesh']))
    }

    res.end();
});

server.listen(4000);

