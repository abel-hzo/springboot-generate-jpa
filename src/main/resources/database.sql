    CREATE DATABASE IF NOT EXISTS mydatabase;
    USE mydatabase;

    CREATE TABLE IF NOT EXISTS Usuarios (
        id_usuario BIGINT PRIMARY KEY,
        username VARCHAR(70) UNIQUE NOT NULL,
        contrase VARCHAR(80) NOT NULL,
        email VARCHAR(50) NOT NULL,
        nacimiento DATE NOT NULL,
        foto MEDIUMBLOB,
        creado DATETIME NOT NULL
    ) ENGINE = INNODB;
    
   	CREATE TABLE IF NOT EXISTS Roles (
        id_rol INTEGER AUTO_INCREMENT PRIMARY KEY,
        rol VARCHAR(30) NOT NULL
    ) ENGINE = INNODB;
    
    INSERT INTO Roles(rol) VALUES('USER'), ('PREMIUM'), ('ADMIN');
    
    CREATE TABLE IF NOT EXISTS UsuariosRoles (
        id_usuariosroles BIGINT PRIMARY KEY,
        id_usuario BIGINT NOT NULL,
        id_rol INTEGER NOT NULL,
        creado DATETIME NOT NULL,
        FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario),
        FOREIGN KEY (id_rol) REFERENCES Roles(id_rol)
    ) ENGINE = INNODB;
    
    CREATE USER 'abelhzo'@'localhost' IDENTIFIED BY 'abcde';
    GRANT SELECT, INSERT, UPDATE, DELETE ON mydatabase.* TO 'abelhzo'@'localhost';
    SHOW GRANTS FOR 'abelhzo'@'localhost';
    FLUSH PRIVILEGES;
    EXIT;