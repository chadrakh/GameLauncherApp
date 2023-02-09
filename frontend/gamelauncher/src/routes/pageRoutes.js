import App from "../App";
import Store from "../pages/Store/Store";
import Community from "../pages/Community/Community";
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
        path: "/store",
        element: <Store />,
    },
    {
        id: 2,
        path: "/community",
        element: <Community />,
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