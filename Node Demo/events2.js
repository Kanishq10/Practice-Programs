const Eventemitter=require('events');   //class eventEmitter 

//calling constructor of class  
// const emitter= new Eventemitter();  

//event is called
// emitter.emit('messageLogged',{url:'https://calendar.google.com/calendar/u/0/r/day?pli=1&sf=true&output=xml%23eventpage_6',id:1});

class logger extends Eventemitter{
    Log(message){
        console.log(message);
        this.emit('ms',{url:'https://iolog.com',id:2});
    }
}

module.exports=logger;