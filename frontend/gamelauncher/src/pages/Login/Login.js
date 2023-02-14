import React, { useState } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import Grid from '@mui/material/Grid';


const Login = () => {
  return (
    <Grid item>
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
        />
      </div>
      <div>
        <Button>
          Login
        </Button>
      </div>
      </Box>
    </Grid>
  )
}

export default Login;