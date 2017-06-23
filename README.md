# Aplicação para remover senhas do XLS

## Requisitos
- Java version 1.8.0_131
- Apache Maven 3.3.9

## Apos baixar o repositório, rodar:
- mvn install
- mvn package # criar o jar

## Modo de utlizar o JAR

### Criando um executável para o Linux
- Executar o comando na pasta raiz do projeto:

`cat create_executable_to_linux.sh target/removePasswordXls-jar-with-dependencies.jar > remove_password_xls.run && chmod +x remove_password_xls.run`

Este comando irá criar um executável para o linux e não ficará mais fácil de chamar via php ou cron.