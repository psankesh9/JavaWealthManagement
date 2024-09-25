import React from 'react';
import ReactDOM from 'react-dom';
import './App.css';  // Import your styles
import App from './App';  // Import the main App component

// Render the App component into the root element in the HTML file
ReactDOM.render(
    <React.StrictMode>
        <App />
    </React.StrictMode>,
    document.getElementById('root')  // Assumes there is a <div id="root"> in public/index.html
);
