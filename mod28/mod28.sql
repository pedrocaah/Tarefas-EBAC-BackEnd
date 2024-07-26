create table tb_venda (
	id_venda BIGINT NOT NULL,
	PRIMARY KEY (id_venda),
	--constraint pk_id_venda primary key(id_venda),
	CONSTRAINT fk_id_venda_produto FOREIGN KEY (id_venda) REFERENCES tb_produto(id_produto)
);

select *
from tb_cliente p, tb_produto e
inner join tb_produto e on e.id = p.id_venda;

select p.nome as nome_cliente, e.nome as nome_produto
from tb_cliente as p, tb_produto as e
where p.id_produto = e.id;