import LocalGroceryStoreIcon from '@mui/icons-material/LocalGroceryStore';
import PeopleIcon from '@mui/icons-material/People';
import ContactSupportIcon from '@mui/icons-material/ContactSupport';

const mainNavListItems = [
    {
        id: 0,
        icon: <LocalGroceryStoreIcon />,
        label: 'Store',
        route: 'store'
    },
    {
        id: 1,
        icon: <PeopleIcon />,
        label: 'Community',
        route: 'community'
    },
    {
        id: 2,
        icon: <ContactSupportIcon />,
        label: 'Support',
        route: 'support'
    }
];

const subNavListItems = [
    {
        id: 0,
        icon: '',
        label: '',
        route: 'route'
    },
    {
        id: 1,
        icon: '',
        label: '',
        route: 'route'
    },
    {
        id: 2,
        icon: '',
        label: '',
        route: 'route'
    }
];

export { mainNavListItems, subNavListItems };