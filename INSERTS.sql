INSERT INTO category (name) VALUES
('Drama'),
('Ciencia'),
('Ciencia Ficción'),
('Tecnología'),
('Novela'),
('Comedia'),
('Terror'),
('Anime');


INSERT INTO users (username, full_name, password_hash, state) 
VALUES
(
    'josue123', 
    'Josué Eduardo García', 
    'hola', 
    'ACTIVO'
),
(
    'kevin123', 
    'Kevin Alexander Rivas', 
    'hola', 
    'ACTIVO'
),
(
    'roberto123', 
    'Roberto Arturo Duarte', 
    'hola', 
    'ACTIVO'
);



INSERT INTO book (name, summary, price, state, image_url, cat_id, usr_id)
VALUES
(
    'El Gran Gatsby', 
    'Un millonario misterioso y su obsesión por una mujer.', 
    19.99, 
    'ACTIVO', 
    'https://upload.wikimedia.org/wikipedia/commons/7/7a/The_Great_Gatsby_Cover_1925_Retouched.jpg', 
    1,
    1
),
(
    'Dune', 
    'Una epopeya de política, religión y poder en un planeta desértico.', 
    24.99, 
    'ACTIVO', 
    'https://upload.wikimedia.org/wikipedia/en/d/de/Dune_cover.jpg', 
    2,
    2
),
(
    'It (Eso)', 
    'Un grupo de amigos se enfrenta a un antiguo mal que toma la forma de sus peores miedos.', 
    27.99, 
    'ACTIVO', 
    'https://upload.wikimedia.org/wikipedia/en/5/5a/It_cover.jpg', 
    3,
    3
),
(
    'Akira (Manga Tomo 1)', 
    'En un Neo-Tokio post-apocalíptico, un joven motociclista adquiere poderes psíquicos.', 
    39.99, 
    'ACTIVO', 
    'https://www.coverbrowser.com/image/akira/1-1.jpg', 
    4,
    1
),
(
    'Cien Años de Soledad', 
    'La mítica historia de la familia Buendía en el pueblo de Macondo.', 
    22.99, 
    'ACTIVO', 
    'https://upload.wikimedia.org/wikipedia/en/a/a0/Cien_a%C3%B1os_de_soledad_%28book_cover%29.jpg', 
    5,
    2
),
(
    'Sin Noticias de Gurb', 
    'Un extraterrestre perdido busca a su compañero en la Barcelona preolímpica.', 
    15.99, 
    'ACTIVO', 
    'https://pictures.abebooks.com/isbn/9788432218842-es.jpg', 
    6,
    3
),
(
    'Clean Code', 
    'Un manual de desarrollo ágil de software y buenas prácticas.', 
    49.99, 
    'ACTIVO', 
    'https://m.media-amazon.com/images/I/41zoxjP9lcL.jpg', 
    7,
    1
),
(
    'Cosmos', 
    'Un viaje inspirador a través del universo y el tiempo.', 
    29.99, 
    'ACTIVO', 
    'https://upload.wikimedia.org/wikipedia/en/b/b2/Cosmos_by_Carl_Sagan.jpg', 
    8,
    2
);