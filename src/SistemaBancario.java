public class SistemaBancario {

    public static void main(String[] args) {
        


        CreditoCorporativo miCredito= new CreditoCorporativo("Corp-99",10000,0,05);

        for(int i=0; i < 5; i++){
            miCredito.capatalizarIntereses();
        }
        
        System.out.println("¿Es riesgoso?"+miCredito.esResgioso());
        System.out.println("Saldo antes del alivio: "+miCredito.GetsaldoPendiente());

        GestorDeCobranza gestor= new GestorDeCobranza();

        gestor.aplicarAliviioFinanciero(miCredito);

        System.out.println("Saldo despues del alivio: "+ miCredito.GetsaldoPendiente());
    }
}
