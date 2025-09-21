import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Testes unitários para a classe UserValidator usando Few-Shot prompting.
 * 
 * Demonstra a criação de testes para cenários de erro seguindo padrão BDD
 * e usando assertThrows para validação de exceções.
 */
class UserValidatorTest {

    @Test
    void givenShortPassword_whenValidating_thenThrowsIllegalArgumentException() {
        // given
        UserValidator validator = new UserValidator();
        User userWithShortPassword = new User("johndoe", "123", "user@example.com");
        
        // when & then
        assertThatThrownBy(() -> validator.validate(userWithShortPassword))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Senha deve ter pelo menos 8 caracteres.");
    }

    @Test
    void givenInvalidEmail_whenValidating_thenThrowsIllegalArgumentException() {
        // given
        UserValidator validator = new UserValidator();
        User userWithInvalidEmail = new User("johndoe", "password123", "invalid-email");
        
        // when & then
        assertThatThrownBy(() -> validator.validate(userWithInvalidEmail))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Formato de e-mail inválido.");
    }

    // Exemplos de referência que foram usados no Few-Shot prompting
    @Test
    void givenShortUsername_whenValidating_thenThrowsIllegalArgumentException() {
        // given
        UserValidator validator = new UserValidator();
        User userWithShortUsername = new User("abc", "password123", "user@example.com");
        
        // when & then
        assertThatThrownBy(() -> validator.validate(userWithShortUsername))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Nome de usuário deve ter pelo menos 5 caracteres.");
    }

    @Test
    void givenNullUsername_whenValidating_thenThrowsIllegalArgumentException() {
        // given
        UserValidator validator = new UserValidator();
        User userWithNullUsername = new User(null, "password123", "user@example.com");
        
        // when & then
        assertThatThrownBy(() -> validator.validate(userWithNullUsername))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Nome de usuário deve ter pelo menos 5 caracteres.");
    }

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