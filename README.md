### Sobre o projeto ###
Projeto Login

### Tecnologias Utilizadas ###
Java versão 8;

JPA / Hibernate;

Banco de dados Oracle;

Maven;

Spring;

Spring-boot;

Spring Data JPA;

Jackson;

Ojdbc6;

Projeto Lombok;

Jetty;

HikariCP

Jetty

JWT - Para geração de token

### Camadas e pacotes ###
br.com.login: Pacote com as configurações necessárias para o start da aplicação. App.java

br.com.login.application: Pacote com a regras de negócio.

br.com.login.dao: Pacote com as Entity necessárias para acesso ao banco de dados.

br.com.login.repository: Pacote formado pelos contratos de persistência.

br.com.login.rest: Pacote com os componentes Controller e serviços REST.

br.com.login.security: Pacote com os componentes de segurança para criação e validação de token.

br.com.login.service: Pacote formado por componentes de negócio, que orquestram os componentes de acesso a dados, transação com banco de dados e eventuais validações.


### Pré-requisitos ###

* JDK - versão 1.8 do Java;
* Qualquer IDE Java com suporte ao Maven;
* Maven - para build e dependências.

### Resumo do projeto ###
Projeto rest com o intuito de logar um usuário na aplicação e caso o usuário tenha acesso irá devolver um token e o perfil de acesso do usuário na aplicação.
