import App from "../../App";
import Home from "../Home/Home";
import Browse from "../Browse/Browse";
import Library from "../Library/Library";
import Support from "../Support/Support";
import Register from "../Register/Register";
import Login from "../Login/Login";

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