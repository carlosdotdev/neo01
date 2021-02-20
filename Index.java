
// Classe semelhante ao GregorianCalendar
import java.util.Calendar;

class RelogioAnalogico {
    // atributos para utilizar durante os métodos
    private int hora;
    private int minuto;
    private double angulo;

    // construtor com a finalidade de deixar o objeto com a configuração padrão, a
    // partir do horário do sistema.
    public RelogioAnalogico() {
        Calendar calendar = Calendar.getInstance();

        this.hora = calendar.get(Calendar.HOUR);
        this.minuto = calendar.get(Calendar.MINUTE);
        this.configuraAnguloRelogio(this.hora, this.minuto);
    }

    // Função que chama outra função para atribuir ao atributo angulo,
    // a expressão necessária para gerar o angulo.
    public void configuraAnguloRelogio(int hora, int minuto) {
        this.angulo = this.calculaAngulo(hora, minuto);
    }

    public double retornaAnguloRelogio() {
        return this.angulo;
    }

    // Função que retorna uma expressão que calcula o angulo | Â = 30h-6m
    private double calculaAngulo(int hora, int minuto) {
        return ((30 * hora) + (-6 * minuto));
    }

    // Função que retorna o angulo formatado
    public String formataParaGrau(double angulo) {
        return angulo + "°";
    }

    public void ExibiAngulo() {
        System.out.println(this.formataParaGrau(this.angulo));
    }
}

public class Index {
    public static void main(String[] args) {
        RelogioAnalogico relogio = new RelogioAnalogico();

        // relogio.configuraAnguloRelogio(12, 30);
        relogio.ExibiAngulo();
    }
}
