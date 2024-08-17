# Projeto Loja Virtual


 
 #### spring.application.name=loja_virtual_mentoria
 -  Nome da aplicação

 #### spring.datasource.url=jdbc:postgresql://localhost:5432/loja_virtual_mentoria
 -  URL de conexão com o banco de dados PostgreSQL

 #### spring.datasource.username=postgres
 -  Nome de usuário do banco de dados

 #### spring.datasource.password=postgres
 -  Senha do banco de dados

 #### spring.datasource.driver-class-name=org.postgresql.Driver
 -  Driver JDBC para PostgreSQL

 #### spring.datasource.platform=postgres
 -  Plataforma do banco de dados

 #### spring.jpa.hibernate.ddl-auto=update
 -  Estratégia de geração do esquema do banco de dados

 #### spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults=true
 -  Usar metadados JDBC por padrão

 #### spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect
 -  Dialeto do banco de dados para Hibernate

 #### spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
 -  Dialeto específico do PostgreSQL para Hibernate

 #### server.servlet.context-path=/loja_virtual_mentoria
 -  Caminho de contexto da aplicação

 #### spring.servlet.multipart.max-file-size=10000KB
 -  Tamanho máximo de arquivo para upload

 #### spring.servlet.multipart.max-request-size=10000KB
 -  Tamanho máximo da requisição para upload

 #### spring.servlet.multipart.enabled=true
 -  Habilitar suporte a multipart

 #### server.compression.enabled=true
 -  Habilitar compressão de resposta

 #### server.compression.mime-types=text/html,text/xml,text/plain,text/css,text/javascript,application/javascript,application/json
 -  Tipos MIME para compressão

 #### server.compression.min-response-size=1024
 -  Tamanho mínimo da resposta para compressão

 #### server.http2.enabled=true
 -  Habilitar HTTP/2

 #### spring.http.encoding.charset=UTF-8
 -  Charset padrão para codificação HTTP

 #### spring.http.encoding.enabled=true
 -  Habilitar codificação HTTP

 #### spring.http.encoding.force=true
 -  Forçar codificação HTTP

 #### spring.http.encoding.force-request=true
 -  Forçar codificação HTTP na requisição

 #### spring.http.encoding.force-response=true
 -  Forçar codificação HTTP na resposta

 #### spring.datasource.type=com.zaxxer.hikari.HikariDataSource
 -  Tipo de datasource (HikariCP)

 #### spring.datasource.hikari.connection-timeout=20000
 -  Tempo limite para conexão (ms)

 #### spring.datasource.hikari.minimum-idle=200
 -  Número mínimo de conexões ociosas

 #### spring.datasource.hikari.maximun-pool-size=550
 -  Tamanho máximo do pool de conexões

 #### spring.datasource.hikari.idle-timeout=10000
 -  Tempo limite para conexões ociosas (ms)

 #### spring.datasource.hikari.pool-name=PoolHikari
 -  Nome do pool de conexões

 #### spring.datasource.dbcp2.pool-prepared-statements=true
 -  Habilitar pool de prepared statements

 #### spring.datasource.dbcp2.max-open-prepared-statements=550
 -  Número máximo de prepared statements abertos

 #### spring.datasource.hikari.auto-commit=false
 -  Desabilitar auto-commit

 #### server.servlet.session.timeout=240m
 -  Tempo limite da sessão (minutos)

 #### spring.transaction.roolback-on-commit-failure=true
 -  Reverter transação em caso de falha no commit

 #### spring.jpa.properties.hibernate.jdnc.batch_size=4
 -  Tamanho do lote JDBC

 #### spring.jpa.properties.hibernate.order_inserts=true
 -  Ordenar inserts

 #### spring.jpa.properties.hibernate.order_updates=true
 -  Ordenar updates

 #### server.tomcat.max-connections=50000
 -  Número máximo de conexões no Tomcat

 #### server.tomcat.min-spare-threads=1000
 -  Número mínimo de threads ociosas no Tomcat

 #### spring.session.jdbc.cleanup-cron=0 0 4 * * *
 -  Cron para limpeza de sessões JDBC

 #### spring.mvc.static-path-pattern=/resources/static/**
 -  Padrão de caminho para recursos estáticos
  

  
  
