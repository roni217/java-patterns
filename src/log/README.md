#  LOG4J

Para usarmos o log4j precisamos do jar do log4j e de um arquivo de configura��o, que pode ser .properties ou .xml. Basicamente, escrevemos em nossas classes uma linha de c�digo para obtermos um Logger e, de posse deste, chamamos os m�todos que escrevem as mensagens.

Para inicializar seu log, utilizamos a f�brica Logger.getLogger, que, dada uma String (a categoria do log), devolve um Logger. � comum usarmos a sobrecarga desse m�todo que recebe um class como argumento:

## Vantagens de Usar o LOG4J

Usar o log4j � uma forma de obter informa��es sobre o fluxo de execu��o de nossso programa, sem recorrer ao debug ou ao sysout. Boas APIs de log nos permitem ativar/desativar sem alterar c�digo, pode ser persistido em algum lugar (arquivos, BD etc) e ainda podemos controlar o n�vel de informa��es que queremos ver (desde bem detalhadas a ver apenas os erros que acontecem).
 
### N�veis de logs
H� diversos n�veis de log dispon�veis, inclusive a possibilidade de se criar os pr�prios n�veis (o que n�o � muito recomendado). Os que vem por padr�o no Log4J s�o:
- TRACE
- DEBUG
- INFO
-  WARN
- ERROR
- FATAL

## Bibliografia
http://www.caelum.com.br/apostila-java-testes-xml-design-patterns/apendice-logging-com-log4j/#12-1-usando-logs-log4j