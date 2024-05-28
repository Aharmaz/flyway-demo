create table "persons" (
    "id" int,
    "first_name" text not null,
    "last_name" text not null,
    "age" int not null,
    "email" text not null unique,
    "country" text not null,
    "city" text not null,
    constraint "person_pkey" primary key ("id")
);