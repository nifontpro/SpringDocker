-- DROP SCHEMA IF EXISTS usr;
CREATE SCHEMA IF NOT EXISTS usr;;

CREATE TABLE IF NOT EXISTS usr.usr
(
    id bigserial primary key,
    firstname text COLLATE pg_catalog."default"
);;

CREATE OR REPLACE FUNCTION usr.up_tree_has_id(
    down_id bigint,
    up_id bigint)
    RETURNS boolean
    LANGUAGE plpgsql
    COST 100
    VOLATILE PARALLEL UNSAFE
AS $BODY$
-- Является ли верхний отдел предком нижнего (Для авторизации)
DECLARE
    ret boolean := false;
    curent_id bigint := $1;
    find_id bigint := $2;
BEGIN
    RETURN ret;
END;
$BODY$;;