import React, { useState } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';

const Login = () => {
  const [btnDisabled, setBtnDisabled] = useState(true);

  return (
    <Box
      component="form"
      sx={{
        '& .MuiTextField-root': { m: 1, width: '25ch'}
      }}
      noValidate
      autoComplete="off"
    >
      <div>
        <TextField
          required
          label="Username"
          InputLabelProps={{
            shrink: true,
          }}
        />
        <TextField
          required
          label="Password"
          type="password"
          autoComplete="current-password"
          InputLabelProps={{
            shrink: true,
          }}

          onChange={(text) => setBtnDisabled(!text.target.value)}
        />
      </div>
      <div>
        <Button 
          disabled={btnDisabled}
        >
          Login
        </Button>
      </div>
    </Box>
  )
}

export default Login;