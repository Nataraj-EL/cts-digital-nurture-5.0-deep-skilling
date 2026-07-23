import Counter from "./components/Counter";
import SayWelcome from "./components/SayWelcome";
import SyntheticEvent from "./components/SyntheticEvent";
import CurrencyConvertor from "./components/CurrencyConvertor";

function App() {

    return (

        <div
            style={{
                textAlign: "center",
                marginTop: "40px",
                fontFamily: "Arial"
            }}
        >

            <h1>React Event Handling</h1>

            <Counter />

            <br />

            <SayWelcome />

            <br />

            <SyntheticEvent />

            <br />

            <CurrencyConvertor />

        </div>

    );

}

export default App;