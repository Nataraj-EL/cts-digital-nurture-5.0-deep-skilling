import React from "react";

function App() {

  const officeImage =
    "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800";

  const offices = [
    {
      id: 1,
      name: "Tech Hub Workspace",
      rent: 55000,
      address: "Chennai"
    },
    {
      id: 2,
      name: "Innovation Towers",
      rent: 72000,
      address: "Bengaluru"
    },
    {
      id: 3,
      name: "Business Square",
      rent: 61000,
      address: "Hyderabad"
    },
  ];

  return (

    <div style={{ padding: "20px", fontFamily: "Arial" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="500"
        height="300"
      />

      <hr />

      <h2>Available Office Spaces</h2>

      {
        offices.map((office) => (

          <div
            key={office.id}
            style={{
              border: "1px solid gray",
              padding: "15px",
              marginBottom: "15px",
              borderRadius: "8px"
            }}
          >

            <h3>{office.name}</h3>

            <p>

              <strong>Rent:</strong>

              <span
                style={{
                  color: office.rent < 60000 ? "red" : "green",
                  fontWeight: "bold"
                }}
              >

                ₹{office.rent}

              </span>

            </p>

            <p>

              <strong>Address:</strong> {office.address}

            </p>

          </div>

        ))
      }

    </div>

  );

}

export default App;