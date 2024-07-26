create sequence sq_cliente_2
start 1
increment 1
owned by tb_cliente_2.id;




create table tb_cliente_2 (
	id bigint,
	nome varchar(50) not null,
	codigo varchar(50) not null,
	constraint pk_id_cliente_2 primary key(id)
);
