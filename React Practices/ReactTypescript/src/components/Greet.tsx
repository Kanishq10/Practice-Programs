type proprsparam={   //properties type for props
    name:string
}

export const Greet=(props:proprsparam)=>{   //type is necessary
    return(
        <div>
            <h1>Welcome {props.name} To Typescript React</h1>
        </div>
    )
}