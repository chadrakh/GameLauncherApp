const navBarStyles = {
    drawer: {
        width: 320,
        fontWeight: 600,
        flexShrink: 0,
        '& .MuiDrawer-paper': {
            width: 300,
            boxSizing: 'border-box',
            backgroundColor: '#1A2027',
            // backgroundColor: '#101F33',
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

export { navBarStyles };