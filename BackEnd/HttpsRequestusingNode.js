const https=require('https')    //native, no need to install
let url='https://api.quotable.io/random'
https.get(url,function(response){
    console.log(response.statusCode);
    response.on("data",function(data){
        console.log(JSON.parse(data));
    })
})