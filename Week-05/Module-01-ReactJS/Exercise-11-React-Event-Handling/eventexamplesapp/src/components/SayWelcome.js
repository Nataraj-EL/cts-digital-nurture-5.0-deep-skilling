import React from "react";

function SayWelcome() {

    const showWelcome = (message) => {

        alert(message);

    };

    return (

        <div>

            <button
                onClick={() => showWelcome("Welcome to React Event Handling")}
            >
                Say Welcome
            </button>

        </div>

    );

}

export default SayWelcome;