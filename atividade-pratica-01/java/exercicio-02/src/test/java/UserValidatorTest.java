import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Testes unitários para a classe UserValidator usando One-Shot prompting.
 * 
 * Demonstra a criação de teste para cenário de sucesso seguindo padrão BDD.
 */
class UserValidatorTest {

    @Test
    void givenValidUser_whenValidating_thenReturnsTrue() {
        // given
        UserValidator validator = new UserValidator();
        User validUser = new User("johndoe", "password123", "john@example.com");
        
        // when
        boolean result = validator.validate(validUser);
        
        // then
        assertThat(result).isTrue();
    }
}