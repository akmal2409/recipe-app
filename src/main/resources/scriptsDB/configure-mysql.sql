/*
Use to run mysql db docker image
$ docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

connect to mysql and run as root user
 */

CREATE DATABASE talci_dev;
CREATE DATABASE talci_prod;

CREATE USER 'talci_dev_user'@'localhost' IDENTIFIED BY 'talci';
CREATE USER 'talci_prod_user'@'localhost' IDENTIFIED BY 'talci';

GRANT SELECT ON talci_dev.* to 'talci_dev_user'@'localhost';
GRANT INSERT ON talci_dev.* to 'talci_dev_user'@'localhost';
GRANT DELETE ON talci_dev.* to 'talci_dev_user'@'localhost';
GRANT UPDATE ON talci_dev.* to 'talci_dev_user'@'localhost';
GRANT SELECT ON talci_prod.* to 'talci_prod_user'@'localhost';
GRANT INSERT ON talci_prod.* to 'talci_prod_user'@'localhost';
GRANT DELETE ON talci_prod.* to 'talci_prod_user'@'localhost';
GRANT UPDATE ON talci_prod.* to 'talci_prod_user'@'localhost';
