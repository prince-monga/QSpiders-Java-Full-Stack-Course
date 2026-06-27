import React, { useState } from "react";

const Password = () => {
  const [showPassword, setShowPassword] = useState(false);

  return (
    <>
      <form>
        <input
          type={showPassword ? "text" : "password"}
          placeholder="Enter your password"
        />

        <button
          type="button"
          onClick={() => setShowPassword(!showPassword)}
        >
          {showPassword ? "Hide Password" : "Show Password"}
        </button>
      </form>
    </>
  );
};

export default Password;