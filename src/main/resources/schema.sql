CREATE TABLE employee ( 
  emp_id SERIAL NOT NULL,
  first_name VARCHAR(200) NOT NULL,
  last_name VARCHAR(200) NULL,
  email_id VARCHAR(200) NULL,
  PRIMARY KEY (emp_id)
);