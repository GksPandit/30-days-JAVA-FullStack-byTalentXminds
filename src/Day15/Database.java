package Day15;

public class Database {
    // Database - collection of organised  related data
    //DBMS- ex- MySQL,oracle,SQL server, mongodb
    //RDBMS-relational database management system
    // stores data in tables
    // SQL - structured query language is used to communicate with relational databases.
    // manipulate data , define data,query,control,transaction
    // categories of SQL
    // DDL,DML,DQL,DCL,TCL
//    DDL(Data definition Language) commands
    // CREATE
    // ALTER
    // DROP
    // TRUNCATE
//    DML(Data manipulation language)
    //INSERT
    //UPDATE
    //DELETE
//    DQL(Data Query language)
    //SELECT
//    DCL(Data Control language)
    //GRANT
    //REVOKE
//    TCL(Transaction Control Language)
    // started a payment of 1000
    // COMMIT
    //ROLLBACK
    //SAVEPOINT

    // connect database from cmd -  mysql -u admin -p
   /* mysql> CREATE DATABASE college;
    Query OK, 1 row affected (0.027 sec)

    mysql> show databases;
+--------------------+
        | Database           |
            +--------------------+
            | college            |
            | information_schema |
            | mysql              |
            +--------------------+
            7 rows in set (0.015 sec)

    mysql> use college;
    Database changed
    mysql> select database();
+------------+
        | database() |
            +------------+
            | college    |
            +------------+
            1 row in set (0.000 sec)

    mysql> drop database college;
    Query OK, 0 rows affected (0.017 sec)

    mysql> select database();
+------------+
        | database() |
            +------------+
            | NULL       |
            +------------+
            1 row in set (0.001 sec)

    mysql> show databases;
+--------------------+
        | Database           |
            +--------------------+
            | information_schema |
            | mysql              |
            | performance_schema |
            +--------------------+
            6 rows in set (0.002 sec)

    mysql>

    */

    // Data Types
    // int,varchar,char,float,double,boolean,date,datetime
    //example- ID INT,Name VARCHAR(50),Age INT,Marks DOUBLE,DOB DATE

    // CREATE
    // Create table - rows + columns
    /*
                    CREATE TABLE students(
                -> id INT,
                -> name VARCHAR(50),
                -> age INT,
                -> DOB DATE
                -> );
            Query OK, 0 rows affected (0.019 sec)

            mysql> show tables;
            +-------------------+
            | Tables_in_college |
            +-------------------+
            | students          |
            +-------------------+
            1 row in set (0.003 sec)

            mysql> DESC students;
            +-------+-------------+------+-----+---------+-------+
            | Field | Type        | Null | Key | Default | Extra |
            +-------+-------------+------+-----+---------+-------+
            | id    | int         | YES  |     | NULL    |       |
            | name  | varchar(50) | YES  |     | NULL    |       |
            | age   | int         | YES  |     | NULL    |       |
            | DOB   | date        | YES  |     | NULL    |       |
            +-------+-------------+------+-----+---------+-------+
            4 rows in set (0.009 sec)

            mysql> INSERT INTO students
                -> VALUES
                -> (101,'Rahul',22,22/10/2004);
            ERROR 1292 (22007): Incorrect date value: '0.00109780' for column 'DOB' at row 1
            mysql> INSERT INTO students  VALUES (101,'Rahul',22,'22/12/2004');
            ERROR 1292 (22007): Incorrect date value: '22/12/2004' for column 'DOB' at row 1
            mysql> INSERT INTO students  VALUES (101,'Rahul',22,'2003-07-16');
            Query OK, 1 row affected (0.005 sec)

            READ
            mysql> select * from students;
            +------+-------+------+------------+
            | id   | name  | age  | DOB        |
            +------+-------+------+------------+
            |  101 | Rahul |   22 | 2003-07-16 |
            +------+-------+------+------------+
            1 row in set (0.001 sec)

            UPDATE
            mysql> UPDATE students
                -> SET age=24
                -> where id=101;
            Query OK, 1 row affected (0.003 sec)
            Rows matched: 1  Changed: 1  Warnings: 0

            mysql> select * from students;
            +------+-------+------+------------+
            | id   | name  | age  | DOB        |
            +------+-------+------+------------+
            |  101 | Rahul |   24 | 2003-07-16 |
            +------+-------+------+------------+
            1 row in set (0.001 sec)

            mysql> exit
            Bye
            nikhil@Nikhils-MacBook-Air sql-commands % mysql -u admin -p
            Enter password:
            Welcome to the MySQL monitor.  Commands end with ; or \g.
            Your MySQL connection id is 11
            Server version: 9.6.0 Homebrew

            Copyright (c) 2000, 2026, Oracle and/or its affiliates.

            Oracle is a registered trademark of Oracle Corporation and/or its
            affiliates. Other names may be trademarks of their respective
            owners.

            Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

            mysql> show databases;
            +--------------------+
            | Database           |
            +--------------------+
            | ali_equipement_db  |
            | college            |
            | information_schema |
            | mysql              |
            | performance_schema |
            | spring             |
            | sys                |
            +--------------------+
            7 rows in set (0.002 sec)

            mysql> use college;
            Reading table information for completion of table and column names
            You can turn off this feature to get a quicker startup with -A

            Database changed
            mysql> select * from students;
            +------+-------+------+------------+
            | id   | name  | age  | DOB        |
            +------+-------+------+------------+
            |  101 | Rahul |   24 | 2003-07-16 |
            +------+-------+------+------------+
            1 row in set (0.001 sec)

            DELETE
            mysql> DELETE FROM students
                -> WHERE id=101;
            Query OK, 1 row affected (0.004 sec)

            mysql> select * from students;
            Empty set (0.001 sec)
     */

}