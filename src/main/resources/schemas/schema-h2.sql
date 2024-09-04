-- Eliminación de la tabla si existe
DROP TABLE IF EXISTS curriculum_vitae;

-- Creación de la tabla basada en el DTO
CREATE TABLE curriculum_vitae (
                                  dni VARCHAR(20) PRIMARY KEY,
                                  name VARCHAR(255),
                                  profile TEXT,
                                  experience_1_position VARCHAR(255),
                                  experience_1_company VARCHAR(255),
                                  experience_1_description TEXT,
                                  experience_2_position VARCHAR(255),
                                  experience_2_company VARCHAR(255),
                                  experience_2_description TEXT,
                                  experience_3_position VARCHAR(255),
                                  experience_3_company VARCHAR(255),
                                  experience_3_description TEXT,
                                  experience_4_position VARCHAR(255),
                                  experience_4_company VARCHAR(255),
                                  experience_4_description TEXT,
                                  education_1_degree VARCHAR(255),
                                  education_1_institution VARCHAR(255),
                                  education_1_description TEXT,
                                  education_2_degree VARCHAR(255),
                                  education_2_institution VARCHAR(255),
                                  education_2_description TEXT,
                                  education_3_degree VARCHAR(255),
                                  education_3_institution VARCHAR(255),
                                  education_3_description TEXT,
                                  skills_1 VARCHAR(255),
                                  skills_2 VARCHAR(255),
                                  skills_3 VARCHAR(255),
                                  skills_4 VARCHAR(255),
                                  skills_5 VARCHAR(255),
                                  contact_email VARCHAR(255),
                                  contact_phone VARCHAR(50)
);

-- Inserción de los datos de John Doe
INSERT INTO curriculum_vitae (
    dni, name, profile, experience_1_position, experience_1_company, experience_1_description,
    experience_2_position, experience_2_company, experience_2_description,
    experience_3_position, experience_3_company, experience_3_description,
    experience_4_position, experience_4_company, experience_4_description,
    education_1_degree, education_1_institution, education_1_description,
    education_2_degree, education_2_institution, education_2_description,
    education_3_degree, education_3_institution, education_3_description,
    skills_1, skills_2, skills_3, skills_4, skills_5,
    contact_email, contact_phone
) VALUES (
             '30052723', 'Hugo Gerardo Palet', 'Desarrollador de software con más de 5 años de experiencia en la industria tecnológica, especializado en desarrollo web y aplicaciones móviles.',
             'Senior Software Engineer', 'Tech Solutions Inc.', 'Responsable del desarrollo y mantenimiento de aplicaciones web, liderando un equipo de desarrolladores y mejorando la eficiencia del código.',
             'Full Stack Developer', 'Innovative Apps LLC', 'Desarrollé aplicaciones web y móviles utilizando tecnologías modernas, mejorando la experiencia del usuario y optimizando el rendimiento.',
             'Software Engineer', 'Creative Minds Co.', 'Participé en el diseño y desarrollo de sistemas internos, colaborando estrechamente con los equipos de diseño y producto.',
             'Junior Developer', 'StartUp Hub', 'Trabajé en el desarrollo de proyectos innovadores, aprendiendo y aplicando nuevas tecnologías en el proceso.',
             'Máster en Ciencias de la Computación', 'Universidad de Tecnología', 'Enfoque en desarrollo de software y sistemas avanzados.',
             'Licenciatura en Ingeniería Informática', 'Universidad Nacional', 'Formación en fundamentos de la informática y desarrollo de software.',
             'Diploma en Desarrollo Web', 'Academia de Tecnología', 'Curso intensivo en desarrollo web moderno y tecnologías emergentes.',
             'Desarrollo web (HTML, CSS, JavaScript, React, Angular)',
             'Desarrollo de aplicaciones móviles (React Native, Flutter)',
             'Backend (Node.js, Python, Ruby on Rails)',
             'Base de datos (MySQL, PostgreSQL, MongoDB)',
             'Control de versiones (Git, GitHub, Bitbucket)',
             'palet.gerardo@correo.com', '+123456789'
         );
