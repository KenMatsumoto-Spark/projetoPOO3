drop table tbhospede;

create table tbhospede(
    cpf varchar(20) primary key,
    nome varchar(50),
    endereco varchar(100),
    telefone number(15),
    taxaDesconto number(5)
)

select * from tbhospede;

drop table tbrecepcionista;

create table tbrecepcionista(
    regfunc number(20) primary key,
    nome varchar(50),
    endereco varchar(100),
    telefone number(15),
    turno varchar (5)
)

select * from tbhospede;

drop table tbquarto;

create table tbquarto(
    numero int(10) primary key,
    valorDiaria float(20),
    tipo varchar(10),
)

select * from tbquarto;