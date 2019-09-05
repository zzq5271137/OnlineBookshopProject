DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS customer;

CREATE TABLE books(
   id INT,
   title VARCHAR(50),
   author VARCHAR(50),
   price FLOAT,
   copies INT,
   PRIMARY KEY(id));
 
INSERT INTO books VALUES (1001, 'Java for dummies', 'Tan Ah Teck', 11.11, 11);
INSERT INTO books VALUES (1002, 'More Java for dummies', 'Tan Ah Teck', 22.22, 22);
INSERT INTO books VALUES (1003, 'More Java for more dummies', 'Mohammad Ali', 33.33, 33);
INSERT INTO books VALUES (1004, 'A Cup of Java', 'Kumar', 44.44, 44);
INSERT INTO books VALUES (1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55);


CREATE TABLE customer(
   id INT,
   name VARCHAR(50),
   email VARCHAR(100),
   address VARCHAR(200),
   PRIMARY KEY(id));
 
INSERT INTO customer VALUES (001, 'Jones', 'jones@gmail.com','Office 9, IAS, Princeton, USA');
INSERT INTO customer VALUES (002, 'Dana', 'dana@gmail.com','Office 6, IAS, Princeton, USA');
INSERT INTO customer VALUES (003, 'Alex', 'alex@gmail.com', 'Office 9, IAS, Princeton, USA');
INSERT INTO customer VALUES (004, 'Adam', 'adam@gmail.com', 'SOME WHERE');
INSERT INTO customer VALUES (005, 'David', 'david@gmail.com', 'SOME WHERE');

