import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Shubman Gill", score: 91 },
        { name: "Yashasvi Jaiswal", score: 84 },
        { name: "Shreyas Iyer", score: 68 },
        { name: "Ruturaj Gaikwad", score: 74 },
        { name: "Washington Sundar", score: 58 },
        { name: "Axar Patel", score: 81 },
        { name: "Arshdeep Singh", score: 66 },
        { name: "Kuldeep Yadav", score: 72 },
        { name: "Sanju Samson", score: 63 },
        { name: "Mohammed Siraj", score: 49 },
        { name: "Tilak Varma", score: 77 }
    ];

    return (
        <div>
            <h1>List of Players</h1>

            <table border="1" align="center" cellPadding="8">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Score</th>
                    </tr>
                </thead>

                <tbody>
                    {
                        players.map((player, index) => (
                            <tr key={index}>
                                <td>{player.name}</td>
                                <td>{player.score}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>

            <h2>Players Scored Below 70</h2>

            <ul>
                {
                    players
                        .filter(player => player.score < 70)
                        .map((player, index) => (
                            <li key={index}>
                                {player.name} - {player.score}
                            </li>
                        ))
                }
            </ul>

        </div>
    );
}

export default ListofPlayers;