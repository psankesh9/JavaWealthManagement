import React, { useState } from 'react';

function AddUser() {
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [balance, setBalance] = useState(0);

    const handleSubmit = (event) => {
        event.preventDefault();  // Prevents the default form submit behavior (page reload)
        const user = { name, email, balance };  // Create a new user object
        fetch("/api/wealth/users", {  // Calls the backend API to add a new user
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(user)  // Send the user data in JSON format
        }).then(() => {
            console.log("New user added");
        });
    }

    return (
        <div>
            <h2>Add New User</h2>
            <form onSubmit={handleSubmit}>
                <label>Name:</label>
                <input type="text" value={name} onChange={(e) => setName(e.target.value)} /><br />
                <label>Email:</label>
                <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} /><br />
                <label>Balance:</label>
                <input type="number" value={balance} onChange={(e) => setBalance(e.target.value)} /><br />
                <button type="submit">Add User</button>
            </form>
        </div>
    );
}

export default AddUser;
