import App from "../App";
import Store from "../pages/Store/Store";
import Community from "../pages/Community/Community";
import Support from "../pages/Support/Support";

export const routes = [
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
]