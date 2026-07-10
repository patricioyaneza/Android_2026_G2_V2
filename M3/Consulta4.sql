set autocommit = 0;

insert into marca(nombre) values ('Nova');
select * from marca order by id_marca desc;
rollback;
commit;