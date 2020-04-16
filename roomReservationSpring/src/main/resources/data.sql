DROP TABLE IF EXISTS room;

CREATE TABLE if not exists room (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250),
  size INT,
  floor INT,
    available BOOLEAN DEFAULT 'T');

INSERT INTO room (name, size, floor,available) VALUES
  ('Aliko', 5, 8, default ),
  ('Bill', 10, 8, default ),
   ('Aliko2', 15, 3, default ),
  ('Folrunsho', 15, 8, default );
