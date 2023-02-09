import App from "../App";
import Store from "../pages/Store/Store";
import Community from "../pages/Community/Community";
import Support from "../pages/Support/Support";
import Register from "../pages/Register/Register";
import Login from "../pages/Login/Login";

const routes = [
    {
        path: "/",
        element: <App />,
    },
    {
        path: "/store",
        element: <Store />,
    },
    {
        path: "/community",
        element: <Community />,
    },
    {
        path: "/support",
        element: <Support />,
    },
    {
        path: "/register",
        element: <Register />,
    },
    {
        path: "/login",
        element: <Login />,
    },
]

export { routes };