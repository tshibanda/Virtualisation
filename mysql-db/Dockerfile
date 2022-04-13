FROM mysql

ENV MYSQL_ROOT_HOST="%"
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_ALLOW_EMPTY_PASSWORD=true
ENV MYSQL_USER=alexandre
ENV MYSQL_PASSWORD=bukasa
ENV MYSQL_DATABASE=webservice

COPY ./sql-scripts/ /docker-entrypoint-initdb.d/

COPY ./sql-scripts/dump.sql .
