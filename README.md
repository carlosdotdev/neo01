<h1 align="center"> Avaliação De Proficiência - Área Técnica - Neomind</h1>

<h3>O Problema:</h3>
<h3> Escreva um programa onde, dado um determinado horário, ele seja capaz de calcular o ângulo entre os 2 ponteiros do relógio.</h3>
<hr>
<h4>Ao iniciar o processo de elaboração, me deparo com a seguinte situação::</h4>
<img src="https://github.com/carlosdotdev/neo01/blob/master/pics/pic06.jpg">

00:15 é diferente de 45.
<img src="https://github.com/carlosdotdev/neo01/blob/master/pics/pic05.jpg">

<h4>Fiquei durante um tempo tentando entender. Por que usar a tipagem long? Sendo que, para obter o ângulo, só hora e minuto já serve e ambos não chegam a ser tão extensos a ponto de precisar de um endereço de memória tão espaçoso assim.
</h4>
<h4>Os únicos dois métodos que retornam long dentro do objeto de GregorianCalendar, me retornava um valor absurdamente grande em milissegundos, desde 1970.
</h4>
<h4>No final decidi não usar esses métodos, por questão de não me retornar apenas hora e minuto como desejado.
</h4>
<img src="https://github.com/carlosdotdev/neo01/blob/master/pics/pic02.jpg">
<img src="https://github.com/carlosdotdev/neo01/blob/master/pics/pic01.jpg">
<h4>Além, é claro, de métodos que atendiam o meu requisito, mas retornava um valor não confiável e a IDE os apontava como métodos descontinuados do GregorianCalendar na JDK que eu uso, e aconselhava o uso da class Calendar para o serviço.</h4>
<img src="https://github.com/carlosdotdev/neo01/blob/master/pics/pic03.jpg">
<h4>Optei por usar no lugar, a class Calendar.</h4>

<h4>Para obter o ângulo a partir de dois ponteiros, elaborei uma expressão algébrica.</h4>
<img src="https://github.com/carlosdotdev/neo01/blob/master/pics/pic04.jpg">
<h4>A partir daí, consigo obter o ângulo em cima da hora retornada pelo Calendar ou dado ao parâmetro no método.</h4>
<h4>OBS1: Quando o valor for negativo, o ponteiro das horas vai estar antes do ponteiro dos minutos.</h4>
<h4>OBS2: Quando dado uma determinada hora; por exemplo: 12:30. O ângulo não será exatamente 180°, pois a cada 60min, o ponteiro de hora se desloca 30°. Nesse exemplo, se deslocando 15°
.</h4>
<h4>Resultando em: 165°.</h4>
<h4>Para obter essa precisão citada acima, mude o valor dentro do método calculaAngulo, de -6 para -5.5
.</h4>
