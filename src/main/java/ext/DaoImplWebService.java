package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao3")
public class DaoImplWebService implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp=1000;
        return temp;
    }
}
