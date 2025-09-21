import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Testes básicos para demonstrar o funcionamento da UserValidationException.
 */
class UserValidationExceptionTest {

    @Test
    void givenMessageOnly_whenCreatingException_thenMessageIsSet() {
        // given
        String expectedMessage = "Erro de validação de usuário";
        
        // when
        UserValidationException exception = new UserValidationException(expectedMessage);
        
        // then
        assertThat(exception.getMessage()).isEqualTo(expectedMessage);
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void givenMessageAndCause_whenCreatingException_thenBothAreSet() {
        // given
        String expectedMessage = "Erro de validação de usuário";
        RuntimeException expectedCause = new RuntimeException("Causa raiz");
        
        // when
        UserValidationException exception = new UserValidationException(expectedMessage, expectedCause);
        
        // then
        assertThat(exception.getMessage()).isEqualTo(expectedMessage);
        assertThat(exception.getCause()).isEqualTo(expectedCause);
    }

    @Test
    void givenUserValidator_whenValidatingInvalidUser_thenThrowsUserValidationException() {
        // given
        UserValidator validator = new UserValidator();
        User invalidUser = new User("ab", "123", "invalid-email");
        
        // when & then
        assertThatThrownBy(() -> validator.validate(invalidUser))
            .isInstanceOf(UserValidationException.class)
            .hasMessage("Nome de usuário deve ter pelo menos 5 caracteres.");
    }
}