

/*1. Создать базу данных homeworks*/
 create database homeworks;
 use homeworks;

/*
2. В этой базе создать таблицу employees с полями:
• id – integer - уникальное значение, не пустое, с автозаполнением 
• firstname - varchar(128) - не пустое
• lastname - varchar(128) - не пустое
• job - varchar(64)
• age - integer - от 20 до 100(вкл.)
• hascar – char только один символ, по умолчанию 'N' 
• username - varchar(128) - уникальное значение, не пустое
*/

create table employees (
	id integer primary key auto_increment,
    first_name varchar(128) not null,
    last_name varchar(128) not null,
    job varchar(64),
    age int check(age between 20 and 100),
    has_car char(1) check (has_car in ('Y', 'N')) default 'N',
    username varchar(128) unique not null
  ); 
  
  /*3. Добавить 5 строк.*/
  insert into employees (first_name, last_name, job, age, username) 
   values ('Oleg', 'Olegov', 'job1', 25, 'user1'),
          ('Sergey', 'Sergeev', 'job2', 30, 'user2'),
          ('Alex', 'Alexeev', 'job3', 20, 'user3'),
          ('John', 'Smit', 'job4', 40, 'user4'),
          ('James', 'Bond', 'job5', 55, 'user5');
          
         /*4. Удалить таблицу employees */
         drop table employees;
          
          /*5. Удалить бд homeworks*/
          drop database homeworks;
          
          /*6. Создать бд tasks и в этой базе создать таблицу Staff используя скрипт.
                https://github.com/annykh/genTech/blob/main/staff.txt*/
                
            create database tasks;
			use tasks;  
            
            CREATE TABLE Staff (
    id INTEGER PRIMARY KEY auto_increment,
    firstname VARCHAR(64) NOT NULL,
    lastname VARCHAR(64) NOT NULL,
    position VARCHAR(128),
    age INTEGER,
    has_child CHAR(1),
    username VARCHAR(128) unique
  );

INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Daniels'
        , 'Senior Teacher'
        , 22
        , 'N'
        , 'annakhach5'
        );
        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Tom'
        , 'Austin'
        , 'Junior Blogger'
        , 25
        , 'Y'
        , 'tom12345'
        );
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Bill'
        , 'Lorentz'
        , 'Junior Web Developer'
        , 40
        , 'Y'
        , 'billt1'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Lily'
        , 'May'
        , 'Junior Backend Developer'
        , 25
        , 'Y'
        , 'lil12'
        );
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Nona'
        , 'Lucky'
        , 'Junior Teacher'
        , 20
        , 'N'
        , 'LuckyNona'
        ); 
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ( 'Nancy'
        , 'Greenberg'
        , 'Middle UI Designer'
        , 32
        , 'Y'
        , 'nancy1'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Daniel'
        , 'Faviet'
        , 'Senior UX Designer'
        , 43
        , 'Y'
        , 'favietD'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ally'
        , 'Austin'
        , 'Junior UI Designer'
        , 28
        , 'N'
        , 'ally1'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Lily'
        , 'Chen'
        , 'Senior Teacher'
        , 25
        , 'Y'
        , 'lilychen'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Austin'
        , 'Middle Teacher'
        , 34
        , 'Y'
        , 'anna28'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Alexander'
        , 'Lorentz'
        , 'Junior Backend Developer'
        , 25
        , 'N'
        , 'alex12345'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ashley'
        , 'Lorentz'
        , 'Junior UX Designer'
        , 18
        , 'N'
        , 'lorentz99'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Tom'
        , 'Lucky'
        , 'Middle Blogger'
        , 34
        , 'Y'
        , 'lucky78'
        );        
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ashley'
        , 'Weiss'
        , 'Junior Blogger'
        , 18
        , 'N'
        , 'weiss11'
        );
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Tom'
        , 'Weiss'
        , 'Junior UI Designer'
        , 18
        , 'N'
        , 'tom222'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Bloom'
        , 'Middle UX Designer'
        , 20
        , 'N'
        , 'bloom5'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Tom'
        , 'Berg'
        , 'Middle Teacher'
        , 34
        , 'N'
        , 'tommy1'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ashley'
        , 'Berg'
        , 'Senior Teacher'
        , 37
        , 'N'
        , 'ash89'
        );
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Lily'
        , 'Weiss'
        , 'Middle Blogger'
        , 45
        , 'N'
        , 'lilyW1'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Lorentz'
        , 'Senior UX Designer'
        , 31
        , 'N'
        , 'annlo1'
        );   
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Ashley'
        , 'Weiss'
        , 'Middle UX Designer'
        , 18
        , 'N'
        , 'weiss1'
        );       
INSERT INTO Staff(firstname, lastname, position, age, has_child, username) VALUES 
        ('Anna'
        , 'Keren'
        , 'Junior UX Designer'
        , 34
        , 'N'
        , 'annaK1'
        ); 
        
        
         /* 7. Из таблицы вывести работников, которым больше 20 и меньше 40.*/
         select * from staff
          where age between 20 and 40;
          
          /*8. Вывести только имена сотрудников, у которых юзернейм начинается на букву А и им больше 20.*/
            select * from staff
          where age > 20 
          and username like 'a%';
          
          /* 9. Вывести имена, фамилии и возраст тех сотрудников, у которых id либо 3, либо 7, либо 10.*/
          select firstname, lastname, age from staff
          where id in (3, 7, 10);
          
          /* 10. Вывести сотрудников у которых имя начинается на букву 'A',  а фамилия заканчивается на букву 'S'.*/
          select * from staff
          where firstname like 'a%'
            and lastname like '%s';
          
          
          