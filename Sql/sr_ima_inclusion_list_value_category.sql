create table if not exists sr_ima_inclusion_list_value_category(
srima_inclusion_value_cat_code varchar(255) not null,
srima_inclusion_value_cat_name varchar(255) null,
srima_inclusion_value_cat_description varchar(255) null,
srima_inclusion_value_cat_definition varchar(255) null,
authorizer_id bigint null,
owner varchar(255) null,
ps_ids varchar(255) null,
service_name_id bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint sr_ima_inclusion_list_value_category_pk primary key(srima_inclusion_value_cat_code));