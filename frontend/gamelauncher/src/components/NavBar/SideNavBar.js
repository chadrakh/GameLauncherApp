import React from "react";
import Grid from "@mui/material/Grid";
import Drawer from "@mui/material/Drawer";
import List from "@mui/material/List";
import Divider from "@mui/material/Divider";
import ListItem from "@mui/material/ListItem";
import ListItemButton from "@mui/material/ListItemButton";
import ListItemIcon from "@mui/material/ListItemIcon";
import ListItemText from "@mui/material/ListItemText";
import { mainNavListItems } from "./consts/NavBarItems.js";
import { navBarStyles } from "./consts/NavBarStyles.js";
import { useNavigate } from "react-router-dom";

const SideNavBar = () => {
  const navigate = useNavigate();

  return (
    <Grid item>
        <Drawer
          sx={navBarStyles.drawer}
          variant="permanent"
          anchor="left">
          <Divider />
          <List>
            {mainNavListItems.map((item) => (
              <ListItem
                key={item.id}
                onClick={() => navigate(item.route)}>
                <ListItemButton>
                  <ListItemIcon
                    sx={navBarStyles.icons}
                    >
                      {item.icon}
                  </ListItemIcon>
                  <ListItemText
                    sx={navBarStyles.text}
                    primary={item.label}
                  />
                </ListItemButton>
              </ListItem>
            ))}
          </List>
        </Drawer>
    </Grid>
  );
};

export default SideNavBar;
