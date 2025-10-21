

# 🚀 Projeto de Microsserviços: User & Email

Este projeto é um exemplo de teste de arquitetura distribuída, utilizando comunicação assíncrona para demonstrar desacoplamento e escalabilidade.

É composto por dois microsserviços independentes que se comunicam através do **RabbitMQ** (CloudAMQP).

## 💡 Objetivos

1.  Demonstrar a comunicação assíncrona utilizando um *Message Broker*.
2.  Aplicar o princípio de responsabilidade única (*Single Responsibility Principle*).
3.  Garantir o desacoplamento entre a lógica de registro de usuários e a lógica de envio de e-mails.

## ⚙️ Estrutura do Projeto e Comunicação

| Microsserviço | Responsabilidade Primária | Papel no Broker |
| :--- | :--- | :--- |
| **User Service** | Gerenciamento de Usuários (CRUD) | **Produtor** (Publisher) |
| **Email Service** | Envio de Notificações | **Consumidor** (Subscriber) |
| **RabbitMQ** | Fila de Mensagens (Broker) | Canal de Comunicação Assíncrona |
