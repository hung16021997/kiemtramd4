create table hibernate_sequence
(
    next_val bigint null
)
    engine = MyISAM;

INSERT INTO th_md4.hibernate_sequence (next_val) VALUES (15);
INSERT INTO th_md4.hibernate_sequence (next_val) VALUES (15);