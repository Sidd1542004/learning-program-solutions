import React, { useState } from "react";

const CurrencyConverter = () => {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const conversionRate = 0.011; // example rate: 1 INR = 0.011 Euro
    const converted = parseFloat(rupees) * conversionRate;
    setEuro(converted.toFixed(2));
  };

  return (
    <div>
      <h3>Currency Converter</h3>
      <form onSubmit={handleSubmit}>
        <label>INR: </label>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          required
        />
        <button type="submit">Convert</button>
      </form>
      {euro && <p>EUR: €{euro}</p>}
    </div>
  );
};

export default CurrencyConverter;
