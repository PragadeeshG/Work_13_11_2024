create table if not exists sr_ima_inclusion_list_value_screen(
record_id Integer not null,
srima_inclusion_val_screen_id Integer null,
srima_inclusion_val_screen_name varchar(255) null,
srima_inclusion_val_screen_url varchar(255) null,
srima_inclusion_val_page_url varchar(255) null,
action_ids varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint sr_ima_inclusion_list_value_screen_pk primary key(record_id));