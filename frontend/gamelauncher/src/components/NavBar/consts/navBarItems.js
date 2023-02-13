import HomeIcon from '@mui/icons-material/Home';
import LocalGroceryStoreIcon from '@mui/icons-material/LocalGroceryStore';
import LibraryBooksIcon from '@mui/icons-material/LibraryBooks';
import ContactSupportIcon from '@mui/icons-material/ContactSupport';

const mainNavListItems = [
    {
        id: 0,
        icon: <HomeIcon />,
        label: 'Home',
        route: 'home'
    },
    {
        id: 1,
        icon: <LocalGroceryStoreIcon />,
        label: 'Browse',
        route: 'browse'
    },
    {
        id: 2,
        icon: <LibraryBooksIcon />,
        label: 'My Library',
        route: 'library'
    },
    {
        id: 3,
        icon: <ContactSupportIcon />,
        label: 'Support',
        route: 'support'
    }
];

const subNavListItems = [
    {
        id: 0,
        icon: '',
        label: 'Login/Register',
        route: 'route'
    }
];

export { mainNavListItems, subNavListItems };