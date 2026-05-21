Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 12
Server version: 8.4.9 MySQL Community Server - GPL

Copyright (c) 2000, 2026, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| dbemployees        |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.01 sec)

mysql> CREATE DATABASE dbTienda;
Query OK, 1 row affected (0.01 sec)

mysql> use dbTienda;
Database changed
mysql> show tables;
Empty set (0.00 sec)

mysql> clientes, productos, ventas, detalle_ventas, auditoria_ventas
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'clientes, productos, ventas, detalle_ventas, auditoria_ventas' at line 1
mysql> //clientes, productos, ventas, detalle_ventas, auditoria_ventas;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '//clientes, productos,ventas, detalle_ventas, auditoria_ventas' at line 1
mysql> -- clientes, productos, ventas, detalle_ventas, auditoria_ventas;
mysql> -- Se procede a crear las tablas :  clientes, productos, ventas, detalle_ventas, auditoria_ventas;
mysql> CREATE TABLE clientes(
    -> id_cliente INT PRIMARY KEY AUTO INCREMENT,
    -> cedula VARCHAR(13) UNIQUE NOT NULL,
    -> nombres VARCHAR(100) NOT NULL,
    -> correo VARCHAR(100) UNIQUE,
    -> fecha_nacimiento DATE,
    -> estado VARCHAR(15) DEFAULT 'ACTIVO',
    -> fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'AUTO INCREMENT,
cedula VARCHAR(13) UNIQUE NOT NULL,
nombres VARCHAR(100) NOT NUL' at line 2
mysql> CREATE TABLE clientes(
    -> id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    -> cedula VARCHAR(13) UNIQUE NOT NULL,
    -> nombres VARCHAR(100) NOT NULL,
    -> correo VARCHAR(100) UNIQUE,
    -> fecha_nacimiento DATE,
    -> estado VARCHAR(15) DEFAULT 'ACTIVO',
    -> fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP);
Query OK, 0 rows affected (0.04 sec)

mysql> DESCRIBE CLIENTES;
+------------------+--------------+------+-----+-------------------+-------------------+
| Field            | Type         | Null | Key | Default           | Extra             |
+------------------+--------------+------+-----+-------------------+-------------------+
| id_cliente       | int          | NO   | PRI | NULL              | auto_increment    |
| cedula           | varchar(13)  | NO   | UNI | NULL              |                   |
| nombres          | varchar(100) | NO   |     | NULL              |                   |
| correo           | varchar(100) | YES  | UNI | NULL              |                   |
| fecha_nacimiento | date         | YES  |     | NULL              |                   |
| estado           | varchar(15)  | YES  |     | ACTIVO            |                   |
| fecha_registro   | timestamp    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
+------------------+--------------+------+-----+-------------------+-------------------+
7 rows in set (0.00 sec)

mysql>
