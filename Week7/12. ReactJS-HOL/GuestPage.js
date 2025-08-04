import React from "react";

const GuestPage = () => {
  return (
    <div>
      <h2>Welcome Guest!</h2>
      <p>You can browse flights, but login is required to book tickets.</p>
      <ul>
        <li>Flight: Delhi ✈️ Mumbai - ₹4500</li>
        <li>Flight: Chennai ✈️ Bangalore - ₹3000</li>
        <li>Flight: Kolkata ✈️ Hyderabad - ₹3500</li>
      </ul>
    </div>
  );
};

export default GuestPage;
