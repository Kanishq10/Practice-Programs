type ButtonProps={
    name:string;
    color?:string;
}

export const Mbutton=(props:ButtonProps)=>{
    const mess=()=>{console.log("I am clicked",props.name);
    }
    return(
        <button onClick={mess}>{props.color}</button>
    )
}