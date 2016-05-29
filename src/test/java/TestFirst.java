import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by User on 22.05.2016.
 */

public class TestFirst {

    private First f;

    @BeforeClass
    public void initialize(){
        f = new First();
    }

    @Test
    public void addNTest(){
        Assert.assertTrue(11 == f.addN(5, 6));
    }

    @Test
    public void minNTest(){
        Assert.assertTrue(1 == f.minN(7, 6));
    }
    @Test
    public void umnNTest(){
        Assert.assertTrue(30 == f.umnN(5, 6));
    }
    @Test
    public void delNTest(){
        Assert.assertTrue(2 == f.delN(12, 6));
    }

}
