#  LOG4J

Para usarmos o log4j precisamos do jar do log4j e de um arquivo de configuração, que pode ser .properties ou .xml. Basicamente, escrevemos em nossas classes uma linha de código para obtermos um Logger e, de posse deste, chamamos os métodos que escrevem as mensagens.

Para inicializar seu log, utilizamos a fábrica Logger.getLogger, que, dada uma String (a categoria do log), devolve um Logger. É comum usarmos a sobrecarga desse método que recebe um class como argumento:

## Vantagens de Usar o LOG4J

Usar o log4j é uma forma de obter informações sobre o fluxo de execução de nossso programa, sem recorrer ao debug ou ao sysout. Boas APIs de log nos permitem ativar/desativar sem alterar código, pode ser persistido em algum lugar (arquivos, BD etc) e ainda podemos controlar o nível de informações que queremos ver (desde bem detalhadas a ver apenas os erros que acontecem).
 
### Níveis de logs
Há diversos níveis de log disponíveis, inclusive a possibilidade de se criar os próprios níveis (o que não é muito recomendado). Os que vem por padrão no Log4J são:
- TRACE
- DEBUG
- INFO
-  WARN
- ERROR
- FATAL

## Bibliografia
http://www.caelum.com.br/apostila-java-testes-xml-design-patterns/apendice-logging-com-log4j/#12-1-usando-logs-log4j