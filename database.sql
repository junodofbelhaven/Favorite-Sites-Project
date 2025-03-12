CREATE SCHEMA sitesdatabase;
USE sitesdatabase;

CREATE TABLE userinfo (
    userID INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) unique NOT NULL,
    password VARCHAR(255) NOT NULL
);

alter table userinfo auto_increment = 100;

INSERT INTO userinfo(username, password)
VALUES
('Anil', 'anil2323'),
('legolas', '1234'),
('aragorn', '1111'),
('gandalf', 'asdf'),
('gimli', '1515'),
('ladygaladriel', 'sauronx');

CREATE TABLE visits (
    visit_id INT AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    country_name VARCHAR(255) NOT NULL,
    city_name VARCHAR(255) NOT NULL,
    year_visited INT NOT NULL,
    season_visited ENUM('Spring', 'Summer', 'Autumn', 'Winter') NOT NULL,
    best_feature ENUM('Historic Places', 'Castles', 'pubs','Museums', 'Food', 'Beaches', 'None', 'Natural Beauty') NOT NULL,
    user_comment TEXT,
    rating INT CHECK (rating >= 1 AND rating <= 5),
    PRIMARY KEY (visit_id),
    FOREIGN KEY (username) REFERENCES userinfo(username)
);

INSERT INTO visits (username, country_name, city_name, year_visited, season_visited, best_feature, user_comment, rating)
VALUES
('Anil', 'Japan', 'Tokyo', 2018, 'Spring', 'Food', 'Amazing culinary scene, from sushi to ramen!', 5),
('legolas', 'Italy', 'Rome', 2017, 'Autumn', 'Historic Places', 'The Colosseum and other ancient ruins are awe-inspiring!', 4),
('aragorn', 'Spain', 'Barcelona', 2016, 'Summer', 'Beaches', 'Beautiful beaches and stunning Gaudi architecture!', 5),
('gandalf', 'England', 'London', 2015, 'Winter', 'food', 'Fascinating museums and historical sites!', 4),
('gimli', 'Ireland', 'Dublin', 2014, 'Spring', 'food', 'Great pubs with lively music and friendly locals!', 3),
('ladygaladriel', 'Canada', 'Vancouver', 2013, 'Summer', 'Natural Beauty', 'Stunning mountains, forests, and lakes for hiking and exploring!', 5),
('ladygaladriel', 'Australia', 'Sydney', 2012, 'Autumn', 'food', 'Iconic Opera House and beautiful harbor with amazing views!', 4),
('aragorn', 'Greece', 'Athens', 2011, 'Spring', 'pubs', 'The Acropolis and other ancient ruins are a must-see!', 5),
('legolas', 'England', 'London', 2010, 'Winter', 'Museums', 'World-class museums and theaters to enjoy!', 4),
('gandalf', 'Netherlands', 'Amsterdam', 2009, 'Autumn', 'pubs', 'Beautiful canals and a vibrant art scene!', 4),
('Anil', 'India', 'Agra', 2023, 'Winter', 'Historic Places', 'The Taj Mahal is truly breathtaking!', 5),
('legolas', 'Spain', 'Barcelona', 2022, 'Summer', 'Beaches', 'Beautiful scenery and adventure activities!', 4),
('aragorn', 'France', 'Paris', 2021, 'Spring', 'Museums', 'The Louvre is a must-see for any art lover!', 5),
('gandalf', 'Iceland', 'Vik', 2020, 'Autumn', 'Natural Beauty', 'The black sand beaches and waterfalls are incredible!', 4),
('gimli', 'Scotland', 'Edinburgh', 2019, 'Summer', 'Castles', 'Edinburgh Castle is full of history and intrigue!', 3);
 
CREATE TABLE sharedvisits (
    shared_id INT AUTO_INCREMENT PRIMARY KEY,
    visit_id INT NOT NULL,
    sharer_username VARCHAR(50) NOT NULL,
    friend_username VARCHAR(50) NOT NULL,
    FOREIGN KEY (visit_id) REFERENCES visits(visit_id),
    FOREIGN KEY (sharer_username) REFERENCES userinfo(username),
    FOREIGN KEY (friend_username) REFERENCES userinfo(username)
);

INSERT INTO sharedvisits (visit_id, sharer_username, friend_username)
VALUES 
(1, 'Anil', 'aragorn'),
(8, 'aragorn', 'gandalf'),
(6, 'ladygaladriel', 'legolas'),
(11, 'Anil', 'ladygaladriel'),
(14, 'gandalf', 'gimli');