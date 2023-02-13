// fabrica
public interface IFabricaCelular {
    void crearPartes();
    IParteHadware getParteHadware();
    IModelo getModelo();
}


// molde de la creacion
public interface IParteHadware{
    void crear();
    String getDatos();
}
public interface IModelo{
    void crear();
    String getNombre();
}


// creacion de las partes
public class plataformaMovil implements IParteHadware{
    @Override
    public void crear(){
    System.out.println("generando plataforma mobil ")
    }
    @Override
    public String getDatos(){
        System.out.println(   "Marca: Samsung  \t Modelo: Exynos 2200 \t Arquitectura: 64 bits \t Litografia: 4 nm  ")
}
}
public class Ram implements IParteHadware{
    @Override
    public void crear(){
    System.out.println("generando Ram")
    }
    @Override
    public String getDatos(){
        System.out.println(" Tipo: LPDDR5\t capacidad: 12 GB  " )
    }
}

public class Panel implements IParteHadware{
    @Override
    public void crear(){
    System.out.println("generando Panel")
    }
    @Override
    public String getDatos(){
        System.out.println("Tamaño: 6.8 pulgadas \t Resolucion: Quad HD +\t Tegnologia: Amoled \t Taza de refresco: 120 Hz" )
    }
}

public class ROM implements IParteHadware{
    @Override
    public void crear(){
    System.out.println("generando ROM")
    }
    @Override
    public String getDatos(){
        System.out.println( )
    }
}

public class Modelo implements IModelo{
    @Override
    public void crear(){
    System.out.println("Generando modelo")
    }
    @Override
    public String getNombre(){
        System.out.println("Modelo: Samsung s22 ultra")
    }
}
public class Modelo2 implements IModelo{
    @Override
    public void crear(){
    System.out.println("Generando modelo")
    }
    @Override
    public String getNombre(){
        System.out.println("Modelo: ONEPLUS 9")
    }
}




public class Fabricacelular implements IFabricaCelular{
    private IParteHadware hadware;
    private IParteHadware nombre;
    private static Scanner in = new Scanner (System.in);
    @Override
    public void crearPartes(){
        int opcion;
        System.out.println("fabricando  telefono");
        do{
             System.out.println("Seleccione parte de hadware que desea crear");
            System.out.println("1. plataforma mobil");
            System.out.println("2. Ram");
            System.out.println("3. Panel");
            System.out.println("4. Rom");
            opcion = in.nextInt();
        }while(opcion <1 || opcion >5);
        if(opcion==1){
            plataformaMoviL = new plataformaMovil();
        }
        else if(opcion == 2){
            Ram = new Ram();
        }
         else if(opcion == 3){
            Panel = new Panel();
        }
         else if(opcion == 4){
            Rom = new Rom();
        }
        IParteHadware.crear();

          do{
            System.out.println("Selecciones el Modelo");
            System.out.println("1. s22 ultra");
            System.out.println("2. oneplus 9");
            opcion = in.nextInt();
        }while(opcion < 1 || opcion>2);
        
        if(opcion == 1)
            modelo = new modelo();
        else
            modelo = new modelo2();
        
        Modelo.crear(); 
    }
    @Override
    public IParteHadware(){
        return IParteHadware;
    }
     @Override
    public IModelo(){
        return Modelo;
    }
}
public class Principal {

    
    public static void main(String[] args) {
        
        IFabrica miFabrica = new IFabricaCelular();
        
        miFabrica.crearPartes();
        IParteHadware miparte = miFabrica.getParteHadware();
        IModelo mimodelo = miFabrica.getModelo();
        System.out.println("Mi celular tiene: "+miparte.getDatos()+misabor.getInformacion());
    }
    




    }
    



