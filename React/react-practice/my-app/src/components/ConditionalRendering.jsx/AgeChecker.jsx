import React, { useState } from 'react';

const AgeChecker = () => {

  const [age, setAge] = useState('');
  const [result, setResult] = useState('');

  const ageChecker = (e) => {
    e.preventDefault();

    if (age >= 18) {
      setResult("Adult");
    } else {
      setResult("Minor");
    }
  };

  return (
    <div>
      <form onSubmit={ageChecker}>
        <span>Age Checker</span>
        <br />

        <input
          type="number"
          placeholder="Enter your age"
          value={age}
          onChange={(e) => setAge(e.target.value)}
        />

        <button type="submit">
          Check
        </button>
      </form>

      {result && <h1>{result}</h1>}
    </div>
  );
};

export default AgeChecker;