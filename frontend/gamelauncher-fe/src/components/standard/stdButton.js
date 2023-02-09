import React from 'react';
import Button from '@mui/material/Button';

const StdButton = (children, key, handleOnClick, color, disabled, size, variant, sx) => {
  
  return (
    <Button
      key={key}
      onClick={handleOnClick}
      color={color}
      disabled={disabled}
      size={size}
      variant={variant}
      sx={sx}
    >
      {children}
    </Button>
  )
}

export default StdButton;