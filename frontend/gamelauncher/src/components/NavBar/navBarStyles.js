const mainNavBarStyles = {
    drawer: {
        width: 320,
        flexShrink: 0,
        '& .MuiDrawer-paper': {
            width: 320,
            boxSizing: 'border-box',
            backgroundColor: '#101F33',
        },
        '& .Mui-selected': {
            color: '#ffffff',
        },
    },
    icons: {
        color: '#ffffffb3',
        marginLeft: '20px',

    },
    text: {
        color: '#ffffffb3',
        
        '& span': {
            marginLeft: '-10px',
            fontWeight: '600',
            fontSize: '16px',
        },
    }
};

// const subNavBarStyles = {};

export { mainNavBarStyles };