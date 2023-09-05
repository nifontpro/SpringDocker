-- DROP SCHEMA IF EXISTS usr;
CREATE SCHEMA IF NOT EXISTS usr;

DROP TABLE IF EXISTS usr.usr;
CREATE TABLE IF NOT EXISTS usr.usr
(
    id bigserial primary key,
    firstname text COLLATE pg_catalog."default"
);