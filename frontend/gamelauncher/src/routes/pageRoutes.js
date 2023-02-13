import App from "../App";
import Home from "../pages/Home/Home";
import Browse from "../pages/Browse/Browse";
import Library from "../pages/Library/Library";
import Support from "../pages/Support/Support";
import Register from "../pages/Register/Register";
import Login from "../pages/Login/Login";

export const pageRoutes = [
    {
        id: 0,
        path: "/",
        element: <App />,
    },
    {
        id: 1,
        path: "/home",
        element: <Home />,
    },
    {
        id: 2,
        path: "/browse",
        element: <Browse />,
    },
    {
        id: 3,
        path: "/Library",
        element: <Library />,
    },
    {
        id: 4,
        path: "/support",
        element: <Support />,
    },
    {
        id: 5,
        path: "/register",
        element: <Register />,
    },
    {
        id: 6,
        path: "/login",
        element: <Login />,
    },
]