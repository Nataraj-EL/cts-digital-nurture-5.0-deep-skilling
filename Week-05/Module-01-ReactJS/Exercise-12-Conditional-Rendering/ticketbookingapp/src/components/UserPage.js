import FlightDetails from "./FlightDetails";

function UserPage() {

    return (

        <div>

            <h2>Welcome User</h2>

            <FlightDetails />

            <button
                style={{
                    marginTop: "15px",
                    padding: "8px 16px"
                }}
            >
                Book Ticket
            </button>

        </div>

    );

}

export default UserPage;