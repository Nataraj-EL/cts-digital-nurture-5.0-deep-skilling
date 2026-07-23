import React from "react";

import ListOfPlayers from "./components/ListOfPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {

    const flag = false;

    if (flag) {
        return (
            <div>
                <ListOfPlayers />
            </div>
        );
    } else {
        return (
            <div>
                <IndianPlayers />
            </div>
        );
    }

}

export default App;