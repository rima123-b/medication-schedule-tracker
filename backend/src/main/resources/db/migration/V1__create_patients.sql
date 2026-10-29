CREATE TABLE patients (
                          id            BIGSERIAL    PRIMARY KEY,
                          first_name    VARCHAR(100) NOT NULL,
                          last_name     VARCHAR(100) NOT NULL,
                          date_of_birth DATE         NOT NULL,
                          ward          VARCHAR(50)  NOT NULL,
                          bed           VARCHAR(10)  NOT NULL,
                          created_at    TIMESTAMPTZ  NOT NULL
);