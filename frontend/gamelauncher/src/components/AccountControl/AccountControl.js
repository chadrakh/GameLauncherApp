import React from "react";
import Badge from "@mui/material/Badge";
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import IconButton from "@mui/material/IconButton";
import Tooltip from "@mui/material/Tooltip";

const AccountControl = ({ iconColor, onClick, anchorEl }) => {
  return (
    <Tooltip title="Manage Account">
        <IconButton
            color={iconColor}
            onClick={onClick}
            anchorEl={anchorEl}
        >
            <Badge color="secondary">
                <AccountCircleIcon />
            </Badge>
        </IconButton>
    </Tooltip>
  );
};

export default AccountControl;
