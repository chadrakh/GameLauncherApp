import React from 'react';
import './index.css';
import ReactDOM from 'react-dom/client';
import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import { pageRoutes } from './routes/pageRoutes';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route key={pageRoutes[0].id} path={pageRoutes[0].path} element={pageRoutes[0].element}>
          {pageRoutes.map((page) => (
            <Route
              key={page.id}
              path={page.path}
              element={page.element}
            />
          ))}
        </Route>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, learn more here:
// https://bit.ly/CRA-vitals