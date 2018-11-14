create table dtodo (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  when_created                  timestamp not null,
  when_modified                 timestamp not null,
  version                       bigint not null,
  constraint pk_dtodo primary key (id)
);

