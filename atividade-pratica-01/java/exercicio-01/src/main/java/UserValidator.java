/**
 * Classe de serviço responsável pela validação de objetos User.
 * 
 * Esta classe contém a lógica de negócio para validar dados de usuário,
 * verificando se atendem aos critérios mínimos de segurança e formato.
 * 
 * @author Exercício de Prompt Engineering
 * @version 1.0
 */
public class UserValidator {
    
    /**
     * Valida um objeto de usuário verificando nome de usuário, senha e email.
     * 
     * Realiza as seguintes validações:
     * - Nome de usuário não pode ser nulo e deve ter pelo menos 5 caracteres
     * - Senha não pode ser nula e deve ter pelo menos 8 caracteres
     * - Email não pode ser nulo e deve conter o caractere '@'
     * 
     * @param user o objeto User a ser validado
     * @return true se o usuário for válido e atender a todos os critérios
     * @throws UserValidationException se alguma validação falhar, contendo 
     *         uma mensagem específica sobre o erro encontrado
     */
    public boolean validate(User user) throws UserValidationException {
        if (user.getUsername() == null || user.getUsername().length() < 5) {
            throw new UserValidationException("Nome de usuário deve ter pelo menos 5 caracteres.");
        }
        if (user.getPassword() == null || user.getPassword().length() < 8) {
            throw new UserValidationException("Senha deve ter pelo menos 8 caracteres.");
        }
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new UserValidationException("Formato de e-mail inválido.");
        }
        return true;
    }
}