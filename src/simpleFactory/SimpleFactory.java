package simpleFactory;
public class SimpleFactory {
    static MobilePhone ph;
    public static MobilePhone CreatePhone(String phonename)//传参
    {
        switch (phonename)
        {
            case "Iphone4S":
                ph = new Iphone4S(); 
                break;
            case "GalaxyNote2":
                ph = new GalaxyNote2();
                break;
            default:
                break;
        }
        return ph;
    }
 
}