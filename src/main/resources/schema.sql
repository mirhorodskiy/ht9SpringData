DROP TABLE IF EXISTS employees_project;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;

CREATE TABLE IF NOT EXISTS department
(
    department_id LONG NOT NULL,
    title         varchar(50),
    PRIMARY KEY (department_id)
);

CREATE TABLE IF NOT EXISTS employee
(
    employee_id   long NOT NULL,
    firstname     varchar(255),
    lastname      varchar(255),
    email         varchar(255),
    department_id long NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (department_id) REFERENCES department (department_id) ON UPDATE CASCADE
);
--
-- CREATE TABLE IF NOT EXISTS customer
-- (
--     customer_id  int NOT NULL,
--     firstname    varchar(255),
--     lastname     varchar(255),
--     email        varchar(255),
--     phone_number varchar(255),
--     PRIMARY KEY (customer_id)
-- );
--
--
-- CREATE TABLE IF NOT EXISTS project
-- (
--     project_id           int          NOT NULL,
--     project_title        varchar(255) NOT NULL,
--     customer_id          int          NOT NULL,
--     leader_id            int          NOT NULL,
--     project_start_date   date,
--     project_release_date date,
--     PRIMARY KEY (project_id),
--     FOREIGN KEY (customer_id) REFERENCES customer (customer_id) ON UPDATE CASCADE,
--     FOREIGN KEY (leader_id) REFERENCES employee (employee_id) ON UPDATE CASCADE
-- );
--
--
-- CREATE TABLE IF NOT EXISTS employees_projects
-- (
--     employee_id int NOT NULL,
--     project_id  int NOT NULL,
--     FOREIGN KEY (employee_id) REFERENCES employee (employee_id) ON DELETE CASCADE,
--     FOREIGN KEY (project_id) REFERENCES project (Project_id) ON UPDATE CASCADE
-- );



