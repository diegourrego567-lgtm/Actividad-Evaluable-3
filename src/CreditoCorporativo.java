public class CreditoCorporativo{
    private String Id ;
    private double montoPrestado;
    private double saldoPendiente; 
    private double tasaInteres;
    private boolean esResgioso;
 
    
    public CreditoCorporativo(String Id,double montoPrestado,double tasaInteres) {
        this.Id= Id;
        this.montoPrestado=montoPrestado;
        this.saldoPendiente=montoPrestado;
        this.tasaInteres=tasaInteres;
        this.esResgioso=false;
        
    }
    public CreditoCorporativo(String Id,double montoPrestado,double tasaInteres,double saldoPendiente) {
        this.Id= Id;
        this.montoPrestado= montoPrestado;
        this.saldoPendiente= saldoPendiente;
        this.tasaInteres= tasaInteres;
        this.esResgioso= false;
    }
    public CreditoCorporativo(String Id,double montoPrestado) {
        this.Id= Id;
        this.montoPrestado=montoPrestado;
        this.saldoPendiente=montoPrestado;
        this.tasaInteres=1.5;
        this.esResgioso=false;
    }

    public void SetsaldoPendiente(double saldoPendiente){
        if(saldoPendiente< 0){
            System,out.print("Error");
        }else{
            this.saldoPendiente=saldoPendiente;
        }
         
    }

}
