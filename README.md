# Acceso-a-Datos

## MariaDB con Docker

1. Copia `.env.example` como `.env` y cambia las contraseñas.
2. Desde la raíz del proyecto, ejecuta `docker compose up -d --build`.
3. En Docker Desktop, abre **Containers** para ver el contenedor `mariadb`.

MariaDB queda disponible en `localhost:3306`. La base de datos inicial es `mi_app` y el volumen `mariadb_data` conserva los datos aunque se recree el contenedor. Para detenerlo, ejecuta `docker compose down`.