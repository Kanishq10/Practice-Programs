
const Logger=require('./events2')
const logger=new Logger();

//it will catch the event and also make sure first argument should be same
logger.on('ms',function(arg){   //event listener is called
    console.log("Listener called...",arg);
})

logger.Log("hello Function is called")