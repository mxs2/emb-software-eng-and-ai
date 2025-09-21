# Exercício 02 - One-Shot Prompting

## Prompt Utilizado

**Técnica:** One-Shot Prompting

**Prompt:**
```
Gere um método de teste JUnit 5 para o método validate da classe UserValidator. 
Siga exatamente o estilo de nomenclatura e as asserções do exemplo fornecido.

**Exemplo de Padrão:**
```java
// Teste para um método simples
@Test
void givenPositiveNumber_whenCheckingIfIsPositive_thenReturnsTrue() {
    // given
    int number = 10;
    // when
    boolean result = NumberUtils.isPositive(number);
    // then
    assertThat(result).isTrue();
}
```

**Sua tarefa:** Crie um teste para o cenário de sucesso (usuário válido) do método validate.

Requisitos:
- Use JUnit 5 e AssertJ
- Siga o padrão BDD (given-when-then) nos comentários
- Use nomenclatura descritiva seguindo o padrão do exemplo
- Teste o cenário onde todos os dados do usuário são válidos
- Use assertThat() do AssertJ para as verificações
```

## Resultado Obtido

A implementação seguinte foi gerada seguindo o prompt acima:

```java
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
```

## Análise Crítica do Resultado

### Pontos Fortes
1. **Consistência com o Padrão:** Seguiu exatamente a nomenclatura do exemplo
2. **Estrutura BDD:** Manteve os comentários given-when-then
3. **Dados Realistas:** Usou dados de teste apropriados
4. **AssertJ:** Utilizou corretamente `assertThat()`
5. **Clareza:** Teste autoexplicativo e conciso

### Técnica One-Shot
- **Eficácia:** Muito alta - o exemplo único foi suficiente
- **Transferência de Padrão:** Excelente adaptação do padrão mostrado
- **Consistência:** Manteve todas as convenções do exemplo

### Qualidade do Código
- Nomenclatura seguindo padrão BDD
- Dados de teste válidos e realistas
- Estrutura clara e legível
- Uso correto das bibliotecas

### Observações
- O One-Shot foi perfeito para transferir um padrão específico
- Um exemplo bem escolhido foi suficiente para gerar código consistente
- Ideal quando há uma convenção específica a ser seguida

### Resultado dos Testes
✅ 1 teste executado, 0 falhas
- Validação de usuário válido funcionando corretamente
- Padrão BDD aplicado adequadamente
- AssertJ utilizado corretamente