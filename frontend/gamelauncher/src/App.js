import React from "react";
import TopNavBar from "./components/navbar/TopNavBar";
import SideNavBar from "./components/navbar/SideNavBar";
import Footer from "./components/Footer/Footer";
import { Outlet } from "react-router-dom";
import Grid from "@mui/material/Grid";

const App = () => {
  return (
    <Grid
        container
        sx={{
            height: '100%',
            color: '#fff',
            backgroundColor: '#232a33',
        }}
    >
      <TopNavBar />
      <SideNavBar />
      <Outlet />
      <Footer />
    </Grid>
  );
};

export default App;
