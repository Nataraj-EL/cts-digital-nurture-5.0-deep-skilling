import { useState } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function LoginControl() {

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    return (

        <div>

            {
                isLoggedIn
                    ? <UserPage />
                    : <GuestPage />
            }

            <br />

            <button
                onClick={() => setIsLoggedIn(!isLoggedIn)}
            >
                {isLoggedIn ? "Logout" : "Login"}
            </button>

        </div>

    );

}

export default LoginControl;