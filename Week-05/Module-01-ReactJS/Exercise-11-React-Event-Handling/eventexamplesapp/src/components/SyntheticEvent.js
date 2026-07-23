import React from "react";

function SyntheticEvent() {

    const handlePress = (event) => {

        alert("I was clicked");

        console.log(event.type);

    };

    return (

        <div>

            <button onClick={handlePress}>
                Click Me
            </button>

        </div>

    );

}

export default SyntheticEvent;
