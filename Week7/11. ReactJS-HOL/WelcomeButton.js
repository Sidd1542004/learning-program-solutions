import React from "react";

function sayWelcome(message) {
  alert(`Message: ${message}`);
}

const WelcomeButton = () => {
  return (
    <div>
      <button onClick={() => sayWelcome("Welcome to React!")}>Say Welcome</button>
    </div>
  );
};

export default WelcomeButton;
