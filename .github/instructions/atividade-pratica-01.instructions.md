---
applyTo: 'java/**'
---

**Exercício Prático de Engenharia de Prompt com Java**

Para solidificar nosso conhecimento, vamos a realizar uma rodada prática de
Engenharia de Prompt, aplicando os conceitos a um cenário comum no
desenvolvimento com a linguagem **Java**.

O objetivo é aprender a construir instruções precisas para guiar uma IA
generativa, transformando-a em uma poderosa ferramenta de
desenvolvimento.

**O Problema Central**
Nosso objeto de estudo é uma classe de validação de usuários em um sistema
Java. É uma classe simples, mas que nos oferece ótimas oportunidades para
explorar a documentação, os testes e a análise crítica.

**Código-fonte base (Java):**
Java
// Classe de dados simples (POJO)
class User {
String username;
String password;
String email;
// Construtores, getters e setters omitidos para brevidade.
}

// Classe de serviço para validação
public class UserValidator {
/**
* Valida um objeto de usuário.
* Retorna true se o usuário for válido, senão lança uma exceção.
*/


public boolean validate(User user) throws IllegalArgumentException {
if (user.username == null || user.username.length() < 5) {
throw new IllegalArgumentException("Nome de usuário deve ter pelo
menos 5 caracteres.");
}
if (user.password == null || user.password.length() < 8) {
throw new IllegalArgumentException("Senha deve ter pelo menos 8
caracteres.");
}
if (user.email == null || !user.email.contains("@")) {
throw new IllegalArgumentException("Formato de e-mail inválido.");
}
return true;
}
}

**Exercício 1: Documentação Profissional com Zero-Shot Prompting**
O **Zero-Shot Prompting** é a técnica de dar ao modelo apenas a descrição da
tarefa, sem exemplos.
**Tarefa:** Gerar a documentação no padrão Javadoc para o método validate.
**Exemplo de prompt Zero-Shot melhorado:**
"Você é um engenheiro de software Java especialista em código limpo e bem
documentado. Seu objetivo é gerar a documentação completa para o método
validate no formato Javadoc padrão. A documentação deve incluir:

1. Uma descrição clara do que o método faz.
2. A tag @param para o parâmetro user, explicando o que ele representa.
3. A tag @return descrevendo o que o retorno true significa.
4. A tag @throws para a exceção IllegalArgumentException, explicando em
    que condições ela é lançada."


**Sua Vez:** Crie um prompt **Zero-Shot** para gerar o código-fonte de uma
**exceção customizada** chamada UserValidationException. O prompt deve
instruir a IA a criar uma classe que herda de Exception e que possua um
construtor que aceita uma mensagem de erro.

**Exercício 2: Criando Testes Padronizados com One-Shot e Few-Shot
Prompting**
O **Few-Shot Prompting** , ao fornecer alguns exemplos, ensina o modelo a
replicar padrões técnicos ou formais.
**Tarefa:** Gerar um teste unitário para o método validate usando JUnit 5 e a
biblioteca AssertJ, seguindo um padrão de nomenclatura BDD (Behavior-Driven
Development).
**Exemplo de prompt One-Shot:**
Gere um método de teste JUnit 5 para o método validate da classe
UserValidator. Siga exatamente o estilo de nomenclatura e as asserções do
exemplo fornecido.
**Exemplo de Padrão:**
Java
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
**Sua Vez (para o método validate):** Crie um teste para o cenário de sucesso
(usuário válido).
**Sua Vez:** Usando a técnica de **Few-Shot** (com 2 exemplos), crie um prompt
para gerar **dois novos testes unitários** para o método validate. O primeiro
teste deve validar o caso de uma senha muito curta, e o segundo, o caso de


um e-mail inválido. Garanta que os exemplos no prompt reforcem o padrão de
nomenclatura BDD e o uso de assertThrows.
