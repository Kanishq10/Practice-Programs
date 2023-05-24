export const Card=(props)=>{
    return(
        <div className="card">
        <img src={props.url} alt={"Image"} style={{width:"100%"}}/>
            <div className="container">
                <h4>{props.name}</h4>
                <p>{props.cno}</p>
            </div>
            <hr/>
        </div>
    )
}