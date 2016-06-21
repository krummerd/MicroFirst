import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ElasticFiller {

    private List<elasticBean> objectListFromJson = new ArrayList<>();

    JsonParser jParser = new JsonFactory();

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
