public class GestorDeCobranza {

    public void intentarLiquidacionMaliciosa(CreditoCorporativo c){

        c.abonarCapital(-100);
    }

    public void aplicarAliviioFinanciero(CreditoCorporativo c){
         double saldoActual= c.GetsaldoPendiente();
         double mitad= saldoActual*0.5;

         c.abonarCapital(mitad);
         System.out.println("Alivio aplicado correctamente");
    }
}
