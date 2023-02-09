package app.gamelauncherapplication.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameLauncherController {

    @GetMapping("/")
    public String mapString() {
        return "Game Launcher Application";
    }
}
