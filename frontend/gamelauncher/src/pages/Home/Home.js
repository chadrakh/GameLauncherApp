import React from 'react';
import Grid from '@mui/material/Grid';
import Paper from '@mui/material/Paper';


const Home = () => {
  const gridItems = [
    {
      id: 0,
      label: "One",
    },
    {
      id: 1,
      label: "Two",
    },
    {
      id: 2,
      label: "Three",
    },
    {
      id: 3,
      label: "Four",
    }
  ];

  return (
    <Grid item xs={8}>
        <Grid container justifyContent="center" spacing={2}>
          {gridItems.map(() => (
            <Grid key={gridItems.id} item>
              <Paper
                sx={{
                  height: 140,
                  width: 350,
                  backgroundColor: '#1A2027',
                  color: '#fff',
                }}
              />
              {gridItems.label}
            </Grid>
          ))}
        </Grid>
    </Grid>
  )
}

export default Home;