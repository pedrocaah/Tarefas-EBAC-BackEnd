public class Programa {
    public static void main(String args[]) {

        Sedan sedan = new Sedan();
        sedan.setAno(2017);
        sedan.setModelo("Civic");
        sedan.setCambio("Automático");
        sedan.setCombustivel("Gasolina");
        sedan.setCor("Preto");
        sedan.setPotencia(2.0d);
        System.out.println("Específicações Sedan:"+"Modelo: "+sedan.getModelo()+" Ano: "+sedan.getAno()+" Tipo Combustível: "+
                sedan.getCombustivel()+" Potência Motor: "+sedan.getPotencia()+" Cor: "+sedan.getCor()+" Tipo de Câmbio: "+sedan.getCambio());

        SUV suv = new SUV();
        suv.setAno(2020);
        suv.setModelo("Tiggo 2");
        suv.setCambio("Automático");
        suv.setCombustivel("Flex");
        suv.setCor("Prata");
        suv.setPotencia(1.5d);
        System.out.println("Específicações Sedan:"+"Modelo: "+suv.getModelo()+" Ano: "+suv.getAno()+" Tipo Combustível: "+
                suv.getCombustivel()+" Potência Motor: "+suv.getPotencia()+" Cor: "+suv.getCor()+" Tipo de Câmbio: "+suv.getCambio());

        Hatch hatch = new Hatch();
        hatch.setAno(2014);
        hatch.setModelo("Sandero");
        hatch.setCambio("Manual");
        hatch.setCombustivel("Flex");
        hatch.setCor("Preto");
        hatch.setPotencia(1.6d);
        System.out.println("Específicações Sedan:"+"Modelo: "+hatch.getModelo()+" Ano: "+hatch.getAno()+" Tipo Combustível: "+
                hatch.getCombustivel()+" Potência Motor: "+hatch.getPotencia()+" Cor: "+hatch.getCor()+" Tipo de Câmbio: "+hatch.getCambio());

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setAno(2023);
        caminhonete.setModelo("Hillux");
        caminhonete.setCambio("Automático");
        caminhonete.setCombustivel("Diesel");
        caminhonete.setCor("Branca");
        caminhonete.setPotencia(4.0d);
        System.out.println("Específicações Sedan:"+"Modelo: "+caminhonete.getModelo()+" Ano: "+caminhonete.getAno()+" Tipo Combustível: "+
                caminhonete.getCombustivel()+" Potência Motor: "+caminhonete.getPotencia()+" Cor: "+caminhonete.getCor()+
                " Tipo de Câmbio: "+caminhonete.getCambio());
    }
}
