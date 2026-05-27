# Diario Treino

Aplicacao web para gerenciamento de fichas de treino, alunos e exercicios, desenvolvida em Java com Spring Boot, Thymeleaf, Spring Security, JPA e MySQL.

## Funcionalidades

- Login com Spring Security
- Perfis de usuario `ADMIN` e `USER`
- Cadastro e gerenciamento de alunos
- Cadastro e gerenciamento de fichas de treino
- Cadastro de exercicios por ficha
- Primeiro acesso com troca obrigatoria de senha
- Perfil do usuario com dados de contato e foto

## Tecnologias

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

## Requisitos

- Java 17 instalado
- MySQL instalado ou uma instancia MySQL em nuvem
- Maven, ou o wrapper `mvnw` incluido no projeto

## Configuracao

O projeto le as configuracoes por variaveis de ambiente, com valores locais padrao para desenvolvimento.

| Variavel | Descricao | Padrao |
| --- | --- | --- |
| `PORT` | Porta da aplicacao | `8080` |
| `MYSQLHOST` | Host do MySQL | `localhost` |
| `MYSQLPORT` | Porta do MySQL | `3306` |
| `MYSQL_DATABASE` | Nome do banco | `diario_treino` |
| `MYSQLUSER` | Usuario do banco | `root` |
| `MYSQLPASSWORD` | Senha do banco | vazio |

## Acesso inicial

Para facilitar a avaliacao academica, o sistema cria automaticamente um administrador inicial caso ele ainda nao exista no banco:

```text
E-mail: admin@diario.com
Senha: 123456
```

Esse comportamento faz parte dos requisitos do projeto da disciplina.

## Como executar localmente

1. Crie um banco MySQL chamado `diario_treino`.
2. Configure as variaveis de ambiente se o seu MySQL nao usa os valores padrao.
3. Execute:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
.\mvnw.cmd spring-boot:run
```

Depois acesse:

```text
http://localhost:8080
```

## Build

```bash
./mvnw clean package
```

No Windows:

```bash
.\mvnw.cmd clean package
```

## Docker

```bash
docker build -t diario-treino .
docker run -p 8080:8080 --env-file .env diario-treino
```

## Observacoes para publicacao

- Nao publique arquivos `.env`, tokens ou dados reais de alunos.
- A pasta `target/` e arquivos temporarios do Word devem ficar fora do repositorio.
- Fora do contexto academico, altere a credencial inicial e use um banco MySQL protegido.
