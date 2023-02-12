import LocalGroceryStoreIcon from '@mui/icons-material/LocalGroceryStore';
import PeopleIcon from '@mui/icons-material/People';
import ContactSupportIcon from '@mui/icons-material/ContactSupport';

const mainNavListItems = [
    {
        id: 0,
        icon: <LocalGroceryStoreIcon />,
        label: 'Browse',
        route: 'browse'
    },
    {
        id: 1,
        icon: <PeopleIcon />,
        label: 'My Library',
        route: 'library'
    },
    {
        id: 2,
        icon: <ContactSupportIcon />,
        label: 'Help',
        route: 'help'
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