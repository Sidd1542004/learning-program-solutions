import React from "react";

const UserPage = () => {
  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>You are now logged in. You can book your tickets below:</p>
      <ul>
        <li>
          Delhi ✈️ Mumbai - ₹4500 <button>Book</button>
        </li>
        <li>
          Chennai ✈️ Bangalore - ₹3000 <button>Book</button>
        </li>
        <li>
          Kolkata ✈️ Hyderabad - ₹3500 <button>Book</button>
        </li>
      </ul>
    </div>
  );
};

export default UserPage;
