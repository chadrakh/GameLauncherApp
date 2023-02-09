import React from "react";
import Drawer from "@mui/material/Drawer";
import Toolbar from "@mui/material/Toolbar";
import List from "@mui/material/List";
import Divider from "@mui/material/Divider";
import ListItem from "@mui/material/ListItem";
import ListItemButton from "@mui/material/ListItemButton";
import ListItemIcon from "@mui/material/ListItemIcon";
import ListItemText from "@mui/material/ListItemText";
import { mainNavListItems } from "./consts/navBarItems.js";
import { mainNavBarStyles } from "./navBarStyles.js";
import { useNavigate } from "react-router-dom";

const MainNavBar = () => {
  const navigate = useNavigate();
  
  return (
    <Drawer
      sx={mainNavBarStyles.drawer}
      variant="permanent"
      anchor="left"
    >
      <Toolbar />
      <Divider />
      <List>
        {mainNavListItems.map((item) => (
          <ListItem 
            key={item.id}
            onClick={() => navigate(item.route)}
          >
            <ListItemButton>
              <ListItemIcon
                sx={mainNavBarStyles.icons}
              >
                {item.icon}
              </ListItemIcon>
              <ListItemText
                sx={mainNavBarStyles.text}
                primary={item.label}
              />
            </ListItemButton>
          </ListItem>
        ))}
      </List>
    </Drawer>
  )
}

export default MainNavBar;