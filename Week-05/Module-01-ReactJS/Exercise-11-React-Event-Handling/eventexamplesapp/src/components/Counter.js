import React, { Component } from "react";

class Counter extends Component {

    constructor() {
        super();

        this.state = {
            count: 0
        };
    }

    increaseCount = () => {

        this.setState((prevState) => ({
            count: prevState.count + 1
        }));

        this.displayMessage();

    };

    decreaseCount = () => {

        this.setState((prevState) => ({
            count: prevState.count - 1
        }));

    };

    displayMessage = () => {

        alert("Hello! Counter value updated.");

    };

    render() {

        return (

            <div>

                <h2>Counter Value: {this.state.count}</h2>

                <button onClick={this.increaseCount}>
                    Increment
                </button>

                <button
                    onClick={this.decreaseCount}
                    style={{ marginLeft: "10px" }}
                >
                    Decrement
                </button>

            </div>

        );

    }

}

export default Counter;