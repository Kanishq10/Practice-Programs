import Header from './components/Header'
import './App.css'
import List from './components/List'
import Footer from './components/Footer'
import MAIN ,{One,Two,Three} from './components/MutlipleExports.jsx'
import {Add,Multiply,Subtract} from "./components/Calculator.jsx";
import {Card} from "./components/Card.jsx";
import contact from "./components/contacts.js";

const url = 'https://picsum.photos/200/300'
const styling={    //object for inline styling
    color:"green",
    fontFamily:"cursive"
}

styling.backgroundColor="coral";
function App() {
    console.log(contact);
    // const [count, setCount] = useState(0)
    const names = ['Ghost', 'Captain Price', 'Soap'] //this is list we will render
    return (
        <>
        <div>
            <img src={url + '?grayscale'} alt="Just image"/>
            <Header/>
            <List names={names}/>
            <div style={styling}>
                <h1>This is styled with inline css which is passed as object</h1>
            </div>
            <Footer name={"Kanishq"}/>
            <div>
                <MAIN/>
                <One/>
                <Two/>
                <Three value={10}/>
            </div>
                <Add a={10} b={20}></Add>
                <Subtract a={445} b={14}></Subtract>
                <Multiply a={34} b={24}></Multiply>
        </div>
        <div> {/*add routing to it*/}
            <h1>Cards</h1>
            <Card url={contact[0].url} name={contact[0].name} cno={contact[0].cn}></Card>
            <Card url={contact[1].url} name={contact[1].name} cno={contact[1].cn}></Card>
            <Card url={contact[2].url} name={contact[2].name} cno={contact[2].cn}></Card>
        </div>
            </>
    )
}

export default App
