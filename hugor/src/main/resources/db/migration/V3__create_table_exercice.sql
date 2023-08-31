CREATE TABLE exercice
(
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    label VARCHAR(100) NOT NULL,
    category_id BIGINT NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category(id)
)