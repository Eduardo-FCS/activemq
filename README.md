# Alunos

- Brendon Augusto de Souza Nogueira;
- Eduardo Faria Caetano Silva.

# ActiveMQ

O ActiveMQ é um Message Broker multiprotocolo baseado em Java. Com ele podemos integrar aplicações usando o protocolo AMQP (Advanced Message Queuing Protocol) de enfileiramento de mensagens na camada de aplicação.

Ela é conceituada em três partes:

Producer – Responsáveis pela emissão de mensagens na queue (fila);
Consumer – Responsável por receber as mensagens da fila;
Queue - Fila onde as mensagens são publicadas.

Com isso ela garante a entrega confiável de mensagens entre componentes de software.

# Instalação 

Para fazer a instalação do activemq, é possível fazer de duas maneiras:

- Acessar o site e baixar o arquivo zipado através do link (https://activemq.apache.org/components/classic/download/);
- Utilizar contâiner do activemq.

Caso prefira fazer a instalação na sua máquina basta acessar o site, baixar o arquivo e então executar o arquivo activemq.bat nas pastas bin > win64.

Também é possível realizar através do Docker. Para isso, é necessário instalar o docker e efetuar os seguintes comandos:

docker pull rmohr/activemq

docker run -p 61616:61616 -p 8161:8161 rmohr/activemq

Após isso, basta então ir até um browser e escrever o seguinte caminho: localhost:8161.

Observação: Caso você esteja com docker no WSL, basta ir até a linha de comando e escrever: 

ip addr | grep inet

Depois, inserir o o segundo IP fornecido junto com a porta.

Utilizar um cliente REST de sua preferência e fazer um post no caminho: localhost:8080/api/producer/send. O corpo da mensagem deve possuir um message e um content, sendo ambos strings.


