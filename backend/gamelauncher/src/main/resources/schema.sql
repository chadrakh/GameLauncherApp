CREATE TABLE IF NOT EXISTS Users
(
    id INT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    full_name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Games
(
    id INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    price DECIMAL(4, 2),
    summary VARCHAR(300),
    description VARCHAR(600),
    release_date VARCHAR(255),
    developer VARCHAR(255),
    publisher VARCHAR(255),
    tags VARCHAR(255),
    rating VARCHAR(255),
    rating_description VARCHAR(255),
    trailer_link VARCHAR(255),
    cover_image VARCHAR(255),
    product_images VARCHAR(255),
    reviews INT,
    recommended_system_requirements_id INT,
    minimum_system_requirements_id INT
);

CREATE TABLE IF NOT EXISTS MinimumSystemRequirements
(
    id INT PRIMARY KEY,
    game_id INT,
    operating_system VARCHAR(255),
    processor VARCHAR(255),
    memory VARCHAR(255),
    graphics VARCHAR(255),
    storage VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS RecommendedSystemRequirements
(
    id INT PRIMARY KEY,
    game_id INT,
    operating_system VARCHAR(255),
    processor VARCHAR(255),
    memory VARCHAR(255),
    graphics VARCHAR(255),
    storage VARCHAR(255)
);

ALTER TABLE Games
    ADD FOREIGN KEY (recommended_system_requirements_id)
        REFERENCES RecommendedSystemRequirements(id);

ALTER TABLE Games
    ADD FOREIGN KEY (minimum_system_requirements_id)
        REFERENCES MinimumSystemRequirements(id);
