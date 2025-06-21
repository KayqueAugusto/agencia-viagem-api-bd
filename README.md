# 🌍 Agência de Viagem - API REST

Este é um projeto de uma API RESTful simples para gerenciar uma agência de viagens.  
O sistema permite o gerenciamento de destinos, pacotes de viagem e reservas, utilizando uma arquitetura em camadas (Controller, Service e Model).  
Inclui também autenticação de usuários via Spring Security com roles específicas para acesso controlado.

---

## 🧱 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Postman (para testes de API - opcional)

---

## 🔐 Segurança e Autenticação

Durante o desenvolvimento foi implementado o seguinte:

- Autenticação com **Basic Auth** usando Spring Security.
- Criação automática de um **usuário padrão** com login `admin` e senha `123456` criptografada via BCrypt.
- Controle de acesso com perfis:
  - `ROLE_ADMIN`: pode acessar endpoints restritos como `/admin/teste`.
  - `ROLE_USER`: pode ser usado em futuras ampliações.
- Classe `UserDetailsImpl` e `UserDetailsServiceImpl` configuradas para conectar o banco de dados à autenticação.
- Senha criptografada visível no banco em formato `$2a$10$...`
- Endpoint de teste protegido: `GET /admin/teste` que retorna **"Acesso autorizado para ADMIN!"** quando o login está correto.

---

## 📁 Estrutura do Projeto

```text
agencia-viagem-api/
├── controller/      # Controladores (entrada das requisições)
├── service/         # Regras de negócio
├── model/           # Entidades JPA (Destino, Pacote, Reserva, Usuario)
├── repository/      # Repositórios de acesso ao banco de dados
├── security/        # Configurações de autenticação e autorização
├── dto/             # Objetos de transferência de dados (opcional)
└── Application.java # Classe principal

```
---

📌Endpoints
🧭 Destinos
- GET /destinos - Listar todos os destinos

- POST /destinos - Cadastrar um novo destino

- GET /destinos/{id} - Buscar destino por ID

- PUT /destinos/{id} - Atualizar um destino

- DELETE /destinos/{id} - Deletar um destino

---

✈️ Pacotes
- GET /pacotes - Listar todos os pacotes

- POST /pacotes - Cadastrar um novo pacote

- GET /pacotes/{id} - Buscar pacote por ID

- PUT /pacotes/{id} - Atualizar um pacote

- DELETE /pacotes/{id} - Deletar um pacote

---

📑 Reservas
- GET /reservas - Listar todas as reservas

- POST /reservas - Criar uma nova reserva

- GET /reservas/{id} - Buscar reserva por ID

- DELETE /reservas/{id} - Cancelar uma reserva

---

## 🧪 Testes no Postman

- Tipo de autenticação: **Basic Auth**
- Login: `admin`
- Senha: `123456`
- Ou manualmente via header:
  - Key: `Authorization`
  - Value: `Basic YWRtaW46MTIzNDU2` (Base64 de `admin:123456`)

---

## 🗃️ Banco de Dados

- Banco: **PostgreSQL**
- Tabela `usuario` criada automaticamente com colunas:
  - `id`, `login`, `senha` (criptografada), `role`
- Os dados do usuário `admin` são inseridos ao rodar a aplicação se ainda não existirem.

---

## ✅ O que foi desenvolvido no desafio

- CRUD completo para Destinos, Pacotes e Reservas.
- Implementação da camada de segurança com autenticação real.
- Criação da tabela `usuario` com roles definidas.
- Teste da autenticação com navegador e Postman.
- Controle de acesso com validação de usuário e senha.
- Deploy funcional com banco de dados real PostgreSQL.
- Projeto publicado no GitHub com os arquivos organizados e prontos para execução.

---

## 🤝 Contribuição

Sinta-se à vontade para abrir **Issues** ou **Pull Requests**.  
Toda contribuição é bem-vinda!
