create schema book_library;

create table book_library.books_info
(
    id                    bigint primary key generated always as identity,
    book_name             varchar(250),
    book_author           varchar(50),
    book_pages            bigint,
    book_year_publication bigint,
    user_id               bigint

);

create table book_library.books_status
(
    id      bigint primary key generated always as identity,
    book_id bigint references book_library.books_info (id),
    status  varchar(50) not null --OWNER/WISHLIST

);

--INSERT INTO book_library.books_info (book_name, book_author, book_pages, book_year_publication)
--VALUES ('Old Castle', 'Hoffman', 789, 2021);