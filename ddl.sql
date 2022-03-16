DROP TABLE IF EXISTS member CASCADE;
CREATE TABLE member (
            mem_no INT NOT NULL AUTO_INCREMENT,
            id VARCHAR(30) NOT NULL,
            name VARCHAR(45) NOT NULL,
            password VARCHAR(50) NOT NULL,
            hp INT,
            email VARCHAR(100),
            sex CHAR(2) NOT NULL,
            reg_dt DATETIME NOT NULL,
            reg_no INT NOT NULL,
            mod_dt DATETIME,
            mod_no INT,
            PRIMARY KEY (mem_no),
            UNIQUE INDEX id_UNIQUE (id)
);

