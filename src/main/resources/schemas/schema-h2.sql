DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id UUID PRIMARY KEY,
                       name VARCHAR(255),
                       lastname VARCHAR(255),
                       email VARCHAR(255),
                       password VARCHAR(255)
);

INSERT INTO users (id, name, lastname, email, password)
VALUES (UUID(), 'Gerardo', 'Palet', 'gpalet@gmail.com', '123456');
INSERT INTO users (id, name, lastname, email, password)
VALUES (UUID(), 'Gerardo', 'Palet', 'gpalet@gmail.com', '123456');
