// src/App.js
import React from "react";
import Counter from "./components/Counter";
import WelcomeButton from "./components/WelcomeButton";
import SyntheticEventDemo from "./components/SyntheticEventDemo";
import CurrencyConverter from "./components/CurrencyConverter";

function App() {
  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>Event Examples App</h1>
      <Counter />
      <hr />
      <WelcomeButton />
      <hr />
      <SyntheticEventDemo />
      <hr />
      <CurrencyConverter />
    </div>
  );
}

export default App;
