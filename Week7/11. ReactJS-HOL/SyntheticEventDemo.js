import React from "react";

const SyntheticEventDemo = () => {
  const handleClick = (e) => {
    alert("I was clicked (Synthetic Event)");
    console.log("Synthetic Event Object:", e);
  };

  return (
    <div>
      <button onClick={handleClick}>OnPress</button>
    </div>
  );
};

export default SyntheticEventDemo;
