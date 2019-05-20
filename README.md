# Computación orientada a servicio
Es una app para crear un Web Service para Registro de reciclado utilizando Java EE, Apache Tomcat 7 y Axis 2


![Imagen de ejemplo de la aplicación final](https://github.com/yamil16/App-para-la-gestion-del-reciclado-javaEE-ApachaTomcat-Axis2/Imagenes/ServicioExample.png)

Los servicios implementados son:
•Registra un usuario(User)::User
•Agregar un reciclaje a un usuario(username, UserRecycling)::UserRecycling
•Obtener todos los reciclajes de un usuario::List<UserRecycliny>.  
•Obtener el total reciclado::Recycling

Las tablas creadas en la base de dato fueron las siguientes:

Un Usuario (User) 
•id-Long 
•firstName– String
•lastName– String
•username- String
•address– String
•mail– double

Reciclaje x  Usuario (UserRecycling) 
•id-Long 
•User - User
•bottles, tetrabriks, glass, paperboard, cans– Integer
•date – Date

Total Reciclado(Recycling) 
•bottles, tetrabriks, glass, paperboard, cans– Integer
•toneladas - float