create
extension if not exists "uuid-ossp";

create table users
(
    id        bigint primary key generated always as identity,
    uuid      UUID unique        not null default uuid_generate_v1(),
    username  varchar(50) unique not null,
    firstname varchar(255),
    surname   varchar(255)

);

create table friends
(
    id        UUID primary key unique not null default uuid_generate_v1(),
    user_id   bigint                  not null references users (id),
    friend_id bigint                  not null references users (id)

);

-- INSERT INTO users (username, firstname, surname) VALUES ('Ronny', 'King', 'Y.');
-- INSERT into friends (user_id, friend_id) values (2, 1)