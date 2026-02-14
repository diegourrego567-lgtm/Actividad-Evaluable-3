public class CreditoCorporativo{
    private String id;
    private double montoPrestado;
    private double saldoPendiente; 
    private double tasaInteres;
    private boolean esResgioso;
 
    
    public CreditoCorporativo(String id,double montoPrestado,double tasaInteres) {
        this.id= id;
        this.montoPrestado=montoPrestado;
        this.saldoPendiente=montoPrestado;
        this.tasaInteres=tasaInteres;
        this.esResgioso=false;
        
    }
    public CreditoCorporativo(String id,double montoPrestado,double tasaInteres,double saldoPendiente) {
        this.id= id;
        this.montoPrestado= montoPrestado;
        this.saldoPendiente= saldoPendiente;
        this.tasaInteres= tasaInteres;
        this.esResgioso= false;
    }
    public CreditoCorporativo(String id,double montoPrestado) {
        this.id= id;
        this.montoPrestado=montoPrestado;
        this.saldoPendiente=montoPrestado;
        this.tasaInteres=1.5;
        this.esResgioso=false;
    }

    public double GetsaldoPendiente(){
        return saldoPendiente;
        
        }
        public boolean esResgioso(){
            return saldoPendiente> (montoPrestado*1.2);
        }

        public void abonarCapital (double cantidad){
            if (cantidad <=0){
                System.out.println("Error");
                return;
            }

            if (saldoPendiente-cantidad <0){
                System.out.println("Operacion rechazada");
                return;
            }
            saldoPendiente=saldoPendiente-cantidad;
           

        }
        public void capatalizarIntereses (){
            double Interes = saldoPendiente*tasaInteres;
            saldoPendiente = saldoPendiente+ Interes;

            if(esResgioso){
                System.out.println("Credito riesgoso");
            }


         
    }

}

