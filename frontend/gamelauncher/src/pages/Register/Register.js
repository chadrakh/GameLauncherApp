import React, { useState } from "react";
import Box from "@mui/material/Box";
import TextField from "@mui/material/TextField";
import Button from "@mui/material/Button";
import Grid from "@mui/material/Grid";

const Register = () => {
  // const [isDisabled, setIsDisabled] = useState(true);
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPasswword] = useState("");
  const [password2, setPasswword2] = useState("");

  const checkPasswordsMatch = () => {
    return password === password2 ? true : false;
  };

  const baseURL = "http://localhost:8080";
  const updateOrAddUser = async () => {
    const newUser = {
      firstName: firstName,
      lastName: lastName,
      email: email,
      password: password,
    };

    console.table(newUser);
    console.log(JSON.stringify(newUser));

    await fetch(baseURL + "/users", {
      method: "POST",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
      body: JSON.stringify(newUser),
    });
  };

  return (
    <Grid item xs={8}>
      {/* <Box
        component="form"
        sx={{
          "& .MuiTextField-root": { m: 1, width: "25ch" },
        }}
        noValidate
        autoComplete="off"
      >
        <div className="register-grid-align">
          <h1>Register</h1>
          <div className="register-container">
            <div>
              <TextField
                id="firstName"
                label="First Name"
                value={firstName}
                onChange={(event) => {
                  setFirstName(event.target.value);
                }}
                required
              />
            </div>
            <div>
              <TextField
                id="lastName"
                label="Last Name"
                value={lastName}
                onChange={(event) => {
                  setLastName(event.target.value);
                }}
                required
              />
            </div>
            <div>
              <TextField
                id="email"
                label="Email"
                placeholder="example@email.com"
                value={email}
                onChange={(event) => {
                  setEmail(event.target.value);
                }}
                required
              />
            </div>
            <div>
              <div>
                <TextField
                  id="password"
                  label="Password"
                  type="password"
                  value={password}
                  onChange={(event) => {
                    setPasswword(event.target.value);
                  }}
                  required
                />
              </div>
              <div>
                <TextField
                  id="confirmPassword"
                  label="Confirm Password"
                  type="password"
                  value={password2}
                  onChange={(event) => {
                    setPasswword2(event.target.value);
                  }}
                  onBlur={checkPasswordsMatch}
                  required
                />
              </div>
            </div>
          </div>
          <br></br>
          <Button
            id="registerSubmit"
            variant="outlined"
            onClick={updateOrAddUser}
          >
            Register
          </Button>
        </div>
      </Box> */}
    </Grid>
  );
};

export default Register;
