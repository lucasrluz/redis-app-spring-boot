# Redis Spring Boot

![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

Este simples projeto serve para demonstrar com implementar **cache** utilizando **Redis**.

A API foi desenvolvida para por em meu portifólio e mostrar os meus conhecimentos.

## Seções

- [Instalação](#instalação)
- [Rodar Aplicação](#rodar-aplicação)
- [API Endpoints](#api-endpoints)
- [Banco de Dados](#banco-de-dados)

## Instalação

1. Baixe o repositório:

```bash
git clone https://github.com/lucasrluz/redis-app-spring-boot.git
```

2. Instale as dependências do Maven

3. Instale o [PostgresSQL](https://www.postgresql.org/)

## Rodar Aplicação

1. Inicie a aplicação com o Maven
2. Acesse a rota: http://localhost:8080


## API Endpoints
Existe duas rotas: 
* POST `/product/{userid}` O nome do produto pode ser enviado em texto simples.
* GET `/product/{userid}`

## Banco de Dados
Para conexão do Banco de Dados substitua aos valores do [application.yml](https://github.com/lucasrluz/redis-app-spring-boot/blob/main/src/main/resources/application.yml) pelos dados de conexão do seu DB.
