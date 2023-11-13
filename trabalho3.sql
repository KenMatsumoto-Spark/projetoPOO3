drop table tbhospede;

create table tbhospede(
    cpf varchar(20) primary key,
    nome varchar(50),
    endereco varchar(100),
    telefone number(15),
    taxaDesconto number(5)
)

select * from tbhospede;


