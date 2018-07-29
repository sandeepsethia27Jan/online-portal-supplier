CREATE DATABASE IF NOT EXISTS nanesh_traders_suppliers DEFAULT CHARACTER SET UTF8;

CREATE USER IF NOT EXISTS 'nanesh_traders_suppliers'@'%' IDENTIFIED BY 'welcome123';

GRANT ALL PRIVILEGES ON gemalto_fido.* TO 'gemalto_fido'@'%' IDENTIFIED BY 'welcome123';

USE nanesh_traders_suppliers;