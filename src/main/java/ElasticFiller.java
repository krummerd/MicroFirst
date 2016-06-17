import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmytro.krummer on 17.06.2016.
 */
public class ElasticFiller {

    private List<elasticBean> objectListFromJson = new ArrayList<>();

    JsonFactory jf = new JsonFactory();

    try{

    } catch (JsonGenerationException e) {
        e.printStackTrace();
    } catch (JsonMappingException e){
        e.printStackTrace();
    } catch (IOException e){
        e.printStackTrace();
    }
    public List<elasticBean> getObjectListFromJson() {
        return objectListFromJson;
    }

    public void setObjectListFromJson(List<elasticBean> objectListFromJson) {
        this.objectListFromJson = objectListFromJson;
    }
}
