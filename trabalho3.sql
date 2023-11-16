create table tbhospede(
    cpf varchar(20) primary key,
    nome varchar(255),
    endereco varchar(255),
    telefone number(15),
    taxaDesconto number(5)
)

create table tbrecepcionista(
    regfunc number(20) primary key,
    nome varchar(255),
    endereco varchar(255),
    telefone number(15),
    turno varchar (10)
)

create table tbquarto(
    numero number(10) primary key,
    valorDiaria float(20),
    tipo varchar(10)
)

create table tbservicoquarto(
    codigo number(10) primary key,
    valor float(20),
    descricao varchar(255)
)
