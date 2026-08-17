BEGIN;

-- =========================
-- CATEGORÍAS
-- =========================

INSERT INTO categoria (nombre) VALUES
    ('Tartas'),
    ('Pasteles'),
    ('Bollería'),
    ('Galletas'),
    ('Chocolates'),
    ('Panadería');


-- =========================
-- PRODUCTOS
-- =========================

INSERT INTO producto
    (id_categoria, nombre, precio, descripcion, stock, foto, alergenos)
VALUES
    (
        1,
        'Tarta de chocolate',
        28.50,
        'Tarta de chocolate negro con cobertura de chocolate y decoración artesanal.',
        10,
        'tarta-chocolate.jpg',
        ARRAY['gluten', 'huevos', 'lacteos']::tipo_alergeno[]
    ),
    (
        1,
        'Tarta de queso',
        24.00,
        'Tarta de queso cremosa con base de galleta y frutos rojos.',
        8,
        'tarta-queso.jpg',
        ARRAY['gluten', 'huevos', 'lacteos']::tipo_alergeno[]
    ),
    (
        1,
        'Tarta de manzana',
        22.50,
        'Tarta casera de manzana con canela.',
        6,
        'tarta-manzana.jpg',
        ARRAY['gluten', 'huevos', 'lacteos']::tipo_alergeno[]
    ),
    (
        2,
        'Croissant de chocolate',
        2.20,
        'Croissant de hojaldre relleno de chocolate.',
        25,
        'croissant-chocolate.jpg',
        ARRAY['gluten', 'huevos', 'lacteos', 'soja']::tipo_alergeno[]
    ),
    (
        2,
        'Palmera de chocolate',
        2.80,
        'Palmera de hojaldre cubierta de chocolate.',
        18,
        'palmera-chocolate.jpg',
        ARRAY['gluten', 'lacteos', 'soja']::tipo_alergeno[]
    ),
    (
        3,
        'Croissant clásico',
        1.80,
        'Croissant de mantequilla recién horneado.',
        30,
        'croissant.jpg',
        ARRAY['gluten', 'huevos', 'lacteos']::tipo_alergeno[]
    ),
    (
        3,
        'Napolitana de crema',
        2.30,
        'Hojaldre relleno de crema pastelera.',
        20,
        'napolitana-crema.jpg',
        ARRAY['gluten', 'huevos', 'lacteos']::tipo_alergeno[]
    ),
    (
        4,
        'Galletas de mantequilla',
        4.50,
        'Caja de galletas artesanales de mantequilla.',
        15,
        'galletas-mantequilla.jpg',
        ARRAY['gluten', 'huevos', 'lacteos']::tipo_alergeno[]
    ),
    (
        4,
        'Cookies de chocolate',
        4.90,
        'Cookies caseras con pepitas de chocolate.',
        12,
        'cookies-chocolate.jpg',
        ARRAY['gluten', 'huevos', 'lacteos', 'soja']::tipo_alergeno[]
    ),
    (
        5,
        'Bombones surtidos',
        12.50,
        'Caja de bombones de chocolate negro y con leche.',
        10,
        'bombones.jpg',
        ARRAY['lacteos', 'soja', 'frutos_casacara']::tipo_alergeno[]
    ),
    (
        5,
        'Tableta de chocolate negro',
        5.50,
        'Tableta de chocolate negro 70% cacao.',
        20,
        'chocolate-negro.jpg',
        ARRAY['soja']::tipo_alergeno[]
    ),
    (
        6,
        'Pan de pueblo',
        2.50,
        'Pan artesanal de corteza crujiente y miga tierna.',
        20,
        'pan-pueblo.jpg',
        ARRAY['gluten']::tipo_alergeno[]
    );


-- =========================
-- PEDIDOS
-- =========================

INSERT INTO pedido
    (localizador, fecha, nombre, apellidos, telefono, email,
     direccion, estado, comentario)
VALUES
    (
        'ABC12345',
        '2026-08-15 10:30:00+02',
        'Laura',
        'García López',
        '600123456',
        'laura@example.com',
        'Calle Mayor 12, Cuenca',
        'pagado',
        'Preparar para recoger por la tarde.'
    ),
    (
        'DEF67890',
        '2026-08-16 12:15:00+02',
        'Carlos',
        'Martínez Ruiz',
        '611234567',
        'carlos@example.com',
        'Avenida Castilla 25, Cuenca',
        'enviado',
        NULL
    ),
    (
        'GHI24680',
        '2026-08-17 09:45:00+02',
        'Marta',
        'Sánchez Pérez',
        '622345678',
        'marta@example.com',
        'Calle San Fernando 8, Cuenca',
        'pendiente',
        'Es para un cumpleaños.'
    ),
    (
        'JKL13579',
        '2026-08-10 16:20:00+02',
        'David',
        'Fernández Martín',
        '633456789',
        'david@example.com',
        'Calle Colón 7, Cuenca',
        'cerrado',
        NULL
    ),
    (
        'MNO97531',
        '2026-08-12 11:00:00+02',
        'Ana',
        'Navarro Gómez',
        '644567890',
        'ana@example.com',
        'Calle del Agua 3, Cuenca',
        'anulado',
        'El cliente canceló el pedido.'
    );


-- =========================
-- ITEMS DE LOS PEDIDOS
-- =========================

INSERT INTO item_pedido
    (id_pedido, id_producto, nombre, precio, cantidad)
VALUES
    -- Pedido ABC12345
    (1, 1, 'Tarta de chocolate', 28.50, 1),
    (1, 4, 'Croissant de chocolate', 2.20, 4),

    -- Pedido DEF67890
    (2, 2, 'Tarta de queso', 24.00, 1),
    (2, 9, 'Cookies de chocolate', 4.90, 2),
    (2, 12, 'Pan de pueblo', 2.50, 1),

    -- Pedido GHI24680
    (3, 3, 'Tarta de manzana', 22.50, 1),
    (3, 8, 'Galletas de mantequilla', 4.50, 1),

    -- Pedido JKL13579
    (4, 10, 'Bombones surtidos', 12.50, 2),
    (4, 6, 'Croissant clásico', 1.80, 3),

    -- Pedido MNO97531
    (5, 5, 'Palmera de chocolate', 2.80, 2);


COMMIT;