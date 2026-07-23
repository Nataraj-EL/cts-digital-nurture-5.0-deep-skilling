import FlightDetails from "./FlightDetails";

function GuestPage() {

    return (

        <div>

            <h2>Welcome Guest</h2>

            <p>You can view available flights.</p>

            <FlightDetails />

            <p style={{ color: "red" }}>
                Please login to book your ticket.
            </p>

        </div>

    );

}

export default GuestPage;