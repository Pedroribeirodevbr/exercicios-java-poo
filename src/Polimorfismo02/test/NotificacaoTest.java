package Polimorfismo02.test;

import Polimorfismo02.dominio.Email;
import Polimorfismo02.dominio.Notificacao;
import Polimorfismo02.dominio.SMS;
import Polimorfismo02.dominio.WhatsApp;

public class NotificacaoTest {

    public static void main(String[] args) {
        Email email = new Email();
        SMS sms = new SMS();
        WhatsApp wpp = new WhatsApp();

        Notificacao[] notificacoes = {email, sms, wpp};

        System.out.println("Projeto rodando no Eclipse com sucesso!");
    }
}