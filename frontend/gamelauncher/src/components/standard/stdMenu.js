import React from "react";
import Menu from "@mui/material/Menu";
import MenuItem from "@mui/material/MenuItem";

const StdMenu = ({ anchorEl, handleClose, open }) => {
  // const menuItems = [
  //   {
  //     id: 0,
  //     label: "Profile"
  //   },
  //   {
  //     id: 1,
  //     label: "My Account"
  //   },
  //   {
  //     id: 2,
  //     label: "Logout"
  //   }    
  // ];

  return (
    <Menu
      id="basic-menu"
      anchorEl={anchorEl}
      open={open}
      onClose={handleClose}
    >
      <MenuItem onClick={handleClose}>Profile</MenuItem>
      <MenuItem onClick={handleClose}>My Account</MenuItem>
      <MenuItem onClick={handleClose}>Logout</MenuItem>
      {/* {menuItems.map((item) => {
        <MenuItem
          onClick={handleClose}
        >
          {item.label}
        </MenuItem>
      })} */}
    </Menu>
  );
};

export default StdMenu;
