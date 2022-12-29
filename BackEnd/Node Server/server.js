const http=require('http');
const fs=require('fs');
const server=http.createServer((req,res)=>{
    console.log('Request has been made from browser to server');
    console.log(req);
    console.log(req.url);
    // console.log(req.method);

    // res.setHeader('Content-Type','text/plain');
    // res.write('Hello, Pepcoders!:)');
    // res.end();
    let path='./views';
    switch(req.url){
        case '/':
            path+='/index.html'
            break
        case '/about':
            path+='/about.html'
            break
        default:
            path+='/404.html'
            break
    };

    fs.readFile(path,(err,fileData)=>{
        if(err){
            console.log(err);
        }
        else{
            // res.write(fileData);
            res.end(fileData);   //if only needed one line
        }
    })
});

server.listen(3000,'localhost',()=>{
    console.log("server is listening on port 3000");
});
