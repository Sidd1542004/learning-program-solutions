import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 45 },
    { name: "Dhoni", score: 75 },
    { name: "Pant", score: 30 },
    { name: "Hardik", score: 85 },
    { name: "Bumrah", score: 60 },
    { name: "KL Rahul", score: 78 },
    { name: "Jadeja", score: 50 },
    { name: "Ashwin", score: 90 },
    { name: "Gill", score: 68 },
    { name: "Shami", score: 40 },
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, idx) => (
          <li key={idx}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>Players with Score below 70</h3>
      <ul>
        {lowScorers.map((player, idx) => (
          <li key={idx}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
