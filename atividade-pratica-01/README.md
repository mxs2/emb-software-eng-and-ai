# Exercício Prático 1 - Engenharia de prompt

Este projeto contém implementações práticas dos exercícios de engenharia de prompt aplicados ao desenvolvimento Java, demonstrando as técnicas de **Zero-Shot**, **One-Shot** e **Few-Shot** prompting.

## Estrutura do Projeto

```
java/
├── exercicio-01/          # Zero-Shot Prompting
├── exercicio-02/          # One-Shot Prompting  
└── exercicio-03/          # Few-Shot Prompting
```

## Tecnologias Utilizadas

- **Java 21+** (compatível com versões superiores)
- **Maven 3.6+** para gerenciamento de dependências
- **JUnit 5** para testes unitários
- **AssertJ** para asserções fluentes e expressivas

## Exercícios Implementados

### Exercício 01 - Zero-Shot Prompting
**Objetivo:** Criar uma exceção customizada `UserValidationException`

**Técnica:** Zero-Shot - instrução direta sem exemplos
- Criação de exceção que herda de `Exception`
- Construtores com mensagem e causa
- Documentação Javadoc completa
- Testes de validação

**Localização:** `java/exercicio-01/`

### Exercício 02 - One-Shot Prompting  
**Objetivo:** Gerar teste unitário para cenário de sucesso

**Técnica:** One-Shot - um exemplo como referência
- Teste para validação de usuário válido
- Padrão BDD (given-when-then)
- Nomenclatura descritiva
- AssertJ para asserções

**Localização:** `java/exercicio-02/`

### Exercício 03 - Few-Shot Prompting
**Objetivo:** Criar testes para cenários de erro

**Técnica:** Few-Shot - múltiplos exemplos como padrão
- Testes para senha curta e email inválido  
- Uso de `assertThrows` para validação de exceções
- Consistência com padrões estabelecidos
- Cobertura abrangente de casos de erro

**Localização:** `java/exercicio-03/`

## Como Executar

### Pré-requisitos
- Java 21 ou superior
- Maven 3.6 ou superior

### Executar Testes de um Exercício Específico

```bash
# Exercício 01
cd java/exercicio-01
mvn clean test

# Exercício 02  
cd java/exercicio-02
mvn clean test

# Exercício 03
cd java/exercicio-03
mvn clean test
```

### Executar Todos os Testes

```bash
# A partir da raiz do projeto
cd java
for dir in exercicio-*/; do
    echo "=== Executando testes em $dir ==="
    cd "$dir"
    mvn clean test
    cd ..
done
```

## Resultados dos Testes

Todos os exercícios foram testados e estão funcionando corretamente:

- **Exercício 01:** 3 testes executados, 0 falhas
- **Exercício 02:** 1 teste executado, 0 falhas  
- **Exercício 03:** 5 testes executados, 0 falhas

## Estrutura de Cada Exercício

Cada exercício segue a estrutura Maven padrão:

```
exercicio-XX/
├── pom.xml                    # Configuração Maven
├── PROMPT_TECHNIQUE.md        # Documentação do prompt usado
└── src/
    ├── main/java/
    │   ├── User.java          # Classe modelo
    │   ├── UserValidator.java # Classe de validação
    │   └── [outras classes]   # Classes específicas do exercício
    └── test/java/
        └── [ClasseTest.java]  # Testes unitários
```

## Conceitos Demonstrados

### 1. Zero-Shot Prompting
- Instruções diretas e claras
- Especificação completa de requisitos
- Documentação de padrões esperados

### 2. One-Shot Prompting  
- Uso de um exemplo como referência
- Transferência de padrões através de exemplos
- Consistência na aplicação de convenções

### 3. Few-Shot Prompting
- Múltiplos exemplos para reforçar padrões
- Aprendizado por analogia e repetição
- Garantia de consistência através de exemplos variados

## Análise dos Resultados

Os exercícios demonstram como diferentes técnicas de prompting podem ser aplicadas efetivamente no desenvolvimento Java:

- **Zero-Shot** é eficaz para tarefas bem definidas com especificações claras
- **One-Shot** funciona bem quando há um padrão específico a ser seguido
- **Few-Shot** é ideal para garantir consistência em tarefas complexas ou variadas

## Próximos Passos

Para expandir este projeto, considere:

1. Implementar técnicas avançadas como Chain-of-Thought prompting
2. Adicionar exemplos com frameworks Spring Boot
3. Explorar prompting para geração de documentação técnica
4. Implementar prompting para refatoração de código

## Contribuições

Este projeto foi desenvolvido como exercício educacional em engenharia de prompt aplicada ao desenvolvimento Java.