create table if not exists computer (
  id int primary key not null,
  name varchar(50) not null,
  created_at timestamp not null
);

create table if not exists parts (
  id varchar(16) primary key not null,
  name varchar(64) not null,
  type varchar(64) not null
);

create table if not exists computer_parts (
  computer int not null,
  part varchar(16) not null,
  constraint computer_parts_computer foreign key (computer) references computer(id),
  constraint computer_parts_part foreign key (part) references parts(id)
);
