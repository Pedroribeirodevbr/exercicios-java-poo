package Encapsulamento.Dominio;

public class Treino {
    private String tipoExercicio;  //ex jiu jitsu, corrida etc..
    private int duracaoMinutos;
    private double caloriaPorMinuto;

    static { //Aprendendo na pratica a usar o bloco de inicialização estatico
        System.out.println("Treinos do Pedro");
        System.out.println();
    }

    public Treino(String tipoExercicio, double caloriaPorMinuto) {
        this.tipoExercicio = tipoExercicio;
        this.duracaoMinutos = 0;
        this.caloriaPorMinuto = caloriaPorMinuto;
    }

    public String getTipoExercicio() {
        return tipoExercicio;
    }

    public void setTipoExercicio(String tipoExercicio) {
        this.tipoExercicio = tipoExercicio;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public double getCaloriaPorMinuto() {
        return caloriaPorMinuto;
    }

    public void setCaloriaPorMinuto(double caloriaPorMinuto) {
        if (caloriaPorMinuto <= 0) {
            System.out.println("Impossível queimar menos de 0 Kcal por minuto");
        }
        this.caloriaPorMinuto = caloriaPorMinuto;
    }

    public void registrarTempo(int minutos){
       if (minutos > 0) {
           this.duracaoMinutos = this.duracaoMinutos+minutos;
           System.out.println("Tempo de treino adicionado: " + minutos + " min");

       }else{
           System.out.println("Tempo inválido, informe um valor maior que 0!");

       }
    }

    public double calcularCaloriasQueimadas(){
        return caloriaPorMinuto * duracaoMinutos;
    }
    public void exibirResumoTreino(){
        System.out.println("Tipo: " + tipoExercicio);
        System.out.println("Duração acumulada: " + duracaoMinutos +  " min");
        System.out.println("Kcal por minuto: "+ caloriaPorMinuto + " Kcal");
        System.out.println("Total de Kcal queimadas: "+ calcularCaloriasQueimadas() + " Kcal");
    }




}
