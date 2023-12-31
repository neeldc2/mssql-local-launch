# mssql-local-launch

Use this repository as a starting point to try any Spring Boot Project with local MS-SQL.
This connects with SQL running on Docker.

------- MS-SQL -------

If you are running ms-sql image using CMD, then use the below commands

docker pull mcr.microsoft.com/mssql/server:2019-latest

docker run -e 'ACCEPT_EULA=Y' -e 'MSSQL_SA_PASSWORD=<YourStrong!Passw0rd>' -p 1401:1433 -d mcr.microsoft.com/mssql/server:2019-CU18-ubuntu-20.04

If you are using docker compose YML file, then use the below command 

docker-compose up -d

Use the below commands to connect to MSSQL server running on Docker. Run these commands on the ms-sql container terminal of Docker. Use command "GO" to run the query.

/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P password123

/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P password123 -Q 'SELECT 1'

create schema DbLock

create table DbLock.Person (personId int, version int, firstName varchar(255), lastName varchar(255), id uniqueidentifier not null, primary key (id))

SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = 'BASE TABLE';

------- MS-SQL -------

------- REDIS -------

In the docker compose file, there is a redis service. To connect to that redis service that Docker brings up, run the below command on CMD.

redis-cli -h 127.0.0.1 -p 6379

If redis-cli isn't installed, use this link https://github.com/tporadowski/redis/releases. Add the Redis installation folder into PATH manually.

------- REDIS -------

To test if the Application runs, hit the below URL on browser or Postman

localhost:8080/persons

Add the below arguments in VM options: "-Dspring.profiles.active=docker"