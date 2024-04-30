# ITO_TAP_U2_COMPONENTE
# DESCRIPCION
Nuestro programa esta compuesto principalmente por dos componentes lo cuales se describiran mas extensamente a continuacion.

# Componente Log
Es una interfaz de usuario para iniciar sesión en una aplicación Java Swing. Incluye campos para introducir el correo electrónico y la contraseña, botones para mostrar u ocultar la contraseña, selección de idioma, y botones para interactuar como cerrar la aplicación o cambiar a la pantalla de creación de cuenta. Ofrece una experiencia de usuario interactiva con cambios visuales al interactuar con los elementos de la interfaz.

# Componente CrearCuentaComponente
Este componente gestiona la creación de cuentas nuevas. Dispone de campos para datos personales, selección del tipo de cuenta, y un sistema de cambio de idioma. También proporciona validación visual de los datos introducidos y botones para registrar la cuenta nueva o cerrar la ventana.

Ambos componentes están diseñados para ser visualmente interactivos y fáciles de integrar en sistemas más amplios que requieran autenticación y gestión de cuentas de usuario.

# USOS
1. Sistemas de Gestión de Usuarios en Aplicaciones Educativas o Institucionales:
Podrían ser parte de un sistema de gestión escolar o universitario donde estudiantes, personal docente y administrativo necesiten acceder a recursos específicos en línea.
Estos componentes permitirían a los usuarios registrarse, iniciar sesión, y ajustar configuraciones básicas como el idioma de la interfaz.

2. Plataformas de E-commerce:
En aplicaciones de comercio electrónico, donde la gestión de cuentas de usuario es crucial para procesar órdenes, gestionar direcciones de envío, y personalizar la experiencia de compra.
Los componentes permitirían a los usuarios crear cuentas nuevas, iniciar sesión para realizar y seguir pedidos, y modificar preferencias personales.

3. Aplicaciones Empresariales Internas:
En entornos corporativos, para sistemas internos de recursos humanos, gestión de proyectos, o sistemas de información interna.
Facilitarían la autenticación de empleados y la gestión de sus perfiles y accesos a diferentes módulos y recursos de la empresa.

4. Software de Servicio al Cliente:
Para aplicaciones que requieren que los agentes de servicio al cliente accedan a sistemas de tickets y gestión de consultas de clientes.
Los componentes ayudarían en la gestión de las credenciales de los agentes y en la personalización de la interfaz según las preferencias lingüísticas de los mismos.

5. Sistemas de Información de Salud:
En sistemas médicos y de salud para gestionar el acceso a información sensible del paciente, permitiendo a los profesionales de la salud registrar y autenticarse de manera segura.
Estos componentes asegurarían que solo personal autorizado pueda acceder a registros médicos confidenciales.

# CARACTERISTICAS
1. Manejo de Sesiones de Usuario:
Permiten el registro de nuevos usuarios y la autenticación de usuarios existentes, facilitando la gestión de accesos y la personalización de la experiencia del usuario.

2. Soporte Multilingüe:
Incluyen funcionalidad para cambiar el idioma de la interfaz, permitiendo adaptar la aplicación a diferentes idiomas y mejorar la accesibilidad para usuarios de diversas regiones.

3. Interacción Visual y Usabilidad:
Implementan una interfaz gráfica con elementos interactivos como botones que cambian de color al pasar el mouse, mejorando la experiencia visual y la usabilidad del usuario.

4. Seguridad de Datos:
Proveen campos para la entrada segura de contraseñas, con opciones para mostrar u ocultar la contraseña, lo que ayuda a proteger la información sensible del usuario.

5. Personalización y Configuración Flexible:
Ofrecen opciones para personalizar la experiencia del usuario según su rol (por ejemplo, usuario o personal) y preferencias personales, lo que aumenta la flexibilidad y adaptabilidad del componente a diferentes contextos de aplicación.

# REQUISITOS
1. Java Development Kit (JDK):
Instala la versión correcta del JDK, la misma con la que desarrollaste tus componentes. Por ejemplo, si usaste Java 19 para programar, asegúrate de tener ese JDK.
2. Un buen IDE:
Usa un ambiente de desarrollo como NetBeans, IntelliJ IDEA o Eclipse. Esto te hará la vida mucho más fácil para escribir y probar tu código. Asegúrate de que el IDE esté configurado para usar el JDK correcto.

3. Java Runtime Environment (JRE):
Necesitas tener instalado el JRE para ejecutar aplicaciones Java. Solo verifica que la versión del JRE sea la misma o más nueva que la del JDK con el que trabajaste.

4. Hardware:
Realmente no necesitas una supercomputadora para correr Java Swing, pero tener al menos 2GB de RAM y un procesador que no sea muy antiguo ayudará a que todo funcione suavemente.

5. Configura tu computadora:
Si estás en Windows, macOS o Linux, solo asegúrate de que tu sistema operativo esté actualizado y que las variables de entorno para Java estén bien configuradas, para que puedas correr Java desde cualquier lugar en tu terminal.

Extras para tener en cuenta:

Librerías adicionales:
Si tus componentes usan librerías externas, no olvides incluirlas en tu proyecto o configurar tu gestor de dependencias para que las maneje por ti.

Cuidado con las versiones:
Asegúrate de que todo lo que uses sea compatible entre sí para evitar dolores de cabeza.

# API
# Log
Descripción
La clase Log es un componente de interfaz gráfica que maneja el inicio de sesión de usuarios. Permite a los usuarios ingresar con su correo electrónico y contraseña, proporcionando también funcionalidad para mostrar/ocultar contraseñas y cambiar el idioma de la interfaz.

![trabajo](https://github.com/JONATHAN119M/ITO_TAP_U2_COMPONENTE/assets/168501580/dd62b0c6-4ecd-44e1-8460-f090c7d0c714)


# CrearCuentaComponente
Descripción
CrearCuentaComponente es un componente de interfaz gráfica para el registro de nuevos usuarios. Permite a los usuarios proporcionar su correo electrónico y contraseña, seleccionar su rol (usuario o personal), y opcionalmente ingresar un código de acceso si es personal.

![tra](https://github.com/JONATHAN119M/ITO_TAP_U2_COMPONENTE/assets/168501580/080f202f-ce2a-4b38-aeaa-33838fc066d8)


