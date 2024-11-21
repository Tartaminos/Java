# Roadmap de Estudos para Dominar Java, Spring Boot e React

## Etapa 1: Fundamentos de Java

### Tópicos para Estudo
- [x] Instalação do JDK e configuração do ambiente
- [x] Sintaxe básica do Java
- [x] Tipos de dados primitivos e operadores
- [x] Estruturas de controle (`if`, `switch`, loops)
- [x] Arrays e Strings

### Prática
- [x] Escrever programas simples que utilizem estruturas de controle
- [x] Manipular arrays e strings em pequenos projetos

---

## Etapa 2: Programação Orientada a Objetos (POO)

### Tópicos para Estudo
- [ ] Conceitos de classes e objetos
- [ ] Encapsulamento, herança e polimorfismo
- [ ] Interfaces e classes abstratas
- [ ] Modificadores de acesso
- [ ] Pacotes e organização de código

### Prática
- [ ] Criar classes que representem objetos do mundo real
- [ ] Implementar hierarquias de classes utilizando herança
- [ ] Utilizar interfaces para definir contratos

---

## Etapa 3: Java Avançado

### Tópicos para Estudo
- [ ] Exceções e tratamento de erros
- [ ] Coleções e generics
- [ ] Input/Output (I/O) e manipulação de arquivos
- [ ] Threads e programação concorrente
- [ ] Expressões Lambda e Stream API

### Prática
- [ ] Manipular arquivos e diretórios
- [ ] Criar aplicações multithreaded simples
- [ ] Utilizar Streams para processar coleções

---

## Etapa 4: Banco de Dados e JDBC

### Tópicos para Estudo
- [ ] Conceitos básicos de SQL
- [ ] Operações CRUD (Create, Read, Update, Delete)
- [ ] Conexão ao banco de dados com JDBC
- [ ] Prepared Statements

### Prática
- [ ] Configurar um banco de dados relacional (MySQL, PostgreSQL)
- [ ] Desenvolver uma aplicação Java que realiza operações CRUD no banco de dados

---

## Etapa 5: Introdução ao Spring Framework

### Tópicos para Estudo
- [ ] Inversão de Controle (IoC) e Injeção de Dependências (DI)
- [ ] Configuração de projetos Spring
- [ ] Beans e ciclo de vida dos componentes
- [ ] Anotações básicas (`@Component`, `@Autowired`, `@Configuration`)

### Prática
- [ ] Criar um projeto simples utilizando Spring Core
- [ ] Injetar dependências entre componentes

---

## Etapa 6: Spring Boot

### Tópicos para Estudo
- [ ] Conceitos e vantagens do Spring Boot
- [ ] Configuração automática e starters
- [ ] Arquivos de configuração (`application.properties` ou `application.yml`)
- [ ] Logging com Spring Boot

### Prática
- [ ] Inicializar um projeto Spring Boot
- [ ] Configurar propriedades e perfis de ambiente

---

## Etapa 7: Desenvolvimento Web com Spring Boot

### Tópicos para Estudo
- [ ] Spring MVC e arquitetura web
- [ ] Controladores (`@RestController`)
- [ ] Mapeamento de rotas (`@RequestMapping`)
- [ ] Manipulação de solicitações e respostas HTTP

### Prática
- [ ] Criar endpoints RESTful para operações CRUD
- [ ] Testar APIs com Postman ou Insomnia

---

## Etapa 8: Persistência com JPA e Hibernate

### Tópicos para Estudo
- [ ] Conceitos de ORM (Object-Relational Mapping)
- [ ] Anotações JPA (`@Entity`, `@Table`, `@Id`, etc.)
- [ ] Repositórios com Spring Data JPA
- [ ] Relacionamentos entre entidades (One-to-One, One-to-Many, Many-to-Many)

### Prática
- [ ] Mapear entidades e relacionamentos
- [ ] Implementar operações de banco de dados utilizando repositórios

---

## Etapa 9: Segurança com Spring Security

### Tópicos para Estudo
- [ ] Conceitos de autenticação e autorização
- [ ] Configuração do Spring Security
- [ ] Proteção de endpoints
- [ ] Implementação de login e logout

### Prática
- [ ] Configurar autenticação em sua aplicação
- [ ] Definir roles e permissões para usuários

---

## Etapa 10: Fundamentos de React

### Tópicos para Estudo
- [ ] Configuração do ambiente com Create React App
- [ ] JSX e componentes funcionais
- [ ] Props e estado (`state`)
- [ ] Eventos e manipulação de dados
- [ ] Ciclo de vida dos componentes

### Prática
- [ ] Desenvolver componentes reutilizáveis
- [ ] Criar uma interface básica que interaja com o usuário

---

## Etapa 11: React Avançado

### Tópicos para Estudo
- [ ] Hooks (`useState`, `useEffect`, `useContext`)
- [ ] Roteamento com React Router
- [ ] Gerenciamento de estado global (Redux ou Context API)
- [ ] Estilização com CSS Modules ou Styled Components

### Prática
- [ ] Implementar navegação entre páginas
- [ ] Gerenciar o estado de uma aplicação mais complexa

---

## Etapa 12: Integração Front-end e Back-end

### Tópicos para Estudo
- [ ] Consumo de APIs REST com Fetch API ou Axios
- [ ] Tratamento de respostas assíncronas
- [ ] Gerenciamento de erros e estados de carregamento
- [ ] Cross-Origin Resource Sharing (CORS)

### Prática
- [ ] Consumir os endpoints criados no Spring Boot a partir do React
- [ ] Implementar funcionalidades completas (front-end e back-end) de cadastro e listagem

---

## Projeto Monolítico para Praticar

### Sistema de Gestão de Tarefas (ToDo List Avançada)

**Descrição do Projeto:**

Desenvolva uma aplicação completa que permita aos usuários gerenciar tarefas pessoais, com as seguintes funcionalidades:

#### Back-end
- [ ] Autenticação de usuários (cadastro, login, recuperação de senha)
- [ ] Gestão de tarefas (CRUD, marcar como concluídas, categorizar)
- [ ] Envio de notificações por e-mail para lembretes

#### Front-end
- [ ] Interface amigável com formulários de login e cadastro
- [ ] Dashboard com a lista de tarefas
- [ ] Interatividade e atualização em tempo real
- [ ] Responsividade para dispositivos móveis

**Tecnologias a Utilizar:**

- **Back-end:**
  - Java com Spring Boot
  - Spring Security
  - Spring Data JPA com Hibernate
  - JavaMailSender

- **Front-end:**
  - React com Hooks
  - React Router
  - Axios
  - Material-UI (opcional)

---

## Temas Adicionais para Praticar

### Testes Automatizados
- [ ] **Back-end:** JUnit e Mockito para testes unitários e de integração
- [ ] **Front-end:** Jest e React Testing Library para testes de componentes

### Documentação
- [ ] Swagger/OpenAPI para documentar os endpoints da API

### Boas Práticas de Desenvolvimento
- [ ] Controle de versão efetivo com Git
- [ ] Aplicar princípios de código limpo e padrões de projeto

### Deploy e CI/CD
- [ ] Containerização com Docker
- [ ] Configuração de pipelines CI/CD com GitHub Actions ou GitLab CI

---

Você pode marcar as caixas à medida que avança em cada tópico ou prática. Basta substituir `[ ]` por `[x]` para indicar a conclusão.
