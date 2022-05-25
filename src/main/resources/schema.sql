CREATE TABLE CardWH4e_header
(
    id           INT PRIMARY KEY auto_increment,
    name         VARCHAR,
    game_class   VARCHAR,
    career       VARCHAR,
    career_level VARCHAR,
    career_path  SMALLINT(5),
    race         VARCHAR,
    status       VARCHAR,
    age          SMALLINT(5),
    height       SMALLINT(5),
    hair         VARCHAR,
    eyes         VARCHAR
);
CREATE TABLE CardWH4e_basic_skills
(
    id                   INT PRIMARY KEY auto_increment,
    header_id            INT,
    name                 VARCHAR,
    characteristic_name  VARCHAR,
    characteristic_value SMALLINT(5),
    advancement          SMALLINT(5),
    skill                SMALLINT(5)

);

CREATE TABLE CardWH4e_single_characteristic
(
    id          INT PRIMARY KEY auto_increment,
    header_id   INT,
    name        VARCHAR,
    initial     SMALLINT(5),
    advancement SMALLINT(5),
    current     SMALLINT(5)

);
CREATE TABLE CardWH4e_fate_resilance_exp_movement
(
    id                 INT PRIMARY KEY auto_increment,
    header_id          INT,
    fate               SMALLINT(5),
    fortune            SMALLINT(5),
    resilience         SMALLINT(5),
    resolve            SMALLINT(5),
    motivation         SMALLINT(5),
    experience_current SMALLINT(5),
    experience_spent   SMALLINT(5),
    experience_total   SMALLINT(5),
    movement           SMALLINT(5)
);
INSERT INTO CardWH4e_fate_resilance_exp_movement (header_id, fate, fortune, resilience, resolve, motivation,
                                                  experience_current,
                                                  experience_spent, experience_total, movement)
VALUES (1, 2, 2, 0, 0, 0, 5, 550, 555, 5);
INSERT INTO CardWH4e_single_characteristic (header_id, name, initial, advancement, current)
values (1, 'Weapon Skill', 42, 5, 47);

INSERT INTO CardWH4e_single_characteristic (header_id, name, initial, advancement, current)
values (1, 'Ballistic Skill', 37, 0, 37);

INSERT INTO CardWH4e_basic_skills (header_id, name, characteristic_name, characteristic_value, advancement, skill)
values (1, 'Melee (Basic)', 'Weapon Skill', 47, 0, 47);

INSERT INTO CardWH4e_header (name, game_class, career, career_level, career_path, race, status, age, height, hair, eyes)
values ('Imdianil', 'Mage', 'Academic', 'Wandering Wizard', 2, 'elf', 'silver 3', 90, 190, 'yellow', 'turkusowe')
