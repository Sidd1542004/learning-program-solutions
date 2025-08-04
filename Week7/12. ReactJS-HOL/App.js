import React, { useState } from "react";
import GuestPage from "./components/GuestPage";
import UserPage from "./components/UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };
  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  let page;
  if (isLoggedIn) {
    page = <UserPage />;
  } else {
    page = <GuestPage />;
  }

  return (
    <div style={{ fontFamily: "Arial", padding: "20px" }}>
      <h1>✈️ Ticket Booking App</h1>
      <div style={{ marginBottom: "20px" }}>
        {isLoggedIn ? (
          <button onClick={handleLogout}>Logout</button>
        ) : (
          <button onClick={handleLogin}>Login</button>
        )}
      </div>
      {page}
    </div>
  );
}

export default App;
