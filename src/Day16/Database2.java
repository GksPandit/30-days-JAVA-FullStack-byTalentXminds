package Day16;

public class Database2 {
    static void main() {
        //Constraints-are rules applied to table columns to ensure data accuracy
        // and integrity
        // PRIMARY KEY,FOREIGN KEY,UNIQUE,NOT NULL,DEFAULT,CHECK
        //1. PK - unique,cannot be null
       /*
        CREATE TABLE students(
                id INT PRIMARY KEY,
                name varchar(50)
        );
        //NOT NULL
        CREATE TABLE students(
                id INT PRIMARY KEY,
                name varchar(50) NOT NULL,
        );
        //UNIQUE
        // email -> null
        CREATE TABLE students(
                id INT PRIMARY KEY,
                name varchar(50) NOT NULL,
                email varchar(100) UNIQUE
        );
        //DEFAULT
        CREATE TABLE students(
                id INT PRIMARY KEY,
                name varchar(50) NOT NULL ,
                email varchar(100) UNIQUE,
                city VARCHAR(50) DEFAULT "Lucknow"
        );
        //Check
        CREATE TABLE students(
                id INT PRIMARY KEY,
                name varchar(50) NOT NULL ,
                email varchar(100) UNIQUE,
                city VARCHAR(50) DEFAULT "Lucknow",
                age INT CHECK(age>=18)
        );
        // value(age->15) error
        //Foreign key
        CREATE TABLE departments(
                dept_id INT PRIMARY KEY,
                dept_name varchar(50)
        )
        //
        CREATE TABLE students(
                id INT PRIMARY KEY,
                name varchar(50) NOT NULL ,
                email varchar(100) UNIQUE,
                city VARCHAR(50) DEFAULT "Lucknow",
                age INT CHECK(age>=18),
                dept_id INT,
                FOREIGN KEY(dept_id)
                REFERENCES departments(dept_id)
        );
//        student belongs to one department
        // SQL JOINS
        //INNER JOIN - return matching records from both tables
        SELECT students.name,departments.dept_name
        FROM students
        INNER JOIN departments
        on students.dept_id=departments.dept_id;
        //LEFT Join- it will return all records from left table
        select * from students left join departments on
                students.dept_id=departments.dept_id;
        //RIGHT Join- it will return all records from right table
        select * from students right join departments on
        students.dept_id=departments.dept_id;

        //cross join
//        every row combines with every row.
        // cartesian product 4 x 4 =16
        select * from students cross join departments;

        // q. display students whose age is greater than 20
        select * from students WHERE age>20;
        //q. display students from lucknow
        select * from students WHERE city='Lucknow';
        //q. display students not from lucknow
        select * from students WHERE city!='Lucknow';
        // q. display students whose age is greater than 20 less than 29
        select * from students WHERE age>20 AND age<29;
        // q. display students whose age is greater than 21 or not from lucknow
        select * from students WHERE age>21 or city!='Lucknow';
        // between
        // q. display students whose age is between 20 and 29
        select * from students WHERE age BETWEEN 21 AND 28;
        // IN
        // q.students from deptid 1 or 2
        select * from students where dept_id in(1,2);
        //like operator
        //q. display students whose name starts with kl
        select * from students where name LIKE 'KL%';
        // q. display students odered by name alphabetically
        select * from students order by name asc;
        // q. display top 3 elder students
        select * from students order by age desc LIMIT 3;
        */

        // Aggregate functions
         /*   max,avg,count,sum,min
        mysql> select MAX(age) from students;
        +----------+
                | MAX(age) |
                +----------+
                |       29 |
                +----------+
                        1 row in set (0.005 sec)

        mysql> select MIN(age) from students;
        +----------+
                | MIN(age) |
                +----------+
                |       19 |
                +----------+
                        1 row in set (0.001 sec)

        mysql> select AVG(age) from students;
        +----------+
                | AVG(age) |
                +----------+
                |  25.1667 |
                +----------+
                        1 row in set (0.002 sec)

        mysql> select COUNT(*) from students;
        +----------+
                | COUNT(*) |
        +----------+
                |        6 |
                +----------+
                        1 row in set (0.003 sec)

        mysql> select SUM(age) from students;
        +----------+
                | SUM(age) |
                +----------+
                |      151 |
                +----------+
                        1 row in set (0.003 sec)
          */

    }
}