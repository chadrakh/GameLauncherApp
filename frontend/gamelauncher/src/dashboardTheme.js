import { createTheme } from '@mui/material/styles';

export const dashboardTheme = createTheme({
    components: {
        // Name of the component
        typography: {
          fontFamily: [
            'Roboto',
            'Oxygen',
            'Helvetica Neue',
            'sans-serif'
          ]
        },
        MuiButton: {
          styleOverrides: {
            // Name of the slot
            root: {
              // Some CSS
              fontSize: '1rem',
            },
          },
        },
      },
      spacing: [4, 8, 12, 16, 20],
      // theme.spacing(4)
});