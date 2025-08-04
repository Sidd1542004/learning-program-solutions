import React from "react";

const IndianPlayers = () => {
  const oddPlayers = ["Virat", "Dhoni", "Hardik", "KL Rahul", "Ashwin", "Shami"];
  const evenPlayers = ["Rohit", "Pant", "Bumrah", "Jadeja", "Gill"];

  // Destructuring example
  const [p1, p2, p3, ...restOdd] = oddPlayers;
  const [e1, e2, e3, ...restEven] = evenPlayers;

  // Merging arrays
  const T20players = ["Surya", "Ishan"];
  const RanjiTrophy = ["Rahane", "Pujara"];
  const allPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {[p1, p2, p3, ...restOdd].map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {[e1, e2, e3, ...restEven].map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players (T20 + Ranji)</h2>
      <ul>
        {allPlayers.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;

