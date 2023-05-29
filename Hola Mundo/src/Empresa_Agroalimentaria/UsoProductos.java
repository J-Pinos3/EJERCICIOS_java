package Empresa_Agroalimentaria;

public class UsoProductos {
    public static void main(String[] args) {



        Productos_Frescos p_1 = new Productos_Frescos(20.35, "045", 2017, 05, 28, "Ecuador",3);

        Productos_Refriguerados p_2 = new Productos_Refriguerados(10.49, "9870", 2019, 01, 12, "Ecuador",5,"1028",15.7);

        Producto_Congelado p_3 = new congeladoNitrogeno(17.13, "0598", 2019, 04, 30, "Estados Unidos",7, 10.34,
                "Congelación con nitrógeno líquido", 236);
        congeladoNitrogeno prodNitro = (congeladoNitrogeno)p_3;

        System.out.println(p_1.descripcionProducto()+"\n\n");

        System.out.println(p_2.descripcionProducto() + "\n\n");

        System.out.println(p_3.descripcionProducto() + "\n" + p_3.composicionCongelado());
        System.out.println(">"+prodNitro.descripcionProducto() + "\n" + prodNitro.composicionCongelado());

        System.out.println("\n\n-----------------------------------------------------------------\n\n");

        ProductoAgro[] prods = new ProductoAgro[4];

        prods[0] = new Productos_Frescos(20.35, "045", 2017, 05, 28, "Ecuador",3);
        prods[1] = new Productos_Refriguerados(10.49, "9870", 2019, 01, 12, "Ecuador",5,"1028",15.7);
        prods[2] = new congeladoNitrogeno(17.13, "0598", 2019, 04, 30, "Estados Unidos",7, 10.34, "Congelación con nitrógeno líquido", 236);
        prods[3] = new congeladoAgua(9.48,"4569", 2022,6,7,"Finlandia",2,4.79,3);



        for(int i = 0; i < prods.length; i++){
            /*
            System.out.println(prods[i].descripcionProducto()+"\n");
            if(i == 2){
                congeladoNitrogeno nitro = (congeladoNitrogeno) prods[2];
                System.out.println(nitro.composicionCongelado());
            }
            */
            if(i != 2) {
                System.out.println(prods[i].descripcionProducto() + "\n");
            }else{
                congeladoNitrogeno nitro = (congeladoNitrogeno) prods[2];
                System.out.println(nitro.composicionCongelado() + "  -  " + nitro.descripcionProducto());

            }

        }




    }
}
