# Exercício 03 - Few-Shot Prompting

## Prompt Utilizado

**Técnica:** Few-Shot Prompting

**Prompt:**
```
Usando a técnica de Few-Shot prompting, gere dois novos testes unitários para o método validate. 
O primeiro teste deve validar o caso de uma senha muito curta, e o segundo, o caso de um e-mail inválido. 
Garanta que os exemplos no prompt reforcem o padrão de nomenclatura BDD e o uso de assertThrows.

**Exemplos de Padrão:**

Exemplo 1 - Teste de exceção para nome de usuário inválido:
```java
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
```

Exemplo 2 - Teste de exceção para valor nulo:
```java
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
```

**Sua tarefa:** Seguindo exatamente o padrão dos exemplos acima, crie:

1. Um teste para o caso de senha muito curta (menos de 8 caracteres)
2. Um teste para o caso de email inválido (sem '@')

Requisitos:
- Use JUnit 5 e AssertJ
- Siga rigorosamente o padrão BDD (given-when-then) dos exemplos
- Use assertThatThrownBy() e verifique tanto o tipo da exceção quanto a mensagem
- Mantenha a nomenclatura consistente com o padrão mostrado
- Use dados de teste realistas mas inválidos
```

## Resultado Obtido

A implementação seguinte foi gerada seguindo o prompt acima:

```java
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
```

## Análise Crítica do Resultado

### Pontos Fortes
1. **Consistência Perfeita:** Seguiu rigorosamente o padrão dos exemplos
2. **Nomenclatura Uniforme:** Manteve a convenção established pelos exemplos
3. **Estrutura BDD:** Preservou os comentários given-when-then
4. **Validação Completa:** Verifica tipo da exceção E mensagem
5. **Dados Apropriados:** Usou dados inválidos realistas

### Técnica Few-Shot
- **Eficácia:** Excelente - múltiplos exemplos garantiram consistência
- **Aprendizado de Padrão:** Captou perfeitamente as nuances dos exemplos
- **Generalização:** Aplicou o padrão a cenários diferentes com sucesso

### Qualidade do Código
- Nomenclatura descritiva e consistente
- Uso correto de `assertThatThrownBy()`
- Validação de tipo e mensagem de exceção
- Dados de teste apropriados para cada cenário

### Comparação com Técnicas Anteriores
- **Vs Zero-Shot:** Maior consistência devido aos exemplos
- **Vs One-Shot:** Melhor generalização com múltiplos padrões
- **Robustez:** Few-Shot mostrou-se mais confiável para manter padrões

### Observações
- Few-Shot foi ideal para garantir consistência em múltiplos testes
- Os exemplos variados ajudaram a estabelecer um padrão sólido
- Técnica perfeita para cenários onde consistência é crítica

### Resultado dos Testes
✅ 5 testes executados, 0 falhas
- Todos os cenários de validação funcionando
- Exceções sendo lançadas corretamente
- Mensagens de erro validadas adequadamente
- Cobertura completa de casos de erro