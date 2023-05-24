
function One(){
    return(
        <h3>I am function 1</h3>
    )
}

function Two(){
    return(
        <h3>I am function 2</h3>
    )
}

function Three(props){
    return(
        <h3>I am function 3 with {props.value}</h3>
    )
}

function DEFAULT(){
    return(
        <h3>I am default function</h3>
    )
}

export default DEFAULT;
export {One,Two,Three};