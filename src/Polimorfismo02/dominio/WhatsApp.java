package Polimorfismo02.dominio;

public class WhatsApp implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Seu pedido foi aprovado!");
    }
}
