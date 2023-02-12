import React, { useState } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';

const Register = () => {
  const [isDisabled, setIsDisabled] = useState(true);

  const checkPasswordsMatch = () => {
    const password = document.getElementById("password");
    const confirmPassword = document.getElementById("password");

    return password === confirmPassword ? true : false;
  }

  const addUser = () => {
    const newUser = {
      forename: document.querySelector("forename"),
      surname: document.querySelector("surname"),
      email: document.querySelector("email"),
      username: document.querySelector("username"),
      password: document.querySelector("password"),
    };

    console.table(newUser)
    /*
    fetch(`/users/add/${newUser}`, {
      method: 'POST',
      headers: {
        Accept: 'application/json',
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({
        newUser
      }),
    })
    */
  }

  return (
    <Box
      component="form"
      sx={{
        '& .MuiTextField-root': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <div className="register-grid-align">
        <h1>Register</h1>
        <div className="register-container">
          <div>
            <div>
              <TextField
                id="forename"
                label="First Name"
                required
              />
            </div>
            <div>
              <TextField
                id="surname"
                label="Last Name"
                required
              />
            </div>
            <div>
              <TextField
                id="email"
                label="Email"
                placeholder="example@email.com"
                required
              />
            </div>
          </div>


          <div className="register-vl"></div>
          <div>
            <div>
              <TextField
                id="username"
                label="Username"
                required
              />
            </div>
            <div>
              <TextField
                id="password"
                label="Password"
                type="password"
                required
              />
            </div>
            <div>
              <TextField
                id="confirmPassword"
                label="Confirm Password"
                type="password"
                onBlur={() => setIsDisabled(checkPasswordsMatch)}
                required
              />
            </div>
          </div>
        </div>
        <br></br>
        <Button
          id="registerSubmit"
          variant="outlined"
          disabled={isDisabled}
          onClick={addUser}
        >
          Register
        </Button>
      </div>
    </Box>
  )
}

export default Register;