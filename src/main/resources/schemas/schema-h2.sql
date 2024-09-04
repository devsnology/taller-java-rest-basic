-- Eliminación de la tabla si existe
DROP TABLE IF EXISTS curriculum_vitae;

-- Creación de la tabla basada en la clase Java
CREATE TABLE curriculum_vitae (
                                  dni VARCHAR(20) PRIMARY KEY,
                                  name VARCHAR(255),
                                  profile TEXT,
                                  experience_1_position VARCHAR(255) DEFAULT 'Delivery',
                                  experience_1_company VARCHAR(255) DEFAULT 'Delivery Express',
                                  experience_1_description TEXT DEFAULT 'Entrega de pedidos a tiempo, atención al cliente, gestión de rutas.',
                                  education_1_degree VARCHAR(255) DEFAULT 'Estudiante',
                                  education_1_institution VARCHAR(255) DEFAULT 'Universidad XYZ',
                                  skills_1 VARCHAR(255) DEFAULT 'Atención al público',
                                  skills_2 VARCHAR(255) DEFAULT 'Gestión de tiempo',
                                  contact_email VARCHAR(255),
                                  contact_phone VARCHAR(50)
);

-- Inserción de los datos de Tomas Errezarret
INSERT INTO curriculum_vitae (
    dni, name, profile, contact_email, contact_phone
) VALUES (
             '30052723', 'Tomas Errezarret',
             'Soy un estudiante con capacidades de atención al público, con buena experiencia siendo delivery y otras habilidades útiles para trabajos similares.',
             'tomas.errezarret@correo.com', '+123456789'
         );
