$("#dogs").click(fetchrandomdog);
function fetchrandomdog(){
var req=new XMLHttpRequest();
req.onload=function(){
    console.log(req.response);
    var responseJSON=JSON.parse(req.response);
    var imageURL=responseJSON.message;
    $("#dogge").attr('src',imageURL);
};
req.open('get','https://dog.ceo/api/breeds/image/random',true);
req.send();
}