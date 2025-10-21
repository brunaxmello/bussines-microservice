## Projeto de Microsserviços — User & Email

Este projeto é composto por dois microsserviços independentes, que se comunicam de forma assíncrona por meio do RabbitMQ (CloudAMQP).
O objetivo é demonstrar uma arquitetura distribuída, escalável e desacoplada, aplicando boas práticas de microsserviços.

## Estrutura do Projeto
User Service
##Responsável por:
Registrar novos usuários, com todas as validações necessárias.

Atuar como produtor, enviando uma mensagem para a fila no RabbitMQ assim que um novo cadastro é concluído com sucesso.
Email Service
##Responsável por:
Consumir as mensagens da fila.
Capturar o e-mail do usuário recém-registrado.
Enviar uma mensagem de confirmação de cadastro.
