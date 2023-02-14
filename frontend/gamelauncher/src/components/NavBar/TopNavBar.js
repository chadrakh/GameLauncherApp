import React, { useState } from 'react';
import Grid from '@mui/material/Grid';
import StdMenu from '../Standard/StdMenu';
import AccountControl from '../../components/AccountControl/AccountControl';
import Button from '@mui/material/Button';


const TopNavBar = () => {
  const [open, setOpen] = useState(false);
  const [anchorEl, setAnchorEl] = useState(null);

  const handleOpen = (event) => {
    setAnchorEl(event.currentTarget);
    setOpen(true);
  };

  const handleClose = () => {
    setOpen(false);
  };
    
  return (
    <Grid container justifyContent="right">
      <Grid item>
      <Button
        variant="default"
      >
        Register
      </Button>
      <Button
        variant="default"
      >
        Login
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
    </Grid>
  )
}

export default TopNavBar;