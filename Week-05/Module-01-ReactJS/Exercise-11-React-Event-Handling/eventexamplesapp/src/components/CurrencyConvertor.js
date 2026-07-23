import React, { useState } from "react";

function CurrencyConvertor() {

    const [rupees, setRupees] = useState("");

    const handleSubmit = () => {

        const conversionRate = 91;
        const euro = (rupees / conversionRate).toFixed(2);

        alert(`€ ${euro}`);

    };

    return (

        <div>

            <h2>Currency Convertor</h2>

            <input
                type="number"
                placeholder="Enter Amount in INR"
                value={rupees}
                onChange={(e) => setRupees(e.target.value)}
            />

            <br /><br />

            <button onClick={handleSubmit}>
                Convert
            </button>

        </div>

    );

}

export default CurrencyConvertor;