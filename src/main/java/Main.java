/**
 * Created by User on 22.05.2016.
 */
public class Main {
    public static void main (String[] args) {

        ElasticFiller ef = new ElasticFiller();


        System.out.println(ef.getObjectArrayListFromJson().size());

        System.out.println(ef.gettterObjectArrayListFromJson().get(994).getId());
        System.out.println(ef.gettterObjectArrayListFromJson().get(995).getGender());
        System.out.println(ef.gettterObjectArrayListFromJson().get(996).getFirst_name());
        System.out.println(ef.gettterObjectArrayListFromJson().get(997).getLast_name());
        System.out.println(ef.gettterObjectArrayListFromJson().get(998).getEmail());
        System.out.println(ef.gettterObjectArrayListFromJson().get(999).getIp_address());
    }
}
