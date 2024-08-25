package dio.designpatters.strategy;

public interface AuthenticationStrategy {
    boolean authenticate(User user);
}

