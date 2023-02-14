import React from "react";
import "./index.css";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { pageRoutes } from "./pages/Routes/PageRoutes";
import { ThemeProvider } from "@mui/material/styles";
import { dashboardTheme } from "./DashboardTheme";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <ThemeProvider theme={dashboardTheme}>
      <BrowserRouter>
        <Routes>
          <Route
            key={pageRoutes[0].id}
            path={pageRoutes[0].path}
            element={pageRoutes[0].element}
          >
            {pageRoutes.map((page) => (
              <Route key={page.id} path={page.path} element={page.element} />
            ))}
          </Route>
        </Routes>
      </BrowserRouter>
    </ThemeProvider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, learn more here:
// https://bit.ly/CRA-vitals
