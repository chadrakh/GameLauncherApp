import App from "../App";
import Browse from "../pages/Browse/Browse";
import Library from "../pages/Library/Library";
import Support from "../pages/Support/Support";
import Register from "../pages/Register/Register";
import Login from "../pages/Login/Login";

const pageRoutes = [
    {
        id: 0,
        path: "/",
        element: <App />,
    },
    {
        id: 1,
        path: "/browse",
        element: <Browse />,
    },
    {
        id: 2,
        path: "/Library",
        element: <Library />,
    },
    {
        id: 3,
        path: "/support",
        element: <Support />,
    },
    {
        id: 4,
        path: "/register",
        element: <Register />,
    },
    {
        id: 5,
        path: "/login",
        element: <Login />,
    },
]

export { pageRoutes };