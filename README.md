

spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = true
 -Esta configuração é útil em situações onde o Hibernate precisa de informações
  dicionais do banco de dados para configurar corretamente o ambiente de execução.
  
  
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect
 -é usada para especificar o dialeto do banco de dados que o Hibernate deve usar.
  O dialeto informa ao Hibernate como gerar o SQL específico para o banco de dados PostgreSQL versão 9.
  
  
server.servlet.context-path=/loja_virtual_mentoria
  -usada para definir o caminho de contexto da aplicação web no Spring Boot
  -a configuração de diferentes caminhos de contexto é frequentemente usada em arquiteturas de microsserviços. Cada microsserviço pode ser configurado com um caminho de contexto único, permitindo que múltiplos serviços sejam hospedados no mesmo servidor sem conflitos de URL.
  

  
  


