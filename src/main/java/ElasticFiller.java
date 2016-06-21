import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ElasticFiller  {

    private List<elasticBean> objectListFromJson = new ArrayList<>();

    public List<elasticBean> getObjectListFromJson() {
        try{

            JsonParser jParser = new JsonFactory().createParser(new File("elastic-data.json"));

            elasticBean eBean = new elasticBean();






        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return objectListFromJson;
    }

}
