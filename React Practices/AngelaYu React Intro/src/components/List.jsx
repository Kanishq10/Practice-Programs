function List(props){
    const arrayList=props.names.map(items=>{
        return (
            <li>{items}</li>
        )
    })
    console.log(arrayList);
    return(
        <ul>
            {arrayList}
        </ul>
    )
}

export default List;