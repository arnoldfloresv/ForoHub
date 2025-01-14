﻿# ForoHub

esumen de la Funcionalidad del Proyecto Foro Hub
Foro Hub es una aplicación web basada en API RESTful, desarrollada con Java y Spring Boot. Su propósito es proporcionar una plataforma de foros en la que los usuarios pueden crear, discutir y responder a temas relacionados con cursos.

Funcionalidades Principales
Gestión de Usuarios:

Registro de nuevos usuarios.
Autenticación de usuarios mediante Spring Security y JWT.
Obtener una lista de usuarios, actualizar información de usuario, y obtener detalles de un usuario específico.
Gestión de Temas:

Crear nuevos temas con título, mensaje, estado, usuario y curso asociados.
Obtener una lista de temas.
Obtener los detalles de un tema específico.
Eliminar temas por ID.
Gestión de Respuestas:

Crear respuestas a temas existentes, especificando si la respuesta es una solución.
Obtener una lista de respuestas.
Obtener detalles de una respuesta específica.
Actualizar respuestas existentes.
Eliminar respuestas por ID.
Seguridad:

Uso de JWT para autenticar y autorizar usuarios.
Protección de endpoints, permitiendo acceso solo a usuarios autenticados.
Exposición de ciertos endpoints (registro y autenticación) sin necesidad de autenticación.
Documentación API:

Integración con Swagger para proporcionar una interfaz de usuario para la documentación y prueba de los endpoints de la API.
Base de Datos:

Conexión a una base de datos MySQL para almacenar y gestionar los datos.
Tablas: course, status, profile, user, topic, response.
Herramientas y Requisitos
Java 17 JDK: Plataforma de desarrollo.
Maven: Herramienta de gestión de dependencias y construcción del proyecto.
Spring Boot: Framework para simplificar el desarrollo de aplicaciones Java.
Spring Security con JWT: Para la gestión de seguridad y autenticación.
Swagger: Para la generación de documentación de la API.
MySQL: Base de datos utilizada para almacenar los datos del foro.
IntelliJ IDEA: IDE recomendado para el desarrollo del proyecto.
Insomnia: Herramienta para probar y consumir APIs RESTful.
MySQL Workbench: Para la gestión y administración de la base de datos.
Endpoints
Controlador de Usuarios:

GET /users: Obtiene una lista de usuarios.
PUT /users/{id}: Actualiza un usuario.
GET /users/{id}: Obtiene detalles de un usuario.
Controlador de Temas:

GET /topics: Obtiene una lista de temas.
POST /topics: Crea un nuevo tema.
GET /topics/{id}: Obtiene detalles de un tema.
DELETE /topics/{id}: Elimina un tema.
Controlador de Respuestas:

POST /responses: Publica una respuesta.
GET /responses: Obtiene una lista de respuestas.
GET /responses/{id}: Obtiene detalles de una respuesta.
PUT /responses/{id}: Modifica una respuesta.
DELETE /responses/{id}: Elimina una respuesta.
Controlador de Registro:

POST /register: Registra un nuevo usuario.
Controlador de Autenticación:

POST /authenticate: Autentica un usuario y devuelve un token JWT.
