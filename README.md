# Bookstore — Spring Boot + Angular

Aplicação fullstack de gerenciamento de livraria, com backend em **Java + Spring Boot** e frontend em **Angular**.

## 🚀 Tecnologias

### Backend
- Java 17
- Spring Boot 3.1.2
- Spring Data JPA
- Spring Web
- Spring Validation
- Lombok
- MySQL
- H2 (banco em memória para testes)
- Maven

### Frontend
- Angular 16
- TypeScript
- HTML/CSS

## 📋 Funcionalidades

- Cadastro, listagem, edição e exclusão de livros (CRUD completo)
- API REST consumida pelo frontend Angular
- Validação de dados no backend

## ⚙️ Como rodar o projeto

### Pré-requisitos

- Java 17+
- Node.js e Angular CLI instalados
- MySQL rodando localmente

### Backend

#### 1. Clone o repositório

```bash
git clone https://github.com/bribsz/bookstore-spring-angular.git
cd bookstore-spring-angular
```

#### 2. Configure o banco de dados

Crie um banco MySQL chamado `bookstore` e configure o `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

#### 3. Rode o backend

```bash
./mvnw spring-boot:run
```

O backend estará disponível em: `http://localhost:8080`

### Frontend

```bash
cd bookstore-frontend
npm install
ng serve
```

O frontend estará disponível em: `http://localhost:4200`

## 📡 Endpoints da API

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | `/books` | Lista todos os livros |
| GET | `/books/{id}` | Busca livro por ID |
| POST | `/books` | Cadastra novo livro |
| PUT | `/books/{id}` | Atualiza livro |
| DELETE | `/books/{id}` | Remove livro |
