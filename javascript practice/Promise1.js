
function placeOrder(drink){
    return new Promise(function(resolve,reject){
        if(drink==='coffee'){
            resolve('Order placed')
        }
        else{
            reject('Sorry we dont have that')
        }
    })
}

function processOrder(order){
    return new Promise(function(resolve){
        console.log('Order is being processed')
        resolve(`Coffe served for the ${order}`)
    })
}


// placeOrder('coffee').then(function(order){
//     console.log('Request Recieved')
//     let orderIsprocessed =processOrder(order)
//     return orderIsprocessed
// }).then(function(orderIsprocessed){
//     console.log(orderIsprocessed)
// }).catch(function(err){
//     console.log(err)
// })
//the problem here is promise chaining ,code will be larger so async await comes in process

//async- await

async function serveOrder(){
    try {
        const orderReceieved=await placeOrder('coffee')
        console.log(orderReceieved)
        const processedOrder=await processOrder(orderReceieved)
        console.log(processedOrder)
    } catch (error) {
        console.log(error)
    }
}

serveOrder()
