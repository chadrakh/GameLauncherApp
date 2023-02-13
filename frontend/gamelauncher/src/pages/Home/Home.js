import React, { useState } from 'react';
import Grid from '@mui/material/Grid';
import StdMenu from '../../components/standard/stdMenu';
import AccountControl from '../../components/AccountControl/AccountControl';
import Button from '@mui/material/Button';

const Home = () => {
  const [open, setOpen] = useState(false);
  const [anchorEl, setAnchorEl] = useState(null);

  const handleOpen = (event) => {
    console.log("handleOpen ran")
    setAnchorEl(event.currentTarget);
    setOpen(true);
  };

  const handleClose = () => {
    setOpen(false);
  };

  return (
    <Grid item xs={8}>
      <Button
        variant="default"
      >
        Login/Register
      </Button>
      <AccountControl
        iconColor={"primary"}
        anchorEl={anchorEl}
        onClick={handleOpen}
      />
      <StdMenu
        open={open}
        anchorEl={anchorEl}
        handleClose={handleClose}
      />
    </Grid>
  )
}

export default Home;