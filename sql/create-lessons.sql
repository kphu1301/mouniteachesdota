CREATE TABLE IF NOT EXISTS lessons (
	lesson_id INT AUTO_INCREMENT NOT NULL,
    type VARCHAR(50) NOT NULL,
	info VARCHAR(255) NOT NULL,
    video_url VARCHAR(255) NOT NULL,
    price DECIMAL(8, 2) NOT NULL,
    PRIMARY KEY (lesson_id)
)Engine=InnoDB;

INSERT INTO lessons VALUES 
	(1,'Last Hitting','Learn how to improve your last hits like a TI winner!','http://www.youtube.com/mounidoto/lh', '10.99'),
	(2,'Mid Role','Learn to master the art of the 2 role','http://www.youtube.com/mounidoto/mr', '29.99'),
	(3,'Carry Role','Learn how to carry with the best of them','http://www.youtube.com/mounidoto/cr', '29.99'),
	(4,'Support Role','Learn how to secure your core\'s farm and gank!','http://www.youtube.com/mounidoto/sr', '10.99');