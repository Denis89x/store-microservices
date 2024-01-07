create table t_inventory
(
    id       bigserial primary key,
    quantity integer,
    sku_code varchar(255)
);