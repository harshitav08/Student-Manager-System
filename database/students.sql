CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    roll VARCHAR(20) UNIQUE,
    course VARCHAR(50)
);

INSERT INTO students(name, roll, course)
VALUES ("Aisha", "23CS101", "B.Tech CSE");
