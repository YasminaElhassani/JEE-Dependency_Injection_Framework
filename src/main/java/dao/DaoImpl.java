package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {

        //Se connecter à la BD et récupérer la température
        System.out.println("Version Base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
