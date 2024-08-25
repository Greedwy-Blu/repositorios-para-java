package dio.designpatters.strategy;

import org.springframework.stereotype.Component;

@Component
public class OAuthAuthenticationStrategy implements AuthenticationStrategy {
    @Override
    public boolean authenticate(User user) {
        // Implementação da autenticação OAuth
        return true; // Simulação de sucesso
    }
}

