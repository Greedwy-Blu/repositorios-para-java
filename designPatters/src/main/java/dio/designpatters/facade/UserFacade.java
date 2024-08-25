package dio.designpatters.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserFacade {
    private static final Logger logger = LoggerFactory.getLogger(UserFacade.class);

    private final UserService userService;
    private final AuthenticationStrategy authenticationStrategy;

    @Autowired
    public UserFacade(UserService userService, AuthenticationStrategy authenticationStrategy) {
        this.userService = userService;
        this.authenticationStrategy = authenticationStrategy;
    }

    public boolean registerUser(User user) {
        try {
            if (authenticationStrategy.authenticate(user)) {
                userService.registerUser(user);
                logger.info("User registration successful for user: {}", user.getUsername());
                return true;
            } else {
                logger.warn("User authentication failed for user: {}", user.getUsername());
                return false;
            }
        } catch (Exception e) {
            logger.error("Error occurred during user registration", e);
            return false;
        }
    }
}
