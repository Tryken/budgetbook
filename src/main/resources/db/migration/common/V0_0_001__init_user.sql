create table if not exists "user"
(
    id         uuid NOT NULL PRIMARY KEY,
    email      VARCHAR(255),
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    password   VARCHAR(255),
    CONSTRAINT UC_Email UNIQUE (email)
);