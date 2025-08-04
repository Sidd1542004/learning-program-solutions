import React from "react";

function App() {
  // Office space data (list of objects)
  const officeList = [
    {
      name: "Innovate Hub",
      rent: 55000,
      address: "Bangalore, India",
      image: "https://via.placeholder.com/300x200?text=Office+1",
    },
    {
      name: "WorkNest",
      rent: 70000,
      address: "Hyderabad, India",
      image: "https://via.placeholder.com/300x200?text=Office+2",
    },
    {
      name: "StartUp Space",
      rent: 45000,
      address: "Chennai, India",
      image: "https://via.placeholder.com/300x200?text=Office+3",
    },
  ];

  return (
    <div style={{ fontFamily: "Arial", padding: "20px" }}>
      {/* Heading element */}
      <h1 style={{ color: "#333" }}>Office Space Rental App</h1>

      {/* Rendering list of office spaces */}
      {officeList.map((office, index) => {
        const rentStyle = {
          color: office.rent < 60000 ? "red" : "green",
          fontWeight: "bold",
        };

        return (
          <div
            key={index}
            style={{
              border: "1px solid #ccc",
              margin: "10px 0",
              padding: "15px",
              borderRadius: "10px",
            }}
          >
            <img
              src={office.image}
              alt={`${office.name}`}
              style={{ width: "300px", height: "200px", objectFit: "cover" }}
            />
            <h2>{office.name}</h2>
            <p style={rentStyle}>Rent: ₹{office.rent}</p>
            <p>Address: {office.address}</p>
          </div>
        );
      })}
    </div>
  );
}

export default App;
