/**
 * Exceção customizada específica para erros de validação de usuário.
 * 
 * Esta exceção é lançada quando ocorrem falhas na validação de dados
 * de usuário, como nome de usuário inválido, senha fraca ou formato
 * de email incorreto.
 * 
 * @author Exercício de Prompt Engineering
 * @version 1.0
 * @since 1.0
 */
public class UserValidationException extends Exception {
    
    /**
     * Constrói uma nova exceção de validação de usuário com a mensagem especificada.
     * 
     * @param message a mensagem de erro detalhada que explica a causa da exceção
     */
    public UserValidationException(String message) {
        super(message);
    }
    
    /**
     * Constrói uma nova exceção de validação de usuário com a mensagem e causa especificadas.
     * 
     * @param message a mensagem de erro detalhada que explica a causa da exceção
     * @param cause a causa raiz da exceção (uma Throwable que causou esta exceção)
     */
    public UserValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}