import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ElasticFiller  {

    private List<ElasticBean> objectListFromJson = new ArrayList<>();

    public List<ElasticBean> getObjectListFromJson() {
        try{

            JsonParser jParser = new JsonFactory().createParser(new File("elastic-data.json"));

            ElasticBean eBean = new ElasticBean();






        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return objectListFromJson;
    }

}
