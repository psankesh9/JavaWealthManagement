import React, { useState, useEffect } from 'react';

function UserList() {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        fetch("/api/wealth/users")  // Calls the backend API to fetch users
            .then(res => res.json())
            .then((result) => {
                setUsers(result);
            });
    }, []);  // Empty dependency array means this runs once when the component is mounted

    return (
        <div>
            <h1>Wealth Management Users</h1>
            <ul>
                {users.map(user => (
                    <li key={user.id}>{user.name} - ${user.balance}</li>  // Display user details
                ))}
            </ul>
        </div>
    );
}

export default UserList;
