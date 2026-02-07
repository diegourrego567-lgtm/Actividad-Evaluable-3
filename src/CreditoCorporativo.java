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

    public void SetsaldoPendiente(double saldoPendiente){
        if(saldoPendiente< 0){
            System.out.println("Error");
        }else{
            this.saldoPendiente=saldoPendiente;
        }
         
    }

}
