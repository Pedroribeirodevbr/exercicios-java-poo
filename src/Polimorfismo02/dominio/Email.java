package Polimorfismo02.dominio;

public class Email implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Seu pedido foi aprovado!");
    }
}
