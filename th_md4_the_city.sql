create table the_city
(
    id          bigint       not null
        primary key,
    area        int          null,
    description varchar(255) null,
    gdp         int          null,
    name        varchar(255) null,
    population  int          null,
    country_id  bigint       not null,
    constraint FK22tv1cgwyf53wonncx8xp0d10
        foreign key (country_id) references country (id)
);

INSERT INTO th_md4.the_city (id, area, description, gdp, name, population, country_id) VALUES (6, 12312312, 'Recorded crime has been rising in London', 150, 'Luandon', 2131244, 4);
INSERT INTO th_md4.the_city (id, area, description, gdp, name, population, country_id) VALUES (8, 32432, 'jkehjfkhejfhiewioioewuiorweds', 21312312, 'buenotret', 2131244, 7);
INSERT INTO th_md4.the_city (id, area, description, gdp, name, population, country_id) VALUES (10, 12312312, '200', 5032423, 'Singapore', 2131244, 9);
INSERT INTO th_md4.the_city (id, area, description, gdp, name, population, country_id) VALUES (13, 12312312, 'jkdhfjhklaswfhwefhwelhf', 21312312, 'campuchia', 2131244, 12);
INSERT INTO th_md4.the_city (id, area, description, gdp, name, population, country_id) VALUES (14, 12312312, 'cdcd', 21312312, 'hung', 2131244, 1);