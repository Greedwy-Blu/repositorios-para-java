package dio.designpatters.strategy;

import org.springframework.stereotype.Component;

@Component
public class PasswordAuthenticationStrategy implements AuthenticationStrategy {
    @Override
    public boolean authenticate(User user) {

        return user.getPassword().equals("password");
    }
}

