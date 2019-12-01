create table book
(
    id bigint auto_increment,
    create_time datetime null,
    update_time datetime null,
    title varchar(20) null,
    score decimal null,
    comment varchar(100) null,
    constraint movie_pk
        primary key (id)
);