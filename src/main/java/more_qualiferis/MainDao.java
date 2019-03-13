package more_qualiferis;

import org.springframework.stereotype.Repository;

import static more_qualiferis.DBType.HDFS;
import static more_qualiferis.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@CadsDao(HDFS)
public class MainDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving to HDFS");
    }
}
