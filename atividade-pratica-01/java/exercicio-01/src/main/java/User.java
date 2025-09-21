/**
 * Classe de dados simples (POJO) que representa um usuário no sistema.
 * 
 * @author Exercício de Prompt Engineering
 * @version 1.0
 */
public class User {
    /**
     * Nome de usuário do usuário.
     */
    private String username;
    
    /**
     * Senha do usuário.
     */
    private String password;
    
    /**
     * Endereço de email do usuário.
     */
    private String email;
    
    /**
     * Construtor padrão.
     */
    public User() {
    }
    
    /**
     * Construtor com todos os parâmetros.
     * 
     * @param username o nome de usuário
     * @param password a senha
     * @param email o endereço de email
     */
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    /**
     * Obtém o nome de usuário.
     * 
     * @return o nome de usuário
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Define o nome de usuário.
     * 
     * @param username o nome de usuário a ser definido
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * Obtém a senha.
     * 
     * @return a senha
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Define a senha.
     * 
     * @param password a senha a ser definida
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Obtém o endereço de email.
     * 
     * @return o endereço de email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Define o endereço de email.
     * 
     * @param email o endereço de email a ser definido
     */
    public void setEmail(String email) {
        this.email = email;
    }
}