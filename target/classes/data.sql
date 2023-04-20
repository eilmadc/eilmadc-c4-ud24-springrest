create table employee(
	id int auto_increment,
    nombre varchar(250),
    trabajo varchar(250),
    salario double
);

insert into employee(nombre, trabajo, salario)values('Juan', 'ADMINISTRADOR' , 42000);
insert into employee(nombre, trabajo, salario)values('Maria', 'DIRECTOR' , 47000);