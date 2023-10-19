import com.tengzhe.jooq.data.uc.Tables;
import org.jooq.DSLContext;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;

/**
 * Created on 2022/4/21
 *
 * @author liyifei
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(Tables.ACCOUNT.getIdentity());


        DSLContext dsl=new DefaultDSLContext(new DefaultConfiguration());


    }
}
