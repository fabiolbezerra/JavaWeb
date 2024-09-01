# Desenvolvimento Web com Servlets e JSP

Aplicação web com vários exemplos de código Java para Web com Servlets e JSP.

Projeto baseado no servidor de aplicação *Tomcat 9.0.93*.

## Primeiros exemplos

* Exemplo simples
* Hello World Servlet
* ServletOlaMundo
* Olá Mundo Servlet

## Exemplos de HttpServletRequest

### Exercícios de HttpServletRequest

## Exemplos de HttpSession

* Último acesso 
* Número de visitas

### Exercícios de HttpSession

## Banco de dados

Para esse exemplo, considerar:
* Instalar o MySQL 8
  * Usuário 'root' com senha 'root' 
  * Caso já tenha instalado MySQL 5, usar driver 'com.mysql.jdbc.Driver'
* Criar banco de dados 'javaweb'
* Criar tabela 'estado'

### Caso deseje utilizar Docker

> docker network create mysql8.0-net
> docker run -d --name mysql8.0 --network mysql8.0-net --network-alias mysql8.0-net-alias -v mysql8.0-data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=javaweb -p 3306:3306 mysql:8.0
> docker exec -it --name mysql8.0 mysql -u root -p

No console do MySQL, criar a tabela estado.

```
use javaweb;
create table estado (
  id integer not null primary key auto_increment,
  nome varchar(50) not null,
  sigla char(2) not null
  );
```
