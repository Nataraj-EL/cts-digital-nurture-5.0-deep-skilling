import React from "react";

function IndianPlayers() {

    const players = [
        "Shubman Gill",
        "Yashasvi Jaiswal",
        "Shreyas Iyer",
        "Ruturaj Gaikwad",
        "Sanju Samson",
        "Tilak Varma"
    ];

    const [odd1, even1, odd2, even2, odd3, even3] = players;

    const T20Players = [
        "Suryakumar Yadav",
        "Hardik Pandya",
        "Rinku Singh"
    ];

    const RanjiPlayers = [
        "Abhimanyu Easwaran",
        "Mayank Agarwal",
        "Karun Nair"
    ];

    const mergedPlayers = [...T20Players, ...RanjiPlayers];

    return (
        <div>

            <h1>Indian Players</h1>

            <h2>Odd Team Players</h2>

            <ul>
                <li>{odd1}</li>
                <li>{odd2}</li>
                <li>{odd3}</li>
            </ul>

            <h2>Even Team Players</h2>

            <ul>
                <li>{even1}</li>
                <li>{even2}</li>
                <li>{even3}</li>
            </ul>

            <h2>List of Indian Players Merged</h2>

            <ul>
                {
                    mergedPlayers.map((player, index) => (
                        <li key={index}>{player}</li>
                    ))
                }
            </ul>

        </div>
    );
}

export default IndianPlayers;