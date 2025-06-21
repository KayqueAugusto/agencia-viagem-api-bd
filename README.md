# 🌍 Agência de Viagem - API REST

Este é um projeto de uma API RESTful simples para gerenciar uma agência de viagens. O sistema permite o gerenciamento de destinos, pacotes de viagem e reservas, utilizando uma arquitetura em camadas (Controller, Service e Model).

## 🧱 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Maven**
- **Lombok**
- **Postman (para testes de API - opcional)**

## 📁 Estrutura do Projeto

agencia-viagem-api/
├── controller/ # Controladores (camada de entrada da API)
├── service/ # Regras de negócio
├── model/ # Modelos de dados
├── repository/ # Repositórios (simulados em memória)
├── dto/ # Objetos de transferência de dados (opcional)
├── Application.java # Classe principal


📌Endpoints
🧭 Destinos
- GET /destinos - Listar todos os destinos

- POST /destinos - Cadastrar um novo destino

- GET /destinos/{id} - Buscar destino por ID

- PUT /destinos/{id} - Atualizar um destino

- DELETE /destinos/{id} - Deletar um destino


✈️ Pacotes
- GET /pacotes - Listar todos os pacotes

- POST /pacotes - Cadastrar um novo pacote

- GET /pacotes/{id} - Buscar pacote por ID

- PUT /pacotes/{id} - Atualizar um pacote

- DELETE /pacotes/{id} - Deletar um pacote


📑 Reservas
- GET /reservas - Listar todas as reservas

- POST /reservas - Criar uma nova reserva

- GET /reservas/{id} - Buscar reserva por ID

- DELETE /reservas/{id} - Cancelar uma reserva

Contribuição
Sinta-se à vontade para abrir Issues ou Pull Requests. Toda contribuição é bem-vinda!

