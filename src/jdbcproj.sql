select * from emp;
CREATE TABLE customers1  
( customer_id number(10) NOT NULL,  
  customer_name varchar2(50) NOT NULL,  
  city varchar2(50)  
); 
desc customers1;
INSERT INTO customers1  
(customer_id, customer_name,city)  
VALUES  
(100, 'Narendra','chennai');  

commit

ALTER TABLE customers1
ADD CONSTRAINT pk_custid PRIMARY KEY (customer_id)
