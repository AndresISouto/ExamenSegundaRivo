# ExamenSegundaRivo

<https://github.com/AndresISouto/ExamenSegundaRivo>

## Preguntas Seguridad

1 ¿Cuál es la función principal del SecurityContextHolder en la arquitectura de Spring Security?

- b) Es el "bolsillo" donde se guardan los detalles del usuario autenticado actualmente para el hilo de ejecución.

2 En un sistema basado en JWT, ¿por qué se dice que la arquitectura es "Stateless" (sin estado)?

- b) Porque el servidor no guarda sesiones; el usuario presenta un "pasaporte digital" (token) en cada petición.

3 ¿Qué componente es el encargado de buscar a un usuario en la base de datos por su username para entregárselo al proveedor de autenticación?

- c) UserDetailsService.

4 ¿Por qué es seguro deshabilitar la protección CSRF (csrf.disable()) en una API REST que solo usa JWT?

- b) Porque las APIs REST no usan Cookies automáticas y el navegador no añade la cabecera "Authorization" por su cuenta.
