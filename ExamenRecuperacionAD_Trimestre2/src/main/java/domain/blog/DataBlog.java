package domain.blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataBlog {
    public static List<Blog> blogs(){
        List<Blog> listaClientes = new ArrayList<>();
        listaClientes.add(new Blog("Blog de Pablo","Cocina","https://blogdePablo.com",new Date(2022,2,5)));
        listaClientes.add(new Blog("Blog de Antonio","Jardinería","https://blogdeAntonio.com",new Date(2021,8,27)));
        listaClientes.add(new Blog("Blog de Juan","Programacion","https://blogdeJuan.com",new Date(2000,11,20)));
        listaClientes.add(new Blog("Blog de Maria","Mecanica","https://blogdeMaria.com",new Date(2023,7,11)));
        listaClientes.add(new Blog("Blog de Juana","Ingenieria","https://blogdeJuana.com",new Date(1999,1,1)));

        return listaClientes;
    }
}
