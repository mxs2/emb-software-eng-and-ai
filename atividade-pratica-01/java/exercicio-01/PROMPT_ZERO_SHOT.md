# Exercício 01 - Zero-Shot Prompting

## Prompt Utilizado

**Técnica:** Zero-Shot Prompting

**Prompt:**
```
Você é um engenheiro de software Java especialista em código limpo e bem documentado. 
Seu objetivo é criar uma exceção customizada chamada UserValidationException que herda 
de Exception. A classe deve:

1. Herdar de Exception
2. Possuir um construtor que aceita uma mensagem de erro (String message)
3. Possuir um construtor que aceita uma mensagem e uma causa (String message, Throwable cause)
4. Seguir as boas práticas de nomenclatura Java
5. Incluir documentação Javadoc completa e profissional
6. Ser uma classe específica para validações de usuário

A documentação deve incluir:
- Descrição clara da classe e seu propósito
- Tags @author e @version
- Documentação completa dos construtores com @param
- Exemplo de uso se necessário

Gere apenas o código da exceção customizada, seguindo todas as convenções Java.
```

## Resultado Obtido

A implementação seguinte foi gerada seguindo o prompt acima:

```java
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
```

## Análise Crítica do Resultado

### Pontos Fortes
1. **Estrutura Correta:** A classe herda adequadamente de `Exception`
2. **Construtores Completos:** Implementa os dois construtores solicitados
3. **Documentação Javadoc:** Documentação completa e profissional
4. **Nomenclatura:** Segue convenções Java adequadas
5. **Propósito Específico:** Focada em validações de usuário

### Técnica Zero-Shot
- **Eficácia:** Alta - o prompt foi suficientemente específico
- **Clareza:** Instruções diretas resultaram em código limpo
- **Completude:** Todos os requisitos foram atendidos

### Observações
- O Zero-Shot funcionou muito bem para esta tarefa bem definida
- A especificação detalhada no prompt garantiu qualidade
- Ideal para tarefas com requisitos claros e objetivos

### Resultado dos Testes
✅ 3 testes executados, 0 falhas
- Construtores funcionando corretamente
- Mensagens de erro preservadas
- Integração com UserValidator validada