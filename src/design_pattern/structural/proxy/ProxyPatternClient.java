package design_pattern.structural.proxy;

public class ProxyPatternClient {
    public static void main(String[] args){
        OfficeInternetAccess access = new ProxyInternetAccess("Mahdad");
        access.grantInternetAccess();  
    }  
}
