DELETE FROM reservation
DELETE FROM reservation_time
DELETE FROM theme
DELETE FROM member

INSERT INTO member (name, email, password, role) VALUES ('어드민', 'user@example.com', 'password1!', 'ADMIN');
INSERT INTO member (name, email, password, role) VALUES ('유저', 'user2@example.com', 'password2@', 'USER');
