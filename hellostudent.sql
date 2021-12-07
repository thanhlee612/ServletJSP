
CREATE TABLE student1 (
   id  int(10) NOT NULL primary key AUTO_INCREMENT,
   name VARCHAR (32)     NOT NULL,
   address  VARCHAR (32) NOT NULL
);
drop table student1;
INSERT INTO student1( name, address) VALUES ( "Công", "Hanoi");
INSERT INTO student1( name, address) VALUES ("Dung", "Vinhphuc");
INSERT INTO student1( name, address) VALUES ( "Ngôn", "Danang");
INSERT INTO student1( name, address) VALUES ( "Hạnh", "Hanoi");
INSERT INTO student1( name, address) VALUES ( "Tam", "Hanoi");
INSERT INTO student1( name, address) VALUES ( "Tòng", "Vinhphuc");
INSERT INTO student1( name, address) VALUES ( "Tứ", "Danang");
INSERT INTO student1( name, address) VALUES ( "Đức", "Hanoi");
INSERT INTO student1( name, address) VALUES ( "Hoa", "Hanoi");


select * from student1;
