package dio.designpatters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        boolean success = userFacade.registerUser(user);
        return success ? "User registered successfully!" : "Registration failed.";
    }
}
