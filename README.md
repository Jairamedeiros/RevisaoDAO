# RevisaoDAO

create database if not exists revisao_db;

use revisao_db;

create table if not exists sexo (
	id int not null auto_increment primary key,
	nome varchar(15),
	sigla varchar(15)	
);



create table if not exists cliente (
	id int not null auto_increment primary key,
	nome varchar (100),
	cpf varchar(20),
	id_sexo int references sexo(id)
);


create table if not exists categoria(
	id int not null auto_increment primary key,
	nome varchar(100)
);



create table if not exists produto (
	id int not null auto_increment primary key,
	nome varchar(100),
	valor float,
	id_categoria int references categoria(id)
);


create table if not exists venda (
	id int not null auto_increment primary key,
	id_cliente int references cliente(id),
	valor float		
);

create table if not exists produto_venda (
	id_venda int references venda(id),
	id_produto int references produto(id),
	primary key (id_venda,id_produto)
		
);
	
	




